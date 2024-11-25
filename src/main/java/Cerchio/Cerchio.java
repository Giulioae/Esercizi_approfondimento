/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cerchio;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Cerchio che permetta di calcolare l’area e il perimetro di un cerchio con centro
di coordinate Xc e Yc
*/

class Cerchio {
    private double xCentro;
    private double yCentro;
    private double raggio;

    public Cerchio(double xCentro, double yCentro, double raggio) {
        this.xCentro = xCentro;
        this.yCentro = yCentro;
        this.raggio = raggio;
    }

    public double calcolaArea() { // calcolo dell'area del cerchio
        return Math.PI * raggio * raggio;
    }

    public double calcolaPerimetro() { // calcolo del perimetro del cerchio 
        return 2 * Math.PI * raggio;
    }
}


