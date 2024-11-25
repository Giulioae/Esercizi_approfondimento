/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto;

/**
 *
 * @author Giulio
 */

/*
Definisci una classe Punto che permetta di individuare un punto nel piano cartesiano, calcolando la
sua distanza dall’origine.
*/

class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanzaDallOrigine() {
        return Math.sqrt(x * x + y * y); // per radice quadrata
    }
}
