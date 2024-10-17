
import com.coti.tools.Esdia;
import clases.*;

public class App {
    public static void main (String[] args){
    
        
        int opcion= 0;
        float ritmoLectura=1;
        int longitud;
        Almacen almacen = new Almacen();
        do{
            System.out.println("|----------------------------------------------|");
            System.out.println("| MIS LIBROS                                   |");
            System.out.println("|----------------------------------------------|");
            System.out.println("1) Nuevo almacén de libros");
            System.out.println("2) Establecer ritmo de lectura (páginas por minuto)");
            System.out.println("3) Añadir un nuevo libro al almacén");
            System.out.println("4) Mostrar información actual de libros");
            System.out.println("5) Salir (se borrará toda la información)");
            System.out.println("|----------------------------------------------|");
            opcion=Esdia.readInt("Seleccione una opción ",1,5);



            switch (opcion) {
                case 1:
                    System.out.println("Creando un nuevo almacén de libros...");
                    longitud=Esdia.readInt("Seleccione el tamaño del almacen ",1,100);
                    almacen.crearAlamcen(longitud);
                    break;
                case 2:
                    ritmoLectura=Esdia.readFloat("Estableciendo ritmo de lectura a:");
                    break;
                case 3:
                    System.out.println("Añadiendo nuevo libro");
                    almacen.AñadirLibro();
                    break;
                case 4:
                    almacen.mostrarLibros(ritmoLectura);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;  
                }    
        }while(opcion!=5);
    }

}