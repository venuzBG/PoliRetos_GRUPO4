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
        soFiguras.setSoTamano(7);
        soFiguras.setSoSimbolo1("+");
        soFiguras.setSoSimbolo2("-");
        soFiguras.setSoSimbolo3("*");

            soFiguras.soF1(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF2(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1(), soFiguras.getSoSimbolo2());
            soFiguras.soF3(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF4(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF5(soFiguras.getSoTamano(), soFiguras.getSoSimbolo3());
            soFiguras.soF6(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF7(soFiguras.getSoTamano(), soFiguras.getSoSimbolo2());
            soFiguras.soF8(soFiguras.getSoTamano(), soFiguras.getSoSimbolo2());
 
    }
}
