public class AlexisVallejo {

    public void avSN9() {

        int numeroActual = 2;

        while (numeroActual <= 128) {

            System.out.print(numeroActual);
			System.out.print(", ");
            numeroActual = numeroActual * 2;
        }
    }

    public void avSN10(){
        int termino = 3;

        System.out.print(termino);
        System.out.print(", ");

        for (int i = 1; i <= 5; i++) {
            termino *= 3;
            System.out.print(termino);
            System.out.print(", ");
        }
    }

    public void avSN12(){
        int termino=2, sumadorPar=2;
        
        for(int i=1;i<=10;i++){
        	System.out.print(termino);
        	System.out.print(", ");
        	sumadorPar=sumadorPar+2;
        	termino=termino+sumadorPar;
        }
    }

    public void avF17(){
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    if (i % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void avR03 (int a, int b) {
        int result = multiplicacion(a, b);
        System.out.println(a + " * " + b + " = " + result);
    }

    public static int multiplicacion(int a, int b) {
        if (b < 0) {
            return -multiplicacion(a, -b);
        }
        if (b == 0) {
            return 0;
        }
        return a + multiplicacion(a, b - 1);
    }

    public void avR04(int a, int b) {
        int result = potencia(a, b);
        System.out.println(a + " ^ " + b + " = " + result);
    }

    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return 1 / potencia(a, -b);
        }
        return a * potencia(a, b - 1);
    }

    public void avR06(int n) {
        conteoRegresivo(n);
    }

    public static void conteoRegresivo(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        conteoRegresivo(n - 1);
    }
}    
