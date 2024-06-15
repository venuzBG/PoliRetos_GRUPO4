public class OnaSebastian {
    private int       soTamano;
    private Character soSimbolo1;
    private String    soSimbolo2;
    private String    soCadena;
    private String    soLetra;
    
    public OnaSebastian(){
        soTamano     =  0;
        soSimbolo1   = '+';
        soSimbolo2   = "-";
        soCadena     = "";
        soLetra      = "";
    }

    public void setSoSimbolo1(Character soSimbolo1) {
        this.soSimbolo1 = soSimbolo1;
    }
   
    public String getSoCadena() {
        return soCadena;
    }

    public void setSoCadena(String soCadena) {
        this.soCadena = soCadena;
    }

    public Character getSoSimbolo1() {
        return soSimbolo1;
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
    
    public String getSoLetra() {
        return soLetra;
    }

    public void setSoLetra(String soLetra) {
        this.soLetra = soLetra;
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
                for (int k = 0; k < 3; k++) {
                    System.out.print(soSimbolo1); 
                }
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
                for (int k = 0; k < 3; k++) {
                    System.out.print(soSimbolo1); 
                }
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

    //Segunda parte de los poliretos

    //Cadena de caracteres
    public void sofraseInvertidaLetras(String soCadena){
        System.out.println();
        System.out.println("C06): ");
        System.out.println();
        String fraseInvertida = new StringBuilder(soCadena).reverse().toString();
        
        String fraseInvertidaConsonantesMayusculas = "";

        for (char letra : fraseInvertida.toCharArray()) {
            if ("aeiouAEIOU".indexOf(letra) == -1) {
                fraseInvertidaConsonantesMayusculas += Character.toUpperCase(letra);
            } else {
                fraseInvertidaConsonantesMayusculas += letra;
            }
        }
        
        System.out.println("La frase invertida con consonantes en mayúsculas es:");
        System.out.println(fraseInvertidaConsonantesMayusculas);
    }

    public void sofraseInvertidasinLetra(String soCadena, String soLetra){
        System.out.println();
        System.out.println("C07): ");
        System.out.println();
        String fraseMayusculasSin = soCadena.toUpperCase().replace(soLetra.toUpperCase(), "");
        
        System.out.println("La frase en mayúsculas y sin la soLetra " + soLetra + " es:");
        System.out.println(fraseMayusculasSin);
        System.out.println();
    }

    public void soPorcentajeCarga(){

        System.out.println("A01) ");
        System.out.println();
        String nombreCompleto  =  "Sebastian Geovanny Ona Andrade";
        int[] porcentajesCarga = {100, 75, 50, 25};
        String[] palabrasNombre = nombreCompleto.split("\\s+");
    
        for (int i = 0; i < palabrasNombre.length; i++) {
            int porcentaje = porcentajesCarga[i];
            int longitudBarra = (porcentaje * 20) / 100; 
        
            // Imprimir la barra de carga
            for (int j = 0; j <= 20; j++) {
                if (j <= longitudBarra) {
                    System.out.print("\r["); 
                    for (int k = 0; k < j; k++) {
                        System.out.print("="); 
                    }
                    if (j < longitudBarra) {
                        System.out.print(">"); 
                    }
                    for (int k = j; k < 20; k++) {
                        System.out.print(" "); 
                    }
                    System.out.print("]" + palabrasNombre[i] + " ");
                    System.out.print(porcentaje + "%");
                
                // Pausa para simular la carga
                    try {
                        Thread.sleep(250); 
                    } catch (InterruptedException e) {
                        e.printStackTrace(); 
                    }
                }
            }
            System.out.println(); }
    }

    public void soplanoCartesiano(String soCadena){
        System.out.println();
        System.out.println("A02) ");
        System.out.println();
        char[] nombre = soCadena.toCharArray(); 
        int[] funcion = new int[nombre.length];

        for (int i = 0; i < nombre.length; i++) {
            funcion[i] = 2 * i;
        }

        for (int y = 14; y >= 0; y--) {
            System.out.print(y + " | ");
            for (int x = 0; x < funcion.length; x++) {
                if (funcion[x] == y) {
                    System.out.print(nombre[x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int x = 0; x < funcion.length * 2; x++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void soefectoCarga() {
        System.out.println();
        System.out.println("L05) ");
        System.out.println();
        int longitudTotal = 20;
        int porcentajeCarga = 0;
        
        while (porcentajeCarga <= 100) {
            int longitudBarra = (porcentajeCarga * longitudTotal) / 100;
            
            System.out.print("\r["); 
            for (int i = 0; i < longitudTotal; i++) {
                if (i < longitudBarra) {
                    System.out.print("=");
                } else if (i == longitudBarra && porcentajeCarga < 100) {
                    System.out.print(porcentajeCarga % 2 == 0 ? ">" : "-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentajeCarga + "%");
            
            porcentajeCarga++;
            
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
        }
        System.out.println(); 
    }

    public void sobarramoviendose(){
        System.out.println();
        System.out.println("L06) ");
        System.out.println();
        int totalCaracteres = 20;
        String barra = "[                    ]"; // 20 espacios entre corchetes
        String simbolo = "<=>";
        int posicionSimbolo = totalCaracteres - simbolo.length();

        while (posicionSimbolo >= 0) {
            String nuevaBarra = barra.substring(0, posicionSimbolo + 1) + simbolo + barra.substring(posicionSimbolo + simbolo.length() + 1);
            int porcentaje = ((totalCaracteres - simbolo.length() - posicionSimbolo) * 100) / (totalCaracteres - simbolo.length());
            System.out.print("\r" + nuevaBarra + " " + porcentaje + "%");
        
            posicionSimbolo--;
        
            try {
                Thread.sleep(100); // Pausa de cien milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción
            }
        }
    
        System.out.print("\r" + "[" + simbolo + barra.substring(simbolo.length() + 1) + " 100%");
        System.out.println(); // Salto de línea al finalizar
    }

    public void socambiaflecha(){
        System.out.println();
        System.out.println("L07) ");
        System.out.println();
        int totalCaracteres = 20;
        char[] simbolosRotativos = {'|', '/', '-', '\\'};
        int indiceSimbolo = 0;

        for (int i = 0; i <= totalCaracteres; i++) {
            StringBuilder barra = new StringBuilder("[");
            
            // Rellena la barra con '=' hasta la posición actual
            for (int j = 0; j < i; j++) {
                barra.append("=");
            }
            
            // Añade el símbolo rotativo actual
            if (i < totalCaracteres) {
                barra.append(simbolosRotativos[indiceSimbolo]);
            }
            
            // Rellena el resto de la barra con espacios
            for (int j = i + 1; j < totalCaracteres; j++) {
                barra.append(" ");
            }
            barra.append("] ");
            
            // Calcula el porcentaje
            int porcentaje = (i * 100) / totalCaracteres;
            barra.append(porcentaje).append("%");
            
            // Imprime la barra de progreso
            System.out.print("\r" + barra.toString());
            
            // Actualiza el índice del símbolo rotativo
            indiceSimbolo = (indiceSimbolo + 1) % simbolosRotativos.length;
            
            // Espera antes de la próxima actualización
            try {
                // Pausa para crear el efecto visual
                Thread.sleep(100); // Pausa de medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción
            }
        }
        System.out.println();
    }
}
    



