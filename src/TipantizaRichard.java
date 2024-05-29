public class TipantizaRichard {
    private int size;

    public TipantizaRichard(int size) {
        this.size = size;
    }
    // metodo : + - + - + - + - ...
    public void trSC1() {
        System.out.println("");
        char caracter1 = '+';
        char caracter2 = '-';
        for (int i = 1; i <= size; i++) {
            System.out.print((i % 2 == 0) ? caracter2 : caracter1);
            System.out.print(" ");
        }
        System.out.println();
    }

    //  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
    public void trSC2() {
        System.out.println("");
        char caracter1 = '+';
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
    public void trSC3() {
        System.out.println("");
        char caracter1 = '+';
        for (int i = 2; i <= size; i++) {
            if (esPrimo(i)) {
                System.out.print(repeat(Character.toString(caracter1), i) + " ");
            }
        }
        System.out.println("");
    }

    // + - * / + - * / + - * / ...
    public void trSC4() {
        System.out.println("");
        char[] caracteres = {'+', '-', '*', '/'};
        for (int i = 0; i < size * 4; i++) {
            System.out.print(caracteres[i % 4] + " ");
        }
        System.out.println("");
    }

    // \ | / -  |  \ | / -  |  \ | / -  | ...
    public void trSC5() {
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print(" \\ | / -  |");
        }
        System.out.println("");
    }

    // a b c d e f g h i j ...
    public void trSC6() {
        System.out.println("");
        for (char letra = 'a'; letra < 'a' + size; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println("");
    }

    // a + c - e + g ...
    public void trSC7() {
        System.out.println("");
        char caracter1 = '+';
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
    public void trSC8() {
        System.out.println("");
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
    public void trSC9() {
        System.out.println("");
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
    public void trSC10() {
    System.out.println("");
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
}