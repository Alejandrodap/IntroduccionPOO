
import com.coti.tools.Esdia;
import clases.*;

public class App {
    public static void main (String[] args){
    
        
        int opcion= 0;
        float ritmoLectura;
        int longitud;
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
                    Almacen almacen = new Almacen(longitud);
                    break;
                case 2:
                    ritmoLectura=Esdia.readFloat("Estableciendo ritmo de lectura a:");
                    break;
                case 3:
                    System.out.println("Añadiendo un nuevo libro al almacén...");
                    break;
                case 4:
                    System.out.println("Mostrando información actual de libros...");
                    break;
                case 5:
                    System.out.println("Saliendo... Se borrará toda la información.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
                    break;    
                }    
        
        
        }while(opcion!=5);
    }

}