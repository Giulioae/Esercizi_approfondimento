/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi_telefoni;

/**
 *
 * @author Giulio
 */

/*
Definisci la classe TelefonoCellulare dandone la rappresentazione completa (questo esercizio)
*/
   
public class TelefonoCellulare_Compl {
    private String marca;
    private String modello;
    private double prezzo;

    public  TelefonoCellulare_Compl(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "TelefonoCellulare [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
    }
}



