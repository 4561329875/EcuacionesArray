/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionaraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EcuacionArayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ecuacion ec = new Ecuacion();
        Scanner leer = new Scanner(System.in);

        System.out.println("aX^2+bX+c=Y");
        int a, b, c;

        System.out.print("Ingrese el termino a: ");
        a = leer.nextInt();
        System.out.print("Ingrese el termino b: ");
        b = leer.nextInt();
        System.out.print("Ingrese el termino c: ");
        c = leer.nextInt();

        ec.cargar(a, b, c);
        ArrayList<Coordenada> tabla=ec.tabla();
        
        System.out.println("x\ty");
        for(Coordenada punto:tabla){
            System.out.println(punto.getX()+"\t"+punto.getY());
        
        
        }
        
    }

}
