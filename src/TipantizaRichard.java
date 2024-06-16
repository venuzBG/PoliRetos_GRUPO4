public class TipantizaRichard {
    private int size;
    private Character trChar;
    private String frase;
    private String vocal;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getVocal() {
        return vocal;
    }

    public void setVocal(String vocal) {
        this.vocal = vocal;
    }

    public Character getTrChar() {
        return trChar;
    }

    public void setTrChar(Character trChar) {
        this.trChar = trChar;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    
    // metodo : + - + - + - + - ...
    public void trSC1(int size, Character trChar) {
        System.out.println("");
        System.out.println("SC 1:");
        System.out.println();
        char caracter1 = trChar;
        char caracter2 = '-';
        for (int i = 1; i <= size; i++) {
            System.out.print((i % 2 == 0) ? caracter2 : caracter1);
            System.out.print(" ");
        }
        System.out.println();
    }

    //  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
    public void trSC2(int size, Character trChar) {
        System.out.println("");
        System.out.println("SC 2:");
        System.out.println();
        char caracter1 = trChar;
        int f1 = 0;
        int f2 = 1;
        int fb;
        String resp;
        for (int i = 1; i <= size; ++i) {
            if (i == 1) {
                resp = Character.toString(caracter1);
            } else {
                fb = f1 + f2;
                f1 = f2;
                f2 = fb;
                resp = repeat(Character.toString(caracter1), fb);
            }
            System.out.print(resp + " ");
        }
        System.out.println("");
    }

    // ++ +++ +++++ +++++++ +++++++++++
    public void trSC3(int size, Character trChar) {
        System.out.println("");
        System.out.println("SC 3:");
        System.out.println();
        char caracter1 = trChar;
        for (int i = 2; i <= size; i++) {
            if (esPrimo(i)) {
                System.out.print(repeat(Character.toString(caracter1), i) + " ");
            }
        }
        System.out.println("");
    }

    // + - * / + - * / + - * / ...
    public void trSC4(int size, Character trChar) {
        System.out.println("");
        System.out.println();
        System.out.println("SC 4:");
        char[] caracteres = {trChar, '-', '*', '/'};
        for (int i = 0; i < size * 4; i++) {
            System.out.print(caracteres[i % 4] + " ");
        }
        System.out.println("");
    }

    // \ | / -  |  \ | / -  |  \ | / -  | ...
    public void trSC5(int size) {
        System.out.println("");
        System.out.println();
        System.out.println("SC 5:");
        for (int i = 0; i < size; i++) {
            System.out.print(" \\ | / -  |");
        }
        System.out.println("");
    }

    // a b c d e f g h i j ...
    public void trSC6(int size) {
        System.out.println("");
        System.out.println("SC 6:");
        System.out.println();
        for (char letra = 'a'; letra < 'a' + size; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println("");
    }

    // a + c - e + g ...
    public void trSC7(int size, Character trChar) {
        System.out.println("");
        System.out.println("SC 7:");
        System.out.println();
        char caracter1 = trChar;
        char caracter2 = '-';
        if (size > 14) {
            System.out.println("Se acabó el abecedario crack!!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print((char)('a' + i * 2) + " ");
                System.out.print((i % 2 == 0 ? caracter1 : caracter2) + " ");
            }
            System.out.println("");
        }
    }

    // aa bbbb cccccc dddddddd ...
    public void trSC8(int size) {
        System.out.println("");
        System.out.println("SC 8:");
        System.out.println();
        for (int i = 0; i < size; i++) {
            char letra = (char) ('a' + i);
            int repeticiones = (i + 1) * 2;
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }


    // a b c dd eee fffff gggggggg ...
    public void trSC9(int size) {
        System.out.println("");
        System.out.println("SC 9:");
        System.out.println();
        int f1 = 1;
        int f2 = 1;
        for (int i = 0; i < size; i++) {
            char letra = (char) ('a' + i);
            for (int j = 0; j < f2; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            int temp = f2;
            f2 = f1 + f2;
            f1 = temp;
        }
        System.out.println();
    }

    // a bbb ccccc ddddddd eeeeeeeee ...
    public void trSC10(int size) {
    System.out.println("");
    System.out.println("SC 10:");
    System.out.println();
    for (int i = 0; i < size; i++) {
        char letra = (char) ('a' + i);
        int repeticiones = i * 2 + 1; 
        for (int j = 0; j < repeticiones; j++) {
            System.out.print(letra);
        }
        System.out.print(" ");
    }
    System.out.println("");
}

    // // Métodos auxiliares
    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String repeat(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }

    //Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.
    public void trC03(String frase, String vocal) {
        System.out.println("\nC03:\n");
            if (vocal.length() != 1 || !vocal.matches("[aeiouAEIOU]")) {
                System.out.println("Error: Debes ingresar solo una vocal.");
            } else {
                String fraseSinVocal = frase.replaceAll("(?i)[" + vocal + "]", "").replaceAll("", " ").trim();
    
                System.out.println("La frase sin la vocal '" + vocal + "' es: " + fraseSinVocal);
            }
    }

    //Pedir una frase y presentarla invertida con las vocales en mayusculas.
    public void trC05(String frase) {
        System.out.println("\nC05:\n");
        String fraseConVocalesMayusculas = frase.replaceAll("a", "A")
                                                .replaceAll("e", "E")
                                                .replaceAll("i", "I")
                                                .replaceAll("o", "O")
                                                .replaceAll("u", "U");
        String fraseInvertida = new StringBuilder(fraseConVocalesMayusculas).reverse().toString();
        System.out.println("Frase invrtida y vocales mayusculas: " + fraseInvertida);
        }
    
        //Crear una matriz donde forme una X con su nombre y apellido
    public void trA04(String frase) {
        String trApellido = "Andrade";
        System.out.println("\nA04:\n");
        int trtamano = Math.max(frase.length(), trApellido.length());
        char[][] trmatriz = new char[trtamano][trtamano];
    
            for (int i = 0; i < trtamano; i++) {
                for (int j = 0; j < trtamano; j++) {
                    trmatriz[i][j] = ' ';
                }
            }
            for (int i = 0; i < trtamano; i++) {
                if (i < frase.length()) {
                    trmatriz[i][i] = frase.charAt(i);
                }
                if (i < trApellido.length()) {
                    trmatriz[i][trtamano - 1 - i] = trApellido.charAt(i);
                }
            }
            for (int i = 0; i < trtamano; i++) {
                for (int j = 0; j < trtamano; j++) {
                    System.out.print(trmatriz[i][j]);
                }
                System.out.println();
            }
        }

    //Pedir el nombre y apellido y realizar la trCarga mostrando letra a letra hasta el 100 %.
    public void trL08(String nombre) {
        String apellido = "Richard";
        System.out.println("\nL08:\n");
        String trNombreCompleto = nombre + " " + apellido;
        int trTotalCaracteres = trNombreCompleto.length();
        StringBuilder trCarga = new StringBuilder("[");
    
            for (int i = 0; i < trTotalCaracteres; i++) {
                trCarga.append(" ");
            }
            trCarga.append("]");
            for (int i = 0; i < trTotalCaracteres; i++) {
                trCarga.setCharAt(i + 1, trNombreCompleto.charAt(i)); 
                int porcentaje = (i + 1) * 100 / trTotalCaracteres;
                System.out.print("\r" + trCarga.toString() + " " + porcentaje + "%");
                try {
                    Thread.sleep(300); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); 
        }
    
        //Desplazar la figura a la derecha y regresar
        public void trL12(int size) {
        System.out.println("\nL12:\n");
        String trdibujo = "\n \\ | | | /"+"\n  (>   <)"+"\noo0-(_)-0oo"; 
        int trtiempo = 200; 
    
        String[] trLineasDibujo = trdibujo.split("\n");
        StringBuilder[] lineas = new StringBuilder[trLineasDibujo.length];
            for (int i = 0; i < trLineasDibujo.length; i++) {
                lineas[i] = new StringBuilder(" ".repeat(size + trLineasDibujo[i].length()));
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < trLineasDibujo.length; j++) {
                    lineas[j].replace(i, i + trLineasDibujo[j].length(), trLineasDibujo[j]);
                }
                imprimirLineas(lineas);
                try {
                    Thread.sleep(trtiempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < trLineasDibujo.length; j++) {
                    lineas[j].replace(i, i + trLineasDibujo[j].length(), " ".repeat(trLineasDibujo[j].length()));
                }
            }
            for (int i = size - 1; i >= 0; i--) {
                for (int j = 0; j < trLineasDibujo.length; j++) {
                    lineas[j].replace(i, i + trLineasDibujo[j].length(), trLineasDibujo[j]);
                }
                imprimirLineas(lineas);
                try {
                    Thread.sleep(trtiempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < trLineasDibujo.length; j++) {
                    lineas[j].replace(i, i + trLineasDibujo[j].length(), " ".repeat(trLineasDibujo[j].length()));
                }
            }
        }
    
        
    
    
        // // Métodos auxiliares
        private void imprimirLineas(StringBuilder[] lineas) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            for (StringBuilder linea : lineas) {
                System.out.println(linea);
            }
        }
        private boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        private String repeat(String str, int times) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < times; i++) {
                result.append(str);
            }
            return result.toString();
        }
}