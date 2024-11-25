/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore1;

/**
 *
 * @author Giulio
 */



/*
Definire una classe Contatore che permetta di incrementare e decrementare una variabile di una
singola unità.
*/


class Contatore1 {
    private int valore;

    public void incrementa() {
        valore++;
    }

    public void decrementa() {
        valore--;
    }

    public int getValore() {
        return valore;
    }
}

