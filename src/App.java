
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("GRUPO NRO4");
        System.out.println("Integrantes: ");
        System.out.println("1. Sebastian Oña");
        System.out.println("2. Richard Tipantiza");
        System.out.println("3. Carlos Troya");
        System.out.println("4. Rommel Rivera");
        System.out.println();
        
        OnaSebastian      soFiguras;
        TipantizaRichard  trCaracteres;
        TroyaCarlos       ctFormas;
        RommelRivera      rmSeries;
        VallejoAlexis     vaFig;
        
        trCaracteres = new TipantizaRichard();
        soFiguras    = new OnaSebastian();
        ctFormas     = new TroyaCarlos();
        rmSeries     = new RommelRivera();
        vaFig        = new VallejoAlexis();

        
        int       tamano   = obtenerTamano();
        Character caracter = obtenerCaracter();
        String    Cadena   = setSoCadena();
        String    letra    = ingresarConsonante();

        System.out.println("-> Series Numericas:");
        System.out.println();
        //serie numeriacas 1-8
        rmSeries.setRmRepeticiones(tamano);
            rmSeries.rrSN1(rmSeries.getRmRepeticiones());
            rmSeries.rrSN2(rmSeries.getRmRepeticiones());
            rmSeries.rrSN3(rmSeries.getRmRepeticiones());
            rmSeries.rrSN4(rmSeries.getRmRepeticiones());
            rmSeries.rrSN5(rmSeries.getRmRepeticiones());
            rmSeries.rrSN6(rmSeries.getRmRepeticiones());
            rmSeries.rrSN7(rmSeries.getRmRepeticiones());
            rmSeries.rrSN8(rmSeries.getRmRepeticiones());

        //serie numerica 9-12
            vaFig.avSN9();
            vaFig.avSN10();
            vaFig.avSN12();
                
        System.out.println();
        System.out.println("-> Series Caracteres :");
        
        //caracteres 1-8
        trCaracteres.setSize(tamano);
        trCaracteres.setTrChar(caracter);
        
            trCaracteres.trSC1(trCaracteres.getSize(), trCaracteres.getTrChar());
            trCaracteres.trSC2(trCaracteres.getSize(), trCaracteres.getTrChar());
            trCaracteres.trSC3(trCaracteres.getSize(), trCaracteres.getTrChar());
            trCaracteres.trSC4(trCaracteres.getSize(), trCaracteres.getTrChar());
            trCaracteres.trSC5(trCaracteres.getSize());
            trCaracteres.trSC6(trCaracteres.getSize());
            trCaracteres.trSC7(trCaracteres.getSize(), trCaracteres.getTrChar());
            trCaracteres.trSC8(trCaracteres.getSize());
            trCaracteres.trSC9(trCaracteres.getSize());
            trCaracteres.trSC10(trCaracteres.getSize());
            System.out.println();

        System.out.println("-> Figuras:");
        System.out.println();
        //figuras 1-8
        soFiguras.setSoTamano(tamano);
        soFiguras.setSoSimbolo1(caracter);
        soFiguras.setSoSimbolo2("-");

            soFiguras.soF1(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF2(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1(), soFiguras.getSoSimbolo2());
            soFiguras.soF3(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF4(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF5(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF6(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF7(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());
            soFiguras.soF8(soFiguras.getSoTamano(), soFiguras.getSoSimbolo1());

        //figuras 9-16
        ctFormas.setCtTamanio(tamano);
        ctFormas.setCtChar(caracter);
            ctFormas.ctF9(ctFormas.getCtTamanio(),  ctFormas.getCtChar());
            ctFormas.ctF10(ctFormas.getCtTamanio(), ctFormas.getCtChar());
            ctFormas.ctF11(ctFormas.getCtTamanio(), ctFormas.getCtChar());
            ctFormas.ctF12(ctFormas.getCtTamanio());
            ctFormas.ctF13(ctFormas.getCtTamanio());
            ctFormas.ctF14(ctFormas.getCtTamanio());
            ctFormas.ctF15(ctFormas.getCtTamanio());
            ctFormas.ctF16(ctFormas.getCtTamanio(), ctFormas.getCtChar());

        //figura17 vaFig
        vaFig.setVaNivel(tamano);
        vaFig.avF17(vaFig.getVaNivel());


        System.out.println("SEGUNDA PARTE DE LOS POLIRETOS: ");
        System.out.println();
        System.out.println("---> Cadena de caracteres : ");
        
        soFiguras.setSoCadena(Cadena);
        soFiguras.setSoLetra(letra);

        soFiguras.sofraseInvertidaLetras  (soFiguras.getSoCadena());
        soFiguras.sofraseInvertidasinLetra(soFiguras.getSoCadena(), soFiguras.getSoLetra());


        System.out.println("---> Arrays: ");
        System.out.println();

        soFiguras.soPorcentajeCarga();
        soFiguras.soplanoCartesiano(soFiguras.getSoCadena());

        System.out.println();
        System.out.println("---> Loading: ");
        System.out.println();

        soFiguras.soefectoCarga();
        soFiguras.sobarramoviendose();
        soFiguras.socambiaflecha();

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

    private static char obtenerCaracter() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingresa un carácter: ");
                String input = sc.next();
                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    System.out.println("Error: Debes ingresar un solo carácter.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un carácter válido.");
                sc.nextLine(); // Limpia el búfer de entrada
            }
        }
    }

    public static String setSoCadena() {
        Scanner scanner = new Scanner(System.in);
        String cadena;
    
        while (true) {
            System.out.print("Ingrese una cadena de solo letras: ");
            cadena = scanner.nextLine();
    
            if (cadena.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Error: La cadena debe contener solo letras.");
            }
        }
    
        return cadena;
    }

    public static String ingresarConsonante() {
        Scanner scanner = new Scanner(System.in);
        String entrada;
    
        while (true) {
            System.out.print("Ingrese una sola consonante: ");
            entrada = scanner.nextLine();
    
            if (entrada.matches("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]") && entrada.length() == 1) {
                break;
            } else {
                System.out.println("Error: Debe ingresar una sola consonante.");
            }
        }
    
        return entrada;
    }
    
    

}

