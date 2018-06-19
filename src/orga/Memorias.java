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

    public int k = 8; // tamaño del bloque
    public int m = 1024; //numero de lineas

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
        } else if (tipo == 2) {

        } else if (tipo == 3) {

        } else if (tipo == 4) {

        }
    }

    public int leer(int pos, int tipo) {
        int dato = 0;
        if (tipo == 1) {
            dato = RAM[pos];
        } else if (tipo == 2) {

        } else if (tipo == 3) {

        } else if (tipo == 4) {

        }
        return dato;
    }

    public void ordenar() {
        int n = 4096;
        int cambios = 1;
        int limite = n - 1;

        int a = 0;
        int b = 0;

        while (cambios > 0) {
            cambios = 0;
            b = leer(0, 1);
            for (int i = 0; i <= limite; i++) {
                a = leer(i, 1);
                if (a < b) {
                    escribir(i, 1, b);
                    escribir(i - 1, 1, a);
                    a = b;
                    cambios++;
                }
                b = a;
            }
            limite--;
        
    }
    }

    public int[] getRAM() {
        return RAM;
    }
    

}
