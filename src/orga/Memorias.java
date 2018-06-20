/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Memorias {

    public int[] RAM = new int[4096];
    public int[] CACHE = new int[1024];

    final int conjuntosCache = 16;
    final int tamBloque = 8;
    final int tamConjunto = 4;
    int lineaCache = 8;
    int siguiente;
    public int[][][] CACHE_CONJUNTO = new int[16][4][3];
    int CACHE_A[][] = new int[lineaCache][3];
    public int[][] siguienteConjunto = new int[16][1];

    public int k = 8; // tamaño del bloque
    public int m = 1024; //numero de lineas

    public int tiempo = 0;

    public void CD(int op) {

        for (int i = 0; i < 4096; i++) {
            if (i % 16 == 0) {
                //marca las lineas como validas y modificada
                CACHE[i] = 0;
                CACHE[i + 1] = 0;
            }
        }

        // leer
        if (op == 1) {

        }
    }

    public void CA() {
        for (int i = 0; i < 4096; i++) {
            if (i % 16 == 0) {
                //marca las lineas como validas y modificada
                CACHE[i] = 0;
                CACHE[i + 1] = 0;
            }
        }
    }

    public void CAC() {
        for (int i = 0; i < 4096; i++) {
            if (i % 16 == 0) {
                //marca las lineas como validas y modificada
                CACHE[i] = 0;
                CACHE[i + 1] = 0;
            }
        }
    }

    /*
    int leerCA(int d) {
        int lind;
        if (CACHE[0] == 0) {

        }

    }

    int calLin() {

    }*/
    public ArrayList<Integer> leerDatos() {
        ArrayList<Integer> data = new ArrayList();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int i = 0;

        try {
            //ruta absoluta
            //ruta relativa
            archivo = new File("./datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            System.out.println(br.readLine());

            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                data.add(Integer.parseInt(linea));
                RAM[i] = Integer.parseInt(linea);
                i++;
            }
            System.out.println("CANTIDAD " + data.size());

        } catch (Exception e) {
            e.printStackTrace();
        }

        //cerrar lectura de archivo
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return data;
    }

    public void escribir(int pos, int tipo, int dato) {
        int x = 0;

        if (tipo == 1) {
            RAM[pos] = dato;
            tiempo += 0.1;
        } else if (tipo == 2) {

        } else if (tipo == 3) {
            if (siguiente > lineaCache - 1) {
                siguiente = 0;
            }
            final int bloque = pos / tamBloque;
            final int etiqueta = bloque;
            int linea;

            if ((linea = estaEnCacheA(bloque)) != -1) {
                tiempo += 0.01;
                CACHE_A[linea][1] = 1;
                return;
            }
            linea = siguiente;
            if (CACHE_A[linea][0] == -1) {
                CACHE_A[linea][0] = 1;
                CACHE_A[linea][2] = etiqueta;
                tiempo += 0.11;
            } else {
                if (CACHE_A[linea][1] == 1) {
                    tiempo += 0.22;
                } else {
                    tiempo += 0.11;
                }
                CACHE_A[linea][2] = etiqueta;
            }
            siguiente++;

        } else if (tipo == 4) {
            final int bloque = pos / tamBloque;
            final int conjunto = bloque % conjuntosCache;
            final int etiqueta = bloque / conjuntosCache;

            if (siguienteConjunto[conjunto][0] > tamConjunto - 1) {
                siguienteConjunto[conjunto][0] = 0;
            }

            int linea;
            if ((linea = estaEnConjunto(conjunto, etiqueta)) != -1) {
                //tiempo += 0.01;
                CACHE_CONJUNTO[conjunto][linea][1] = 1;
            }

            linea = siguienteConjunto[conjunto][0];

            if (CACHE_CONJUNTO[conjunto][linea][0] == -1) {
                CACHE_CONJUNTO[conjunto][linea][0] = 1;
                CACHE_CONJUNTO[conjunto][linea][2] = etiqueta;
                //tiempo += 0.11;
            } else {
                if (CACHE_CONJUNTO[conjunto][linea][1] == 1) {
                    //tiempo += 0.22;
                } else {
                    //tiempo += 0.11;
                }
            }
            siguienteConjunto[conjunto][0]++;
        }
    }

    public int leer(int pos, int tipo) {
        int dato = 0;
        if (tipo == 1) {
            dato = RAM[pos];
            tiempo += 0.1;
        } else if (tipo == 2) {

        } else if (tipo == 3) {
            if (siguiente > lineaCache - 1) {
                siguiente = 0;
            }
            final int bloque = pos / tamBloque;

            if (estaEnCacheA(bloque) != -1) {
                tiempo += 0.01;
            }

            final int linea = siguiente;
            final int etiqueta = bloque;

            if (CACHE_A[linea][0] == -1) {
                CACHE_A[linea][0] = 1;
                CACHE_A[linea][1] = -1;
                CACHE_A[linea][2] = etiqueta;
                siguiente++;
                tiempo += 0.11;
            } else {
                if (CACHE_A[linea][1] == 1) {
                    CACHE_A[linea][1] = -1;
                    tiempo += 0.22;
                } else {
                    tiempo += 0.11;
                }
                CACHE_A[linea][2] = etiqueta;
                siguiente++;
            }

        } else if (tipo == 4) {
            final int bloque = pos / tamBloque;
            final int conjunto = bloque % conjuntosCache;
            final int etiqueta = bloque / conjuntosCache;

            if (siguienteConjunto[conjunto][0] > tamConjunto - 1) {
                siguienteConjunto[conjunto][0] = 0;
            }

            if (estaEnConjunto(conjunto, etiqueta) != -1) {
                //tiempo += 0.01;
            }

            int linea = siguienteConjunto[conjunto][0];

            if (CACHE_CONJUNTO[conjunto][linea][0] == -1) {
                CACHE_CONJUNTO[conjunto][linea][0] = 1;
                CACHE_CONJUNTO[conjunto][linea][1] = -1;
                CACHE_CONJUNTO[conjunto][linea][2] = etiqueta;
                siguienteConjunto[conjunto][0]++;
                //tiempo += 0.11;
            } else {
                if (CACHE_CONJUNTO[conjunto][linea][1] == 1) {
                    CACHE_CONJUNTO[conjunto][linea][1] = -1;
                    //tiempo += 0.22;
                } else {
                    //tiempo += 0.11;
                }
                CACHE_CONJUNTO[conjunto][linea][2] = etiqueta;
                siguienteConjunto[conjunto][0]++;
            }
        }
        return dato;
    }

    private int estaEnConjunto(int conjunto, int etiqueta) {
        for (int i = 0; i < tamConjunto; i++) {
            if (CACHE_CONJUNTO[conjunto][i][2] == etiqueta) {
                return i;
            }
        }
        return -1;
    }

    private int estaEnCacheA(int bloque) {
        for (int i = 0; i < lineaCache; i++) {
            if (CACHE_A[i][2] == bloque) {
                return i;
            }
        }
        return -1;
    }

    public int ordenar(int tipo) {
        int n = 4096;
        int cambios = 1;
        int limite = n - 1;
        //this.tiempo = 0;

        int a = 0;
        int b = 0;

        while (cambios > 0) {
            cambios = 0;
            b = leer(0, tipo);
            for (int i = 0; i <= limite; i++) {
                a = leer(i, tipo);
                if (a < b) {
                    escribir(i, tipo, b);
                    escribir(i - 1, tipo, a);
                    a = b;
                    cambios++;
                }
                b = a;
            }
            limite--;

        }
        return this.tiempo;
    }

    public int[] getRAM() {
        return RAM;
    }

    public int getTiempo() {
        return tiempo;
    }

}
