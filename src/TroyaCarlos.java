import java.util.Arrays;

/**
 * Clase donde se reunen los metodos que grafican las figuras F9 hasta la F16
 * 
 * @author carlos.troya
 * @version 1.0
 */
public class TroyaCarlos {

    private Integer ctTamanio;
    private Character ctChar;

    /**
     * Constructor cuando no se ingresan parametros para el objeto TroyaCarlos
     */
    public TroyaCarlos() {
        ctTamanio = 5;
        ctChar = '_';
    }

    /**
     * Constructor cuando se ingresan parametros para el objeto TroyaCarlos
     * 
     * @param ctTamanio: es el objeto tipo Entero que dara valor al tamanio de las
     *                   figuras
     * @param ctChar:    es el objeto tipo Character con el que se personalizara
     *                   cierta figuras
     */
    public TroyaCarlos(Integer ctTamanio, Character ctChar) {
        setCtChar(ctChar);
        setCtTamanio(ctTamanio);
    }

    /**
     * Getter que entrega para el tamanio de las figuras
     * 
     * @return Devuelve el Integer con el valor del tamanio para las figuras
     */
    public int getCtTamanio() {
        return ctTamanio;
    }

    /**
     * Setter que modifica para el tamanio de las figuras y solo admite valores
     * superiores o igual a 1.
     * 
     * @param ctTamanio: es el objeto tipo Entero que ingresamos para tamanio de las
     *                   figuras
     */
    public void setCtTamanio(Integer ctTamanio) {
        if (ctTamanio == null || ctTamanio < 1) {
            System.out.println(
                    "El tamanio de las figuras no puede ser menor a 1, por lo que se setea al valor default 5");
            this.ctTamanio = 5;
        } else
            this.ctTamanio = ctTamanio;
    }

    /**
     * Getter para el caracter de las figuras
     * 
     * @return Devuelve el caracter con el que se personaliza ciertas figuras
     */
    public char getCtChar() {
        return ctChar;
    }

    /**
     * Setter que modifica para el caracter de las figuras
     * 
     * @param ctChar: es el parametro Caracter que ingresamos para personalizar
     *                ciertas figuras
     */
    public void setCtChar(Character ctChar) {
        if (ctChar == null)
            this.ctChar = '_';
        else
            this.ctChar = ctChar;
    }

    /**
     * Este metodo rotula la figura F16 que es una X que se dibuja entre caracteres
     * + y -, alternando entre ellos.
     * 
     * @param ctTamanio: Es el parametro Integer que da el tamaño a la figura.
     */
    public void ctF16(int ctTamanio) {
        char ctSimbolo;
        System.out.println("");
        System.out.println("F16:");
        for (int i = 0; i < ctTamanio; i++) {
            if (i % 2 == 0) {
                ctSimbolo = '+';
            } else {
                ctSimbolo = '-';
            }
            for (int j = 0; j < ctTamanio; j++) {
                if (j == i || j == (ctTamanio - 1) - i) {
                    System.out.print(ctSimbolo + "   ");
                } else {
                    System.out.print("    ");
                }

            }
            System.out.println("");
        }
    }

    /**
     * Este metodo rotula la figura F15 que es la piramide de Pascal alineada hacia
     * la derecha.
     * 
     * @param ctTamanio: Es el parametro entero que da el tamaño de la figura o
     *                   numero de filas que deseamos visualizar.
     */
    public void ctF15(int ctTamanio) {
        int[] ctFilaAnterior = { 1 };
        int[] ctFila;
        System.out.println("");
        System.out.println("F15:");

        for (int i = 0; i < ctTamanio; i++) {
            ctFila = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    ctFila[j] = 1;
                } else {
                    ctFila[j] = ctFilaAnterior[j - 1] + ctFilaAnterior[j];
                }
            }

            ctFilaAnterior = Arrays.copyOf(ctFila, i + 1);

