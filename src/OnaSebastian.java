public class OnaSebastian {
    private int soTamano;
    private String soSimbolo1;
    private String soSimbolo2;
    private String soSimbolo3;

    public int getSoTamano() {
        return soTamano;
    }
    public void setSoTamano(int soTamano) {
        this.soTamano = soTamano;
    }
    public String getSoSimbolo1() {
        return soSimbolo1;
    }
    public void setSoSimbolo1(String soSimbolo1) {
        this.soSimbolo1 = soSimbolo1;
    }
    public String getSoSimbolo2() {
        return soSimbolo2;
    }
    public void setSoSimbolo2(String soSimbolo2) {
        this.soSimbolo2 = soSimbolo2;
    }
    public String getSoSimbolo3() {
        return soSimbolo3;
    }
    public void setSoSimbolo3(String soSimbolo3) {
        this.soSimbolo3 = soSimbolo3;
    }

    public void soF1(int SoTamano, String soSimbolo1){
        System.out.println("Figura NR1: ");
        System.out.println();
        for(int i = 0; i < soTamano; i++){
            if(i == 0 || i == soTamano-1){
                for (int j = 0; j < soTamano; j++) 
                    System.out.print(soSimbolo1 + " ");
                    System.out.println();
            }
            else{
                for (int j = 0; j < soTamano; j++) 
                    System.out.print(j == 0 || j == soTamano-1? soSimbolo1 + " " : "  ");
                    System.out.println();
            }
        }
        System.out.println();
    }

    public void soF2(int soTamano, String soSimbolo1, String soSimbolo2){
        System.out.println("Figura NR2: ");
        System.out.println();
        for(int i = 0; i < soTamano; i++){
            if(i == 0 || i == soTamano-1){
                for (int j = 0; j < soTamano; j++) 
                    System.out.print( j%2 == 0 ? soSimbolo1 + " " :  soSimbolo2 + " ");
                }
                else{
                    for (int j = 0; j < soTamano; j++) 
                        if (i%2 == 0){
                            System.out.print(j == 0 || j == soTamano-1? soSimbolo1 + " " : "  ");
                        } 
                        else{
                            System.out.print(j == 0 || j == soTamano-1? soSimbolo2 + " " : "  ");
                        }
                }
            System.out.println();
        }
        System.out.println();
    }

    public void soF3(int soTamano, String soSimbolo1){
        System.out.println("Figura NR3: ");
        System.out.println();
        int i = 0;
        while (i < soTamano) {
            for(int j = 0; j < soTamano; j++){
                System.out.print(j <= i ?  soSimbolo1 : "  ");
            }
            System.out.println();
            i++;
        }
    }

    public void soF4(int soTamano, String soSimbolo1){
        System.out.println();
        System.out.println("Figura NR4: ");
        System.out.println();
        for (int i = soTamano; i > 0; i--) {
            for (int j = 0; j <= soTamano; j++) {
                System.out.print(j >= i? soSimbolo1 : " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void soF5(int SoTamano, String soSimbolo3){
        System.out.println("Figura NR5: ");
        System.out.println();
        for (int i = soTamano; i > 0; i--) {
            if (i%2==0) {
                for (int j = 0;j < soTamano-i; j++) {
                    System.out.print(j%2==0?  " " : "");

                }
            }
            else{
                for (int j = i;j > 0; j--) {
                    System.out.print(soSimbolo3);
                }
                System.out.println();
            }
        }
    }

    public void soF6(int soTamano, String soSimbolo1){
        System.out.println();
        System.out.println("Figura NRO6: ");
        System.out.println();
        for (int i = soTamano; i >= 0; i--) {
            if (i%2!=0) {
                for (int j = i-1; j > 0; j--) {
                    System.out.print(j%2==0?   " " : "");
                } 
            }
            else{
                for (int j = i; j < soTamano ; j++) {
                    System.out.print(soSimbolo1);
            }
            System.out.println();
            }
        }
    }

    public void soF7(int soTamano, String soSimbolo2){ 
        System.out.println();
        System.out.println("Figura NRO7: ");
        System.out.println();
        int i = 0;
        while (i < soTamano) {
            if (i%2==0) {
                for (int j = 0; j < i; j++){
                    System.out.print("  ");
                } 
                    System.out.print(soSimbolo2+soSimbolo2+soSimbolo2);
            }
            else{
                for(int j = 1; j <= i; j++){
                    System.out.print(j%2!=0? "   ":" ");    
                }
                System.out.print("|");
            }
            System.out.println();
            i++;
        } 
    }

    public void soF8(int soTamano, String soSimbolo2){
        System.out.println();
        System.out.println("Figura NRO8: ");
        System.out.println();
        int i = 0;
        while (i < soTamano) {
            if (i%2==0) {
                for (int j = soTamano; j > i; j--) {
                    System.out.print("  ");
                }
                System.out.print(soSimbolo2+soSimbolo2+soSimbolo2);
            }
            else{
                for(int j = i; j < soTamano; j++){
                    System.out.print(j%2==0? "   ":" ");
                }
                System.out.print(" |");
            }
            System.out.println();
            i++;
        }
    }

}
