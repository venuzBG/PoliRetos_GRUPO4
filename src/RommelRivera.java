import java.util.Random;
import java.util.Scanner;

public class RommelRivera {
    static Scanner sc = new Scanner(System.in);

    public void rrSN1(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.print(" " + fibonacci(i));
        }
        
        sc.next();        
    }
        public static int fibonacci(int numero) {
            //caso base
            if ((numero == 0) || (numero == 1)) 
            return numero;
            
            else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    public void rrSN3(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int j=0;
        for(int i=0; i<(numero*2);i++){
            if(i %2 ==0)
            System.out.print(" ");
            else{ 
                System.out.print(fibonacci(j) +"/" +i);
                j++;
            }
            
        }
        
        sc.next();

    }
    public void rrSN2(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        for(int i=1; i<numero;i++){
            if(i %2 ==0)
            System.out.print(" "+0);
            else
            System.out.print(" " +i);
            
        }
        
        sc.next();

    }
    public void rrSN4(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int j=0;
        for(int i=1; i<(numero*2)+1;i++){
            if(i %2 ==0){
                System.out.print(fibonacci(j) +"/" +i);
                j++;
            }
            else{ 
                System.out.print(" ");
            }
            
        }
        
        sc.next();

    }    
    public void rrSN5(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int c = 1;
        int p = 2;
        int d = 2;
        while (c <= numero) {
        if (p % d == 0) {
        if (p == d) {
            System.out.print(p + ", ");
            c++;
        }
        d = 2;
        p++;
        }
        else
        d++;
        }
        
        sc.next();

    }
    
    public void rrSN6(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int j=0;
        for(int i=1; i<numero;i++){
            j=numero^2;
            System.out.print(" "+j);
            
        }
        
        sc.next();

    }

    public void rrSN7(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int j=-2;
        for(int i=0; i<numero;i++){
            j+=3;
            System.out.print(" "+j);
            
        }
        
        sc.next();


    }

    public void rrSN8(){
        System.out.println("Introduce el número: ");
        int numero = sc.nextInt();
        int j=-2;
        for(int i=0; i<numero;i++){
            j+=5;
            System.out.print(" "+j);
            
        }
        
        sc.next();

    }

    public void rrC04() {
        
        System.out.print("Ingresa una frase:");
        String frase = sc.nextLine();
        System.out.print("Ingresa una letra a eliminar:");
        char letraEliminar = sc.next().charAt(0);
        String fraseSinLetra = frase.replace(String.valueOf(letraEliminar), " ");
        System.out.println("Frase resultante: " + fraseSinLetra);
    }

    public void rrC08() {
        
        String[] conjunto = { "delira", "lidera", "ballena", "llenaba", "alondra", "ladrona", "España", "apañes",
                "Enrique", "quieren" };
        int indicePalabra = (int) (Math.random() * 10);
        String anagrama, anagramaCorrecto;
        System.out
                .println("Juguemos a los anagramas, tendras 3 intentos. Esta es tu palabra: " + conjunto[indicePalabra]);
        if (indicePalabra % 2 == 0) {
            anagramaCorrecto = conjunto[indicePalabra + 1];
        } else {
            anagramaCorrecto = conjunto[indicePalabra - 1];
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa tu anagrama: ");
            anagrama = sc.nextLine();
            if (anagramaCorrecto.equalsIgnoreCase(anagrama)) {
                System.out.println("Bien hecho, tu anagrama es correcto");
                break;
            } else {
                System.out.println("Lo siento, no esta bien");
            }
            System.out.println((i==2&&!anagramaCorrecto.equalsIgnoreCase(anagrama))?"Se te acabaron las opportunidades, el anagrama era: "+anagramaCorrecto:" ");
        }
        
    }

    public void rrC09() {
        
        System.out.print("[ Cad. 9 ]- Ingresa una frase: ");
        String frase = sc.nextLine();

        String cambio = LetrasAlternantes(frase);
        System.out.println("Frase resultante: " + cambio);

    }

    private static String LetrasAlternantes(String frase) {
        StringBuilder resultado = new StringBuilder();

        boolean mayuscula = true;

        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (mayuscula) {
                    resultado.append(Character.toUpperCase(letra));
                } else {
                    resultado.append(Character.toLowerCase(letra));
                }

                mayuscula = !mayuscula;
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }

    public void rrA05(String RommelRivera) {

        System.out.println("Ingresa tu nombre completo:");
        int tamanoMatriz = RommelRivera.length();

        char[][] matriz = new char[tamanoMatriz][tamanoMatriz];
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }
        Random random = new Random();

        for (int i = 0; i < RommelRivera.length(); i++) {
            char letra = RommelRivera.charAt(i);

            int fila, columna;
            do {
                fila = random.nextInt(tamanoMatriz);
                columna = random.nextInt(tamanoMatriz);
            } while (matriz[fila][columna] != ' ');

            matriz[fila][columna] = letra;
        }
        imprimirMatriz(matriz);
    }

    private static void imprimirMatriz(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public void rrL04() {
        String[] figuras = { "0oo", "o0o", "oo0","o0o"};
        for (int i = 0; i <= 100; i ++) {
                System.out.print("\r" + figuras[i%4]+" "+ i+"%");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
        }
    }

    public void rrR03( int c , int d){
        System.out.print("El resultado de la multiplicación de " + c + " y " + d + " es igual a: " + producto(c, d));
    }

    private static int producto(int c, int d) {
        if (d == 0) {
            return 0;
        } else {
            return c + producto(c, d - 1);
        }  
    }

}

