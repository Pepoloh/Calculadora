import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        do {
            //Escribir menu
            escribirMenu();
            //Pedir opcion
            pedirOpcion();
            // Leer opcion y almacenarla
            int opcion = leerOpcion();
            // Si la opcion es 0 , cerrrar programa
            if (opcion == 0) {
                System.exit(0);
            } else if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                //perdir el primer operando
                pedirOperando();
                //leer primer operando y almacenarlo
                double primerOperando = leerOperando();

                // pedir segundo operando
                pedirOperando();
                // leer segundo operando y almacenarlo
                double segundoOperando = leerOperando();
                // poner resultado
                escribirResultado(primerOperando, segundoOperando, opcion);

            }
            // si es otra opcion
            else {
                // mostrar mensaje de error
                System.out.println("Opcion no valida");
            }
        } while (true);
    }

    private static void escribirResultado(double primerOperando, double segundoOperando, int opcion) {
    double resultado = 0;
    switch (opcion) {
        case 1:
            //Sumar
            resultado = primerOperando + segundoOperando;
            break;

        case 2:
            //restar
            resultado = primerOperando - segundoOperando;
            break;
        case 3:
            //multiplicacion
            resultado = primerOperando * segundoOperando;
            break;
        case 4:
            //division
            resultado = primerOperando / segundoOperando;
            break;
    }
    System.out.println("El resultado es:" +resultado);


    }



    private static double leerOperando() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }

    private static void pedirOperando() {
        System.out.print("Escribe operando: ");
    }






    private static void pedirSegundOperando() {
        System.out.println("Escriba el segundo operando");
    }

    private static void pedirPrimerOperando() {
        System.out.println( "Escriba el primer operando");
    }


    private static int leerOpcion() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextInt();
    }



    private static void pedirOpcion() {
        System.out.println("Escoja una opcion");
    }

    private static void escribirMenu() {
        System.out.println("\nCALCULADORA:\n" + "1. Suma\n" + "2. Resta\n" + "3. Producto\n" + "4. Division\n" + "0. Salir");
    }
}
