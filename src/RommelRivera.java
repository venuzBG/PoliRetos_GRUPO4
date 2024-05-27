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
}

