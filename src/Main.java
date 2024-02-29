import Parking.*;//Al estar la clase Parking en otro paquete, necesita ser importado para poder usarse
import Utilidades.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String matricula;
        int opcion;
        int numplaza;
        Parking parking1 = new Parking("Parking Centro", 10);

        Scanner sc = new Scanner(System.in);



        try {


            do {

                //Try catch para evitar que el programa termine si hay un error

                System.out.println("""
                        MENU DE OPCIONES:
                        1.- Entrada de Coches
                        2.- Salida de coche
                        3-  Plazas Libres
                        4-  Mostrar Parking
                        5-  Buscar coche
                        0.- Salir""");

                System.out.println("Enter la opcion elegida: ");

                opcion = sc.nextInt();
                //Este problema pasa cuando queremos leer un tipo de dato numético,
                // sea del tipo que sea y seguidamente queremos leer un String.
                //SOLUCION
                sc.nextLine();

                //Ejemplo de switch case en Java
                switch (opcion) {

                    case 1:
                        do {
                            System.out.println("Introduzca una matrícula válida: ");
                            matricula = sc.nextLine();
                        }while (!Validar.validarMatricula(matricula));
                        do {
                            System.out.println("Introduzca la plaza correctamente (de 0 a 9): ");
                            numplaza = Integer.parseInt(sc.nextLine());
                        }while (!Validar.validarNumeroPlaza(numplaza));
                        parking1.entrarCoche(numplaza,matricula);
                        break;
                    case 2:
                        do {
                            System.out.println("Introduzca una matrícula válida: ");
                            matricula = sc.nextLine();
                        }while (!Validar.validarMatricula(matricula));
                        do {
                            System.out.println("Introduzca la plaza correctamente (de 0 a 9): ");
                            numplaza = Integer.parseInt(sc.nextLine());
                        }while (!Validar.validarNumeroPlaza(numplaza));
                        parking1.sacarCoches(numplaza, matricula);
                        break;
                    case 3:
                        parking1.plazasLibres();
                        break;
                    case 4:
                        parking1.verParking();
                        break;
                    case 5:
                        do {
                            System.out.println("Introduzca una matrícula válida: ");
                            matricula = sc.nextLine();
                        }while (!Validar.validarMatricula(matricula));
                        parking1.buscarCoche(matricula);
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java


            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error! Valor inválido!!");
        }//catch


    }// main


}