            for (int j = 0; j < ctFila.length; j++) {
                if (j < ctFila.length - 1) {
                    System.out.print(ctFila[j] + " ");
                } else {
                    System.out.println(ctFila[j]);
                }
            }
        }
    }

    /**
     * Este metodo rotula la figura F14 que es la piramide de Pascal, distribuida en
     * cascada o en el centro.
     * 
     * @param ctTamanio: es el tamanio o numero de filas que se desea visualizar de
     *                   la piramide.
     */
    public void ctF14(int ctTamanio) {
        int[] ctFilaAnterior = { 1 };
        int[] ctFila;
        System.out.println("");
        System.out.println("F14:");

        for (int i = 0; i < ctTamanio; i++) {
            ctFila = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    ctFila[j] = 1;
                } else {
                    ctFila[j] = ctFilaAnterior[j - 1] + ctFilaAnterior[j];
                }
            }

            ctFilaAnterior = Arrays.copyOf(ctFila, i + 1);

            for (int j = 0; j < (ctTamanio - 1) - i + ctFila.length; j++) {
                if (j < (ctTamanio - 1) - i) {
                    System.out.print(" ");
                } else if (j >= (ctTamanio - 1 - i) && j < (ctTamanio - 1) - i + ctFila.length - 1) {
                    System.out.print(ctFila[j - (ctTamanio - 1 - i)] + " ");
                } else {
                    System.out.println(ctFila[j - (ctTamanio - 1 - i)]);
                }
            }

        }
    }

    /**
     * Este metodo rotula la figura F13 que es una piramide alineada a la derecha
     * que en cada nivel tiene numeros secuenciales del 1 al 9.
     * 
     * @param ctTamanio: Es el entero que da el tamanio o numero de filas que se
     *                   desea ver de la piramide.
     */
    public void ctF13(int ctTamanio) {
        System.out.println("");
        System.out.println("F13:");
        String ctFila;
        int ctContador;
        for (int i = 0; i < ctTamanio; i++) {
            ctFila = "";
            ctContador = 1;
            for (int j = 0; j < i + 1; j++) {
                ctFila = ctFila + ctContador;
                ctContador++;
                if (ctContador > 9) {
                    ctContador = 1;
                }
            }
            System.out.println(ctFila);
        }
    }

    /**
     * Este metodo rotula la figura F12 que es una piramide invertida alineada a la
     * derecha
     * que en cada nivel tiene numeros en secuencia del 1 al 9.
     * 
     * @param ctTamanio: Es el entero que da valor al tamanio o numero de filas que
     *                   se desea visualizar de la piramide.
     */
    public void ctF12(int ctTamanio) {
        System.out.println("");
        System.out.println("F12:");
        String ctFila;
        int ctContador;
        for (int i = 0; i < ctTamanio; i++) {
            ctFila = "";
            ctContador = 1;
            for (int j = 0; j < ctTamanio - i; j++) {
                ctFila = ctFila + ctContador;
                ctContador++;
                if (ctContador > 9) {
                    ctContador = 1;
                }
            }
            System.out.println(ctFila);
        }
    }

    /**
     * Este metodo rotula una escale que cada vez que desciende de nivel, cada
     * escalon tiene un caracter mas de longitud
     * 
     * @param ctTamanio: es el tamanio entero o numero de niveles que se desea ver
     *                   en la escalera.
     * @param ctChar:    es el caracter con el que se puede personalizar los
     *                   escalones de la escalera.
     */
    public void ctF11(int ctTamanio, char ctChar) {
        String piso = "";
        String espaciado = "";
        System.out.println("");
        System.out.println("F11:");
        for (int i = 0; i < ctTamanio; i++) {
            for (int j = 0; j < i; j++) {
                espaciado = espaciado + " ";
            }
            System.out.print(espaciado);

            System.out.print("|");
            espaciado = espaciado + " ";

            piso = "";
            for (int j = 0; j < i + 1; j++) {
                piso = piso + ctChar;
            }
            System.out.println(piso);
        }
    }

    /**
     * Este metodo rotula la figura F10 que es una escalera que en cada escalon que
     * desciende,
     * se alterna un caracter entre + y -
     * 
     * @param ctTamanio: Es en entero que representa el tamanio de la escalera o
     *                   numero de escalones que se desea visualizar
     * @param ctChar:    Es el caracter con el que se pueden personalizar los
     *                   escalones.
     */
    public void ctF10(int ctTamanio, char ctChar) {
        System.out.println("");
        System.out.println("F10:");
        for (int i = 0; i < ctTamanio; i++) {
            System.out.println(i % 2 == 0 ? "" + ctChar + "+" + ctChar : "" + ctChar + "-" + ctChar);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j == 0 ? "   " : "    ");
            }
            System.out.print("|");
        }
        System.out.println("");
    }

    /**
     * Este metodo rotula la figura F9 que es una piramide centrada en la mitad y
     * conformada por escalones
     * 
     * @param ctTamanio: es el entero que da valor al tamanio de la piramide o
     *                   numero de niveles que se desean visualizar
     * @param ctChar:    es el caracter con el que se puede personalizar los
     *                   escalones de la piramide.
     */
    public void ctF9(int ctTamanio, char ctChar) {
        System.out.println("");
        System.out.println("F9:");
        for (int i = 0; i < ctTamanio; i++) {
            for (int j = 0; j < (ctTamanio - 1) - i; j++) {
                System.out.print("    ");
            }
            if (i == 0) {
                System.out.println("" + ctChar + ctChar + ctChar);
            } else {
                System.out.print("" + ctChar + ctChar + ctChar + "|");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print("    ");
                }
            }
            if (i != 0) {
                System.out.println("|" + ctChar + ctChar + ctChar);
            }
        }
    }

    public void ctC01() {
        System.out.println("C01");
        System.out.println("");
        System.out.print("Ingrese una frase: ");
        String ctFrase = App.leer.nextLine().toLowerCase();
        int ctContador = 0;
        for (int i = 0; i < ctFrase.length(); i++) {
            if (ctFrase.charAt(i) == 'a' || ctFrase.charAt(i) == 'e' || ctFrase.charAt(i) == 'i'
                    || ctFrase.charAt(i) == 'o' || ctFrase.charAt(i) == 'u')
                ctContador++;
        }
        System.out.println("Tiene " + ctContador + " vocales ");
    }

    public void ctC02() {
        System.out.println("C02:");
        System.out.println("");
        System.out.println("Ingrese una frase :");
        String ctFrase = App.leer.nextLine().replace(" ", "").toLowerCase();
        int ctLetras = 0;
        for (int i = 0; i < ctFrase.length(); i++) {
            if ((ctFrase.charAt(i) >= 97 && ctFrase.charAt(i) <= 122)
                    || (ctFrase.charAt(i) >= 128 && ctFrase.charAt(i) <= 165)
                    || ctFrase.charAt(i) == 198 || ctFrase.charAt(i) == 128)
                ctLetras++;
        }
        System.out.println("Tiene " + ctLetras + " letras");
    }

    public void ctA02(int ctTamanio, char ctChar) {
        System.out.println("A02:");
        System.out.println("");
        for (int i = 0; i < ctTamanio; i++) {

            if (i == 0) {
                for (int j = 0; j <= ctTamanio * 2; j++) {

                    if (j < ctTamanio) {
                        System.out.print(ctChar + " ");
                    } else if (j == ctTamanio) {
                        System.out.print("  ");
                    } else {
                        System.out.print(ctChar + " ");
                    }
                }
                System.out.println("");
            } else if (i < ctTamanio - 1) {

                for (int j = 0; j <= ctTamanio * 2; j++) {
                    if (j == 0) {
                        System.out.print(ctChar + " ");
                    } else if (j <= ctTamanio) {
                        System.out.print("  ");
                    } else if (j < ctTamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println(ctChar + " ");
                    }
                }

            } else {
                for (int j = 0; j <= ctTamanio * 2; j++) {
                    if (j < ctTamanio) {
                        System.out.print(ctChar + " ");
                    } else if (j <= ctTamanio) {
                        System.out.print("  ");
                    } else if (j < ctTamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println(ctChar + " ");
                    }
                }
            }
        }
    }

    public void ctL01() {
        System.out.println("L01:");
        System.out.println("");
        System.out.print("Presione ENTER para empezar");
        App.leer.nextLine();

        char[] ctChar = { '-', '\\', '|', '/' };
        int ctPos = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r  " + ctChar[ctPos] + "   " + i + "%");
            if (i % 2 == 0)
                ctPos++;
            if (ctPos == ctChar.length)
                ctPos = 0;

            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        System.out.println("");
    }

    public void ctL02(char ctChar) {
        int ctLong = 20;
        String ctCarga = "" + ctChar;
        System.out.println("");
        System.out.println("L02:");
        System.out.println("");
        System.out.print("Presione ENTER para empezar");
        App.leer.nextLine();

        for (int i = 0; i <= 100; i++) {
            System.out.print("\r  [" + ctCarga.repeat((int) Math.round((double) i / 100.00 * ctLong))
                    + " ".repeat((int) Math.round((100.00 - (double) i) / 100.00 * ctLong)) + "]  "
                    + i + "%");

            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        System.out.println("");
    }

    public void ctL03(char ctChar) {
        int ctLong = 20;
        int ctContador = 0;
        String ctCarga = "" + ctChar;
        System.out.println("");
        System.out.println("L03:");
        System.out.println("");
        System.out.print("Presione ENTER para empezar");
        App.leer.nextLine();

        for (int repeticiones = 0; repeticiones < 5; repeticiones++) {
            if (repeticiones % 2 == 0) {
                for (int i = 0; i <= 20; i++) {
                    System.out.print("\r  [" + ctCarga.repeat((int) Math.round((double) i / 20.00 * ctLong))
                            + " ".repeat((int) Math.round((20.00 - (double) i) / 20.00 * ctLong)) + "]  "
                            + ctContador + "%");
                    ctContador++;
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                    }
                }
            } else {
                for (int i = 1; i < 20; i++) {
                    System.out.print("\r  [" + ctCarga.repeat((int) Math.round((20.00 - (double) i) / 20.00 * ctLong))
                            + " ".repeat((int) Math.round((double) i / 20.00 * ctLong)) + "]  "
                            + ctContador + "%");
                    ctContador++;
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                    }
                }

            }
        }

        System.out.println("");
    }

    public int ctR01(int ctTamanio) {
        if (ctTamanio == 0)
            return 1;
        else
            return ctTamanio * ctR01(ctTamanio - 1);
    }
}
