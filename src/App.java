import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("GRUPO NRO4");
        System.out.println("Integrantes: ");
        System.out.println("1. Sebastian Oña");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("-> Figuras:");
        System.out.println();


        OnaSebastian soFiguras;
        
        soFiguras = new OnaSebastian();

        int tamano = obtenerTamano();
        String simbolo = obtenerSimbolo();

        soFiguras.setSoTamano(tamano);
        soFiguras.setSoSimbolo1(simbolo);
        soFiguras.setSoSimbolo2("-");
        

            soFiguras.soF1(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF2(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1(), soFiguras.getSoSimbolo2());
            soFiguras.soF3(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF4(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF5(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF6(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF7(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF8(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
 
    }

    private static int obtenerTamano() {
        while (true) {
            try {
                System.out.print("Ingresa el nivel que desea para las figuras: ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                sc.nextLine(); // Limpia el búfer de entrada
            }
        }
    }

    private static String obtenerSimbolo() {
        while (true) {
            try {
                System.out.print("Ingresa el símbolo deseado: ");
                String simbolo = sc.next();
                if (simbolo.length() == 1) {
                    return simbolo;
                } else {
                    System.out.println("Error: Debes ingresar un solo carácter.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un carácter válido.");
                sc.nextLine(); // Limpia el búfer de entrada
            }
        }
    }

}
