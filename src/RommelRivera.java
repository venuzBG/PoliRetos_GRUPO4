public class RommelRivera {
    
    private int rmRepeticiones;
    
    public int getRmRepeticiones() {
        return rmRepeticiones;
    }
    public void setRmRepeticiones(int rmRepeticiones) {
        this.rmRepeticiones = rmRepeticiones;
    }

    public void rrSN1(int rmRepeticiones){
        System.out.println("Sn1: ");
        System.out.println();
        for (int i = 0; i < rmRepeticiones; i++) {
            System.out.print(" " + fibonacci(i));
        }
        System.out.println();
    }
        public static int fibonacci(int rmRepeticiones) {
            //caso base
            if ((rmRepeticiones == 0) || (rmRepeticiones == 1)) 
            return rmRepeticiones;
            
            else
            return fibonacci(rmRepeticiones - 1) + fibonacci(rmRepeticiones - 2);
    }
    public void rrSN3(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn3: ");
        System.out.println();
        int j = 0;
        for(int i=0; i<(rmRepeticiones*2);i++){
            if(i %2 ==0)
            System.out.print(" ");
            else{ 
                System.out.print(fibonacci(j) +"/" +i);
                j++;
            }
            
        }
        System.out.println();
    }
    public void rrSN2(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn2: ");
        System.out.println();
        for(int i=1; i<rmRepeticiones;i++){
            if(i %2 ==0)
            System.out.print(" "+0);
            else
            System.out.print(" " +i);
            
        }
        System.out.println();
    }
    public void rrSN4(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn4: ");
        System.out.println();
        int j=0;
        for(int i=1; i<(rmRepeticiones*2)+1;i++){
            if(i %2 ==0){
                System.out.print(fibonacci(j) +"/" +i);
                j++;
            }
            else{ 
                System.out.print(" ");
            }
        }
        System.out.println();
    }    
    public void rrSN5(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn5: ");
        System.out.println();
        int c = 1;
        int p = 2;
        int d = 2;
        while (c <= rmRepeticiones) {
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
        System.out.println();
    }
    
    public void rrSN6(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn6: ");
        System.out.println();
        int j=0;
        for(int i=1; i<rmRepeticiones;i++){
            j=rmRepeticiones^2;
            System.out.print(" "+j);
            
        }
        System.out.println();
    }
    public void rrSN7(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn7: ");
        System.out.println();
        int j=-2;
        for(int i=0; i<rmRepeticiones;i++){
            j+=3;
            System.out.print(" "+j);
            
        }
        System.out.println();
    }
    public void rrSN8(int rmRepeticiones){
        System.out.println();
        System.out.println("Sn8: ");
        System.out.println();
        int j=-2;
        for(int i=0; i<rmRepeticiones;i++){
            j+=5;
            System.out.print(" "+j);
            
        }
        System.out.println();
    }
    
}

