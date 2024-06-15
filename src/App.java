import java.util.Scanner;
    /** Clase App: Centraliza los objetos y metodos para ejecutar los poliretos.
     * @author: carlos.troya
     * @version: 1.0
     * 
     */


public class App {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("");
        
        System.out.println("GRUPO 4");
        System.out.println("troya.carlos");
        
        int ctTamanio = ingresoDatoTamanio();
        char ctChar = ingresoDatoCaracter();
        
        TroyaCarlos ctFormas = new TroyaCarlos(ctTamanio, ctChar);

        ctFormas.ctF9(ctFormas.getCtTamanio(), ctFormas.getCtChar());
        ctFormas.ctF10(ctFormas.getCtTamanio(), ctFormas.getCtChar());
        ctFormas.ctF11(ctFormas.getCtTamanio(), ctFormas.getCtChar());
        ctFormas.ctF12(ctFormas.getCtTamanio());
        ctFormas.ctF13(ctFormas.getCtTamanio());
        ctFormas.ctF14(ctFormas.getCtTamanio());
        ctFormas.ctF15(ctFormas.getCtTamanio());
        ctFormas.ctF16(ctFormas.getCtTamanio());
        ctFormas.ctC01();
        ctFormas.ctC02();
        ctFormas.ctA02(ctFormas.getCtTamanio(),ctFormas.getCtChar());
        ctFormas.ctL01();
        ctFormas.ctL02(ctFormas.getCtChar());
        ctFormas.ctL03(ctFormas.getCtChar());
        System.out.println("\n R01: El factorial de "+ctFormas.getCtTamanio() 
                            +" es: "+ctFormas.ctR01(ctFormas.getCtTamanio()));
    }  
    private static char ingresoDatoCaracter() {
        Character ctChar='0';
        String ctEntrada;
        System.out.println("Ingrese un caracter para personalizar ciertas figuras");
        ctEntrada = leer.nextLine();

        if (ctEntrada.length()>1){
            System.out.println("Su entrada es mas de un caracter, se tomara solo el primer caracter que ingreso: '"+ctChar+"'");
        }else if (ctEntrada.length()==0){
            System.out.println("Su entrada es null, por lo que se setea un caracter default '_'");
            ctEntrada="_";
        }
        ctChar = ctEntrada.charAt(0); 
        return ctChar;
    }
    private static Integer ingresoDatoTamanio() {
        Integer ctTamanio=0;
        boolean banderaIngresoIncorrecto;
        System.out.println("Ingrese el tamanio que deseea para las figuras");
        do  {
            try {
                System.out.print("Tamanio:   ");
                ctTamanio = Integer.parseInt(leer.nextLine());
                banderaIngresoIncorrecto = false;
            } catch (Exception e) {
                System.out.println("Error de dato, ingrese solo un numero entero para tamanio");
                banderaIngresoIncorrecto = true;
            }
        } while (banderaIngresoIncorrecto);
        return ctTamanio;
    }
}
