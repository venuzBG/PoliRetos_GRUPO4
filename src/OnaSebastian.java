public class OnaSebastian {
    private String OSF1;
    private String OSF2;

    //Contructor

    public OnaSebastian(){
        OSF1 = "A";
        OSF2 = "B";
    }

    public OnaSebastian (char OSF1, int longitud ,char OSF2a, char OSF2b, int longitud2){
        setOSF1(OSF1, longitud);
        setOSF2(OSF2a, OSF2b, longitud2);
    }
    
    public String getOSF1() {
        return OSF1;
    }

    public void setOSF1(char OSF1, int longitud) {
        for(int i = 0; i < longitud; i++){
            if(i == 0 || i == longitud-1){
                for (int j = 0; j < longitud; j++) 
                    System.out.print(OSF1 + " ");
                    System.out.println();
            }
            else{
                for (int j = 0; j < longitud; j++) 
                    System.out.print(j == 0 || j == longitud-1? OSF1 + " " : "  ");
                    System.out.println();
            }
        }
        System.out.println();
    }

    
    public String getOSF2() {
        return OSF2;
    }

    public void setOSF2(char OSF2a, char OSF2b, int longitud2) {
        for(int i = 0; i < longitud2; i++){
            if(i == 0 || i == longitud2-1){
                for (int j = 0; j < longitud2; j++) 
                    System.out.print( j%2 == 0 ? OSF2a + " " :  OSF2b + " ");
            }
            else{
                for (int j = 0; j < longitud2; j++) 
                    if (i%2 == 0){
                        System.out.print(j == 0 || j == longitud2-1? OSF2a + " " : "  ");
                    } 
                    else{
                        System.out.print(j == 0 || j == longitud2-1? OSF2b + " " : "  ");
                    }
            }
            System.out.println();
        }
        System.out.println();    
    }
}
