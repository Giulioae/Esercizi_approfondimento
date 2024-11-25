/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auto;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome
del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un
metodo del tipo String toString() per la sua descrizione.
*/

class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int anno;

    public Auto(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }

    @Override // ridefinisce il metodo in una sottoclasse
    public String toString() {
        return "Auto [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", anno=" + anno + "]";
    }
}


