/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol.pkg1_5;

import java.util.Scanner;

/**
 *
 * @author Kincl, Přibyl, Pilát
 */
public class Ukol1_5 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner koncime = new Scanner(System.in);
        Scanner skenerObjekt = new Scanner(System.in);
        
        char konec;
        
        do{
        konec = 0;
        System.out.println("Zadej číslo: ");
        int číslo = skenerObjekt.nextInt();
        tiskCislo(číslo);
        System.out.println("Chces opakovat zadani ? (A/N) : ");
        konec = koncime.next().charAt(0);
        }while(konec == 'a' || konec == 'A');
        
        
    }
    
    public static void tiskCislo(int číslo) {
         
        System.out.println("Dekadický tvar je " + číslo);
        
        String bin = Integer.toBinaryString(číslo);
        System.out.println("Binární tvar je " + bin);
        
        String hex = Integer.toHexString(číslo);
        System.out.println("Hexadecimální tvar je " + hex);
        
        String oct = Integer.toOctalString(číslo);
        System.out.println("Osmičkový tvar je " + oct);
        
        return;
     
    }
}
