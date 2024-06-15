public class OnaSebastian {
    private int soTamano;
    private String soSimbolo1;
    private String soSimbolo2;
    

    public OnaSebastian(){
        soTamano = 0;
        soSimbolo1 = "*";
        soSimbolo2 = "-";
    }

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

    

    public void soF1(int soTamano, String soSimbolo1){
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


    public void soF5(int SoTamano, String soSimbolo1){
        System.out.println("Figura NR5: ");
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

    public void soF6(int soTamano, String soSimbolo1){
        System.out.println();
        System.out.println("Figura NRO6: ");
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

    public void soF7(int soTamano, String soSimbolo1){ 
        System.out.println();
        System.out.println("Figura NRO7: ");
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

    public void soF8(int soTamano, String soSimbolo1){
        System.out.println();
        System.out.println("Figura NRO8: ");
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

    public void fraseInvertidaLetras(String cadena){
        String fraseInvertida = new StringBuilder(cadena).reverse().toString();
        
        // Convertir las consonantes a mayúsculas
        String fraseInvertidaConsonantesMayusculas = "";
        //El método indexOf devuelve el índice de la primera ocurrencia del carácter 
        //especificado en la cadena, o -1 si la cadena no contiene el carácter
        //":" Este es el operador utilizado en el bucle for-each para separar la declaración de la variable 
        //que recibe los elementos (char letra) del array o colección que se está iterando
        for (char letra : fraseInvertida.toCharArray()) {
            if ("aeiouAEIOU".indexOf(letra) == -1) {
                fraseInvertidaConsonantesMayusculas += Character.toUpperCase(letra);
            } else {
                fraseInvertidaConsonantesMayusculas += letra;
            }
        }
        
        // Mostrar la frase resultante
        System.out.println("La frase invertida con consonantes en mayúsculas es:");
        System.out.println(fraseInvertidaConsonantesMayusculas);
    }

    public void fraseInvertidasinLetra(String cadena, String letra){
        String fraseMayusculasSinJ = cadena.toUpperCase().replace(letra, "");
        
        // Mostrar la frase resultante
        System.out.println("La frase en mayúsculas y sin la letra " + letra + " es:");
        System.out.println(fraseMayusculasSinJ);
    }

    public void cargaNombre(){
        final int anchoBarra = 10; // Define el ancho de la barra de carga
        String bloque = "="; // Define el bloque de la barra de carga
        String indicador = "=>"; // Define el indicador de movimiento

        // Bucle para crear el efecto de movimiento
        
        for (int i = 0; i <= anchoBarra; i++) {
            System.out.print("\r"); // Retorna al inicio de la línea
            System.out.print("["); // Inicia la barra de carga

            // Imprime los bloques de la barra de carga
            for (int j = 0; j < i; j++) {
                System.out.print(bloque);
            }

            // Imprime el indicador de movimiento
            if (i < anchoBarra-2) {
                System.out.print(indicador);
            }

            // Rellena el espacio restante de la barra
            for (int j = i + indicador.length(); j < anchoBarra; j++) {
                System.out.print(" ");
            }

            System.out.print("]"); // Cierra la barra de carga
            System.out.print(i+"0%");

            try {
                // Pausa para crear el efecto visual
                Thread.sleep(500); // Pausa de medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción
            }
        }
        System.out.println(); // Salto de línea al finalizar
    }

    public void Sebas(){
        String nombreCompleto = "Pancracia Carmeliana Altamirano Perez";
        int[] porcentajesCarga = {100, 75, 50, 25};
        String[] palabrasNombre = nombreCompleto.split("\\s+");
        String bloque = "="; // Define el bloque de la barra de carga
        String indicador = "=>";
        
        for (int i = 0; i < palabrasNombre.length; i++) {
            int porcentaje = porcentajesCarga[i];
            int longitudBarra = (porcentaje * 20) / 100; // Calcular la longitud de la barra de carg
            
            // Imprimir la barra de carga
            System.out.print("[");
            for (int j = 0; j < 20; j++) {
                if (j < longitudBarra) {
                    System.out.print("=");
                } else if (j == longitudBarra) {
                    System.out.print(">");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("]"+palabrasNombre[i] + " ");
            System.out.println(porcentaje + "%");
            
            // Pausa para simular la carga
            try {
                // Pausa para crear el efecto visual
                Thread.sleep(500); // Pausa de medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción
            }
        }
    }

    public void planoCartesiano(){
        char[] nombre = {'S', 'E', 'A', 'S', 'T', 'I', 'A','N'};
        int[] funcion = new int[nombre.length];

        // Calcula los valores de f(x) = 2x
        for (int i = 0; i < nombre.length; i++) {
            funcion[i] = 2 * i;
        }

        // Dibuja el plano de coordenadas y la función
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

        // Dibuja el eje X
        System.out.print("  ");
        for (int x = 0; x < funcion.length * 2; x++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void barramoviendose(){
        int totalCaracteres = 20;
        String barra = "[                    ]"; // 20 espacios entre corchetes
        String simbolo = "<=>";
        int posicionSimbolo = 0;

        while (posicionSimbolo < totalCaracteres - 3) {
            String nuevaBarra = barra.substring(0, posicionSimbolo + 1) + simbolo + barra.substring(posicionSimbolo + 4);
            System.out.print("\r" + nuevaBarra + " " + (5 * posicionSimbolo) + "%");
            posicionSimbolo++;
            try {
                // Pausa para crear el efecto visual
                Thread.sleep(100); // Pausa de medio segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // Manejar la excepción
            }
        }
        System.out.print("\r" + barra.substring(0, totalCaracteres - 2) + simbolo + "] 100%"); // Muestra el 100%
        // La barra se detiene al llegar al 100%
        System.out.println();
    }

    public void cambiaflecha(){
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
    }

}
