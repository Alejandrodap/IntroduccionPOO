
import com.coti.tools.Esdia;
public class App {
    public static void main (String[] args){
    

        
        int opcion= 0;
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
            opcion=Esdia.readInt("Seleccione una opción (1-5): ");
        
        
        
        
        }while(opcion!=5);
    }

}