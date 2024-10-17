package clases;

import com.coti.tools.Esdia;

public class Almacen {
    private Libro[]  libros;
    private int librosAñadidos;

    public Almacen(int longitud) {
        this.libros = new Libro[longitud];
        this.librosAñadidos = 0;
    }

    public void AñadirLibro(){
        if (librosAñadidos>=libros.length) 
            System.out.println("No caben más libros");
        else{
            Autor nuevoAutor=new Autor();
            nuevoAutor.setNombre(Esdia.readString("Introduce el nombre del autor:"));
            nuevoAutor.setApellidos(Esdia.readString("Introduce los apellidos del autor:"));
            nuevoAutor.setPremioPlaneta(Esdia.siOno("Ha ganado el Premio Planeta"));
            libros[librosAñadidos].setAutor(nuevoAutor);
            libros[librosAñadidos].setTitulo(Esdia.readString("Introdice el título del libro"));
            libros[librosAñadidos].setPrecio(Esdia.readFloat("Introduce el precio",(float)0.01,1000));
            libros[librosAñadidos].setPubli(Esdia.readInt("Introduce el año de publicación",0,2024));
            libros[librosAñadidos].setPags((Esdia.readInt("Introduce el número de páginas",0,999999)));
            librosAñadidos++;
        }

    }
    public void mostrarAlmacen(float ritmoLectura){
        if (librosAñadidos == 0) {
            System.out.println("No hay libros en el almacén.");
            return;
        }
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|                                              LIBROS EN EL ALMACÉN                                                    |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Título                        | Año Publicación | Autor               | Premio Planeta | Páginas | Tiempo Lectura min | Precio € |");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");

        int tiempoTotal = 0;
        float precioTotal = 0;        
        for (int i = 0; i < librosAñadidos; i++) {
            Libro libro = libros[i];
            Autor autor = libro.getAutor();
            
            String titulo = libro.getTitulo();
            int añoPubli = libro.getPubli();
            String nombreAutor = autor.getNombre() + " " + autor.getApellidos();
            String premioPlaneta = autor.isPremioPlaneta() ? "Sí" : "No";
            int paginas = libro.getPags();
            float tiempoLectura = libro.getPags()*ritmoLectura; 
            float precio = libro.getPrecio();
            tiempoTotal += tiempoLectura;
            precioTotal += precio;
            
            // Imprimir datos del libro en formato de tabla
            System.out.printf("| %-28s | %-15d | %-18s | %-13s | %-7d | %-18d | %.2f € |\n", 
                              titulo, añoPubli, nombreAutor, premioPlaneta, paginas, tiempoLectura, precio);
        }
        
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| Tiempo de lectura total del almacén: %-67d min |\n", tiempoTotal);
        System.out.printf("| Valor total del almacén: %.2f €%72s|\n", precioTotal, "");
        System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
    }
}
