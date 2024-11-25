/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore3_moduloN_passoP;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Contatore moduloNche permetta di incrementare e decrementare una variabile
di un passo P fino al raggiungimento del valore N: successivamente il conteggio riparte da 0.
*/


class Contatore3_moduloN_passoP {
    private int valore = 0;
    private int limite;
    private int passo;

    public Contatore3_moduloN_passoP(int limite, int passo) {
        this.limite = limite;
        this.passo = passo;
    }

    public void incrementa() {
        valore = (valore + passo) % limite;
    }

    public void decrementa() {
        valore = (valore - passo + limite) % limite;
    }

    public int getValore() {
        return valore;
    }
}

