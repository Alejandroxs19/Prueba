package prueba;

import java.util.Scanner;
import java.util.Vector;

public class Prueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vector<RellenaAleatorio> vectorAleatorio = new Vector<RellenaAleatorio>();
        
        for (int i = 0; i < 4; i++) {
            vectorAleatorio.add(new RellenaAleatorio((int)(i*Math.random())));
        }
    }
    
}
