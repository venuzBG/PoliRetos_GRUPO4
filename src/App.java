/*Copyrigh (C) 2k2, keyaru
*richard.tipantiza@epn.edu.ec
*Version 1.2
*Richard Tipantiza*/ 
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Prj_GRUPO4");
        System.out.println("Integrantes: Sebastian, Richard, Carlos, Rommel");

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el número de términos/caracteres a usar: ");
            int size = sc.nextInt();
            TipantizaRichard tr = new TipantizaRichard(size);
            tr.trSC1();
            tr.trSC2();
            tr.trSC3();
            tr.trSC4();
            tr.trSC5();
            tr.trSC6();
            tr.trSC7();
            tr.trSC8();
            tr.trSC10();
            tr.trSC9();
            
        } catch (Exception e) {
            System.out.println("Error pe causa: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
