public class VallejoAlexis {

    private int vaNivel;
    
    public int getVaNivel() {
        return vaNivel;
    }

    public void setVaNivel(int vaNivel) {
        this.vaNivel = vaNivel;
    }
    
    
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

    public void avF17(int vaFig){
        System.out.println("F17: ");
        System.out.println();
        int n = vaFig; 

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
}
