/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prodotto;

/**
 *
 * @author Giulio
 */

/*
Creare una classe Prodotto con due metodi costruttori che inizializzino lo stato dell’oggetto, dotato
dei seguenti attributi:
– string proprietario
– string nomeNegozio
*/

class Prodotto {
    private String proprietario;
    private String nomeNegozio;

    // Primo costruttore
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    // Secondo costruttore
    public Prodotto() {
        this("Sconosciuto", "Nessun Negozio");
    }

    @Override // // ridefinisce il metodo in una sottoclasse
    public String toString() {
        return "Prodotto [proprietario=" + proprietario + ", nomeNegozio=" + nomeNegozio + "]";
    }
}

