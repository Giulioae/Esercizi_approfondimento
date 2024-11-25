/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore2_moduloN;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Contatore moduloNche permetta di incrementare e decrementare una variabile
di una singola unità fino al raggiungimento del valore N:successivamente il conteggio riparte da 0.
*/


class Contatore2_moduloN {
    private int valore = 0;
    private int limite;

    public Contatore2_moduloN(int limite) {
        this.limite = limite;
    }

    public void incrementa() {
        valore = (valore + 1) % limite;
    }

    public void decrementa() {
        valore = (valore - 1 + limite) % limite;
    }

    public int getValore() {
        return valore;
    }
}

