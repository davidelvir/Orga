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

    int tam_cache = 1024;
    final int bloq = 16;
    int lin_cache = tam_cache / bloq;
    int lin_conj = 8;

    final int tamConjunto = 4;
    int siguiente = 0;
    public int[][][] CACHE_CONJUNTO = new int[16][4][3];
    int CACHE_A[][] = new int[lin_cache][3];
    public int[] siguienteConjunto = new int[lin_cache / lin_conj];

    public int k = 8; // tamaño del bloque
    public int m = 1024; //numero de lineas

    public double tiempo = 0;

    public int[] RAM = new int[4096];
    public int[][] CACHE = new int[lin_cache][bloq + 3];

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

        if (tipo == 0) {
            RAM[pos] = dato;
            tiempo += 0.1;

        } else if (tipo == 1) {

            int bloque = pos / this.bloq;
            int linea = bloque % lin_cache;
            int palabra = pos % this.bloq;

            if (CACHE[linea][0] == 1) {
                if (CACHE[linea][1] == bloque) {
                    tiempo += 0.01;
                    CACHE[linea][palabra + 3] = dato;
                    CACHE[linea][2] = 1;

                } else if (CACHE[linea][2] == 1) {
                    tiempo += 0.21;
                    int actBloq = CACHE[linea][3] / this.bloq;
                    int posRAM = actBloq * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posRAM] = CACHE[linea][i + 3];
                        posRAM++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][2] = 1;
                    CACHE[linea][palabra + 3] = dato;
                } else {
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 1;
                    CACHE[linea][palabra + 3] = dato;
                }
            } else {
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 1;
                CACHE[linea][palabra + 3] = dato;
            }

        } else if (tipo == 2) {

            int bloque = pos / this.bloq;
            int linea = estaEnCacheA(bloque);
            int palabra = pos % this.bloq;
            if (CACHE[linea][0] == 1) {
                if (CACHE[linea][1] == bloque) {
                    tiempo += 0.01;
                    CACHE[linea][palabra + 3] = dato;
                    CACHE[linea][2] = 1;
                } else if (CACHE[linea][2] == 1) {
                    tiempo += 0.21;
                    int actBloq = CACHE[linea][3] / this.bloq;
                    int posRAM = actBloq * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posRAM] = CACHE[linea][i + 3];
                        posRAM++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][2] = 1;
                    CACHE[linea][palabra + 3] = dato;
                } else {
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 1;
                    CACHE[linea][palabra + 3] = dato;
                    siguiente++;
                    if (siguiente == lin_cache) {
                        siguiente = 0;
                    }
                }
            } else {
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 1;
                CACHE[linea][palabra + 3] = dato;
                siguiente++;
                if (siguiente == lin_cache) {
                    siguiente = 0;
                }
            }

        } else if (tipo == 3) {

            int bloque = pos / this.bloq;
            int conjunto = bloque % (lin_cache / lin_conj);
            int palabra = pos % this.bloq;
            int linea = lineaDeCache(bloque, conjunto);

            if (CACHE[linea][0] == 1) {
                if (existeEnCache(bloque, conjunto)) {
                    tiempo += 0.01;
                    CACHE[linea][palabra + 3] = dato;
                } else if (CACHE[linea][2] == 1) {
                    int actBloq = CACHE[linea][1];
                    int posEnRam = actBloq * this.bloq;

                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posEnRam] = CACHE[linea][i + 3];
                        posEnRam++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    tiempo += 0.21;
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    CACHE[linea][palabra + 3] = dato;
                } else {
                    siguienteConjunto[conjunto]++;
                    if (siguienteConjunto[conjunto] % (lin_conj) == 0) {
                        siguienteConjunto[conjunto] -= 8;
                    }
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][0] = 1;
                    CACHE[linea][2] = 0;
                    CACHE[linea][palabra + 3] = dato;

                }

            } else {
                siguienteConjunto[conjunto]++;
                if (siguienteConjunto[conjunto] % lin_conj == 0) {
                    siguienteConjunto[conjunto] -= 8;
                }
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 0;
                CACHE[linea][palabra + 3] = dato;
            }

        }
    }

    public int leer(int pos, int tipo) {
        int dato = 0;
        if (tipo == 0) {
            dato = RAM[pos];
            tiempo += 0.1;
        } else if (tipo == 1) {

            int bloque = pos / this.bloq;
            int linea = bloque % lin_cache;
            int palabra = pos % this.bloq;

            if (CACHE[linea][0] == 1) {
                if (CACHE[linea][1] == bloque) {
                    tiempo += 0.01;
                    return CACHE[linea][palabra + 3];
                } else if (CACHE[linea][2] == 1) {
                    int actBloq = CACHE[linea][3] / this.bloq;
                    int posRAM = actBloq * this.bloq;

                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posRAM] = CACHE[linea][i + 3];
                        posRAM++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    tiempo += 0.21;
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    return CACHE[linea][palabra + 3];
                } else {
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    return CACHE[linea][palabra + 3];

                }
            } else {
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 0;
                return CACHE[linea][palabra + 3];

            }
        } else if (tipo == 2) {
            int bloque = pos / this.bloq;
            int linea = estaEnCacheA(bloque);
            int palabra = pos % this.bloq;
            if (CACHE[linea][0] == 1) {
                if (CACHE[linea][1] == bloque) {
                    tiempo += 0.01;
                    return CACHE[linea][palabra + 3];
                } else if (CACHE[linea][2] == 1) {
                    int actBloq = CACHE[linea][3] / this.bloq;
                    int posRAM = actBloq * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posRAM] = CACHE[linea][i + 3];
                        posRAM++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    tiempo += 0.21;
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    return CACHE[linea][palabra + 3];
                } else {
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    siguiente++;
                    if (siguiente == lin_cache) {
                        siguiente = 0;
                    }
                    return CACHE[linea][palabra + 3];
                }
            } else {
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 0;
                siguiente++;
                if (siguiente == lin_cache) {
                    siguiente = 0;
                }
                return CACHE[linea][palabra + 3];
            }

        } else if (tipo == 3) {

            int bloque = pos / this.bloq;
            int conjunto = bloque % (lin_cache / lin_conj);
            int palabra = pos % this.bloq;
            int linea = lineaDeCache(bloque, conjunto);

            if (CACHE[linea][0] == 1) {
                if (existeEnCache(bloque, conjunto)) {
                    tiempo += 0.01;
                    return CACHE[linea][palabra + 3];
                } else if (CACHE[linea][2] == 1) {
                    int actBloq = CACHE[linea][1];
                    int posRAM = actBloq * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        RAM[posRAM] = CACHE[linea][i + 3];
                        posRAM++;
                    }
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    tiempo += 0.21;
                    CACHE[linea][1] = bloque;
                    CACHE[linea][2] = 0;
                    return CACHE[linea][palabra + 3];
                } else {
                    siguienteConjunto[conjunto]++;
                    if (siguienteConjunto[conjunto] % lin_conj == 0) {
                        siguienteConjunto[conjunto] -= 8;
                    }
                    tiempo += 0.11;
                    int pos1 = bloque * this.bloq;
                    for (int i = 0; i < this.bloq; i++) {
                        CACHE[linea][i + 3] = RAM[pos1];
                        pos1++;
                    }
                    CACHE[linea][1] = bloque;
                    CACHE[linea][0] = 1;
                    CACHE[linea][2] = 0;
                    return CACHE[linea][palabra + 3];

                }

            } else {
                siguienteConjunto[conjunto]++;
                if (siguienteConjunto[conjunto] % lin_conj == 0) {
                    siguienteConjunto[conjunto] -= 8;
                }
                tiempo += 0.11;
                int pos1 = bloque * this.bloq;
                for (int i = 0; i < this.bloq; i++) {
                    CACHE[linea][i + 3] = RAM[pos1];
                    pos1++;
                }
                CACHE[linea][1] = bloque;
                CACHE[linea][0] = 1;
                CACHE[linea][2] = 0;
                return CACHE[linea][palabra + 3];
            }

        }
        return dato;
    }

    public int lineaDeCache(int bloque, int conjunto) {
        int lineaCont = conjunto * lin_conj;
        for (int i = 0; i < lin_conj; i++) {
            if (bloque == CACHE[lineaCont][1]) {
                return lineaCont;
            }
            lineaCont++;
        }
        return siguienteConjunto[conjunto];
    }

    public boolean existeEnCache(int bloque, int conjunto) {
        int lineaCont = conjunto * lin_conj;
        for (int i = 0; i < lin_conj; i++) {
            if (bloque == CACHE[lineaCont][1]) {
                return true;
            }
            lineaCont++;
        }
        return false;
    }

    private int estaEnCacheA(int bloque) {
        for (int i = 0; i < lin_cache; i++) {
            if (CACHE[i][1] == bloque) {
                return i;
            }
        }
        return siguiente;
    }

    public double ordenar(int tipo) {
        int n = 1200;
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

    public double getTiempo() {
        return tiempo;
    }

    public double pruebaEscritorio(int tipo) {
        this.tiempo = 0;
        int menor = 0, mayor = 0;
        escribir(100, tipo, 10);    //En la memoria 100 escribe un 10
        escribir(101, tipo, 13);
        escribir(102, tipo, 21);
        escribir(103, tipo, 11);
        escribir(104, tipo, 67);
        escribir(105, tipo, 43);
        escribir(106, tipo, 9);
        escribir(107, tipo, 11);
        escribir(108, tipo, 19);
        escribir(109, tipo, 23);
        escribir(110, tipo, 32);
        escribir(111, tipo, 54);
        escribir(112, tipo, 98);
        escribir(113, tipo, 7);
        escribir(114, tipo, 13);
        escribir(115, tipo, 1);
        menor = leer(100, tipo);
        mayor = menor;
        int a = 0;
        for (int i = 101; i <= 115; i++) {
            a++;
            escribir(615, tipo, a);
            if (leer(i, tipo) < menor) {
                menor = leer(i, tipo);
            }
            if (leer(i, tipo) > mayor) {
                mayor = leer(i, tipo);
            }
        }
        return this.tiempo;
    }

}
