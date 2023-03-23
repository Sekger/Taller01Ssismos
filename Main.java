import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static double[] baseDatos(){
        double lista[] = new double[168];
        return lista;

    }
    static void Menu(){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int opcion;

        do{
            System.out.println("1.Ingresar datos");
            System.out.println("2.Mostar sismo de mayor magnitud");
            System.out.println("3.contar sismos mayores o iguales a 5.0");
            System.out.println("4.Enviar SMS");
            System.out.println("5.Salir");

            try{
                System.out.println("Ingrese una opción");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("llegaste aqui");
                        quit=true;
                        break;
                    case 2:
                        System.out.println("opcion 2");
                        break;
                    case 3:
                        System.out.println("opcion 3");
                    case 4:
                        System.out.println("opcion 4");
                    case 5:
                        System.out.println("saliendo");
                        quit = true;
                }

            }catch (InputMismatchException e){
                System.out.println("Debes ingresar un numero");
                opcion = sc.nextInt();
            }


        }while(!quit);
    }
    static double IngresarDatos(){

        return 0;
    }
    static double BuscarMayorSismo(){

        return 0;
    }
    static int ContarSismos(){
        return 0;
    }
    static String SMS(){

        return null;
    }
    static  boolean Salir(){
     boolean quit = true;
        return quit;
    }



    public static void main(String[] args) {
        Menu();

    }
}