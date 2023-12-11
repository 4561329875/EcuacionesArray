/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacionaraylist;

import java.util.ArrayList;

/**
 *
 * @author labctr
 */
public class Ecuacion {

    private int a;
    private int b;
    private int c;

    public void cargar(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList<Coordenada> tabla() {
        ArrayList<Coordenada> r = new ArrayList<>();

        int i;

        for (i = (-10); i <= 10; i++) {
            Coordenada cord = new Coordenada();
            cord.setX(i);
            cord.setY(this.a * i * i + this.b * i + this.c);
            r.add(cord);

        }

        return r;

    }
}
