public class OnaSebastian {
    private int       soTamano;
    private Character soSimbolo1;
    private String    soSimbolo2;
    
    
    public Character getSoSimbolo1() {
        return soSimbolo1;
    }

    public void setSoSimbolo1(Character soSimbolo1) {
        this.soSimbolo1 = soSimbolo1;
    }
    public OnaSebastian(){
        soTamano = 0;
        // soSimbolo1 = "*";
        soSimbolo2 = "-";
    }

    public int getSoTamano() {
        return soTamano;
    }
    public void setSoTamano(int soTamano) {
        this.soTamano = soTamano;
    }
    
    public String getSoSimbolo2() {
        return soSimbolo2;
    }
    public void setSoSimbolo2(String soSimbolo2) {
        this.soSimbolo2 = soSimbolo2;
    }

    

    public void soF1(int soTamano, Character soSimbolo1){
        System.out.println("F1: ");
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

    public void soF2(int soTamano, Character soSimbolo1, String soSimbolo2){
        System.out.println("F2: ");
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

    public void soF3(int soTamano, Character soSimbolo1){
        System.out.println("F3: ");
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

    public void soF4(int soTamano, Character soSimbolo1){
        System.out.println();
        System.out.println("F4: ");
        System.out.println();
        for (int i = soTamano; i > 0; i--) {
            for (int j = 0; j <= soTamano; j++) {
                System.out.print(j >= i? soSimbolo1 : " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void soF5(int SoTamano, Character soSimbolo1){
        System.out.println("F5: ");
        System.out.println();
        int i = soTamano;
        while (i > 0) {
            for (int j = soTamano; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print(soSimbolo1);
            }
            System.out.println();
            i--;
        }
    }

    public void soF6(int soTamano, Character soSimbolo1){
        System.out.println();
        System.out.println("F6: ");
        System.out.println();
        int i = 1;
        while (i <= soTamano) {
            for(int j = 1; j <= soTamano-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print(soSimbolo1);
            }
            System.out.println();
            i++;
        }
    }

    public void soF7(int soTamano, Character soSimbolo1){ 
        System.out.println();
        System.out.println("F7: ");
        System.out.println();
        int i = 0;
        while (i < soTamano) {
            if (i%2==0) {
                for (int j = 0; j < i; j++){
                    System.out.print("  ");
                } 
                    System.out.print(soSimbolo1+soSimbolo1+soSimbolo1);
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

    public void soF8(int soTamano, Character soSimbolo1){
        System.out.println();
        System.out.println("F8: ");
        System.out.println();
        int i = 0;
        while (i < soTamano) {
            if (i%2==0) {
                for (int j = soTamano; j > i; j--) {
                    System.out.print("  ");
                }
                System.out.print(soSimbolo1+soSimbolo1+soSimbolo1);
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
