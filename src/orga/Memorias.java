/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga;

/**
 *
 * @author David
 */
public class Memorias {

    public int[] RAM = new int[4096];
    public int[] CACHE = new int[1024];

    public void CD() {
        for (int i = 0; i < 4096; i++) {
            if (i % 16 == 0) {
                //marca las lineas como validas y modificada
                CACHE[i] = 0;
                CACHE[i + 1] = 0;
            }
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

}
