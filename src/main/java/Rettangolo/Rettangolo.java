/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rettangolo;

/**
 *
 * @author Giulio
 */

/*
Definire una classe Rettangolo che permetta di calcolare l’area e il perimetro di un rettangolo posi-
zionato nel piano cartesiano del quale si conoscono le 4 coordinate cartesiane dei quattro punti
che lo individuano.
*/

class Rettangolo {
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    public Rettangolo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }

    public double calcolaArea() { // calcolo dell'area del rettangolo 
        return Math.abs((x2 - x1) * (y3 - y1));
    }

    public double calcolaPerimetro() { // calcolo del perimetro del rettangolo
        return 2 * (Math.abs(x2 - x1) + Math.abs(y3 - y1));
    }
}

