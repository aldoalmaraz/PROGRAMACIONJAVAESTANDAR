import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response;
        do{
        System.out.println("SELECCIONA EL NUMERO DE LA OPCION DESEADA");
        System.out.println("1- MOVIES");
        System.out.println("2- SERIER");
        System.out.println("0- SALIR");
        Scanner sc =new Scanner(System.in);
        response= Integer.valueOf(sc.nextLine());
        switch(response){
            case 0:
                System.out.println("GRACIAS POR VISITARNOS");
                break;
            case 1:
                System.out.println("MOVIES");
                break;
            case 2:
                System.out.println("SERIES");
                break;
            default:
                System.out.println("SELECCIONA UNA OPCION CORRECTA");
        }
        } while (response !=0);

    }

}
