public class TipantizaRichard{
    int size;
    String caracter1;
    String caracter2;
    //constructor
    public TipantizaRichard(Integer size, String caracter1, String caracter2){
        this.size       = (size!=null)? size: 0;
        this.caracter1  = (caracter1!=null)? caracter1: "";
        this.caracter2  = (caracter2!=null)? caracter2: "";
    }


    //metodo : +-+-+-+- ...
    public void trSC1(){
        System.out.println ("FOR: ");
        for (int i = 1; i <= size; i++){
            if (i % 2 ==0)
                System.out.print(caracter2 + " ");
            else
                System.out.print(caracter1 + " ");
        }
        System.out.println("");
    }
    
    //metodo : + + ++ +++ +++++ ++++++++ +++++++++++++ ...
    public void trSC2(){
        System.out.println ("FOR: ");
        int f1=0;
        int f2=1;
        int fb;
        String resp;
        for (int i = 1; i <= size; ++i){
            if (i==1){
                resp =caracter1;
            }else{ 
                fb=f1+f2;
                f1=f2;
                f2=fb;
                resp= repeat(caracter1, fb);
            }
            System.out.print(resp + " ");
        }
        System.out.println("");
    }

    private String repeat(String str, int times) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times; i++) {
        result.append(str);
        }
    return result.toString();
    }

}
