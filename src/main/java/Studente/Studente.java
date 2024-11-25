/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studente;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Studente per rappresentare oggettistudente con il cognome, il nome, il codice
fiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String
toString() per la sua descrizione.
*/

class Studente {
    private String cognome;
    private String nome;
    private String codiceFiscale;
    private int numeroMatricola;

    public Studente(String cognome, String nome, String codiceFiscale, int numeroMatricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMatricola = numeroMatricola;
    }

    @Override // ridefinisce il metodo in una sottoclasse
    public String toString() {
        return "Studente [cognome=" + cognome + ", nome=" + nome + ", codiceFiscale=" + codiceFiscale 
               + ", numeroMatricola=" + numeroMatricola + "]";
    }
}

