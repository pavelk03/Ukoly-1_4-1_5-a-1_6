/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1_6final;

/**
 *
 * @author kincl, přibyl, pilát
 */
public class Ukol1_6final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] max = getMaximum();
        double[] min = getMinimum();
        int[] size = getSize();
        
        final int k = 8; //konstanta
        
        System.out.format("|\tDat. typ (obal. třída)\t|\tVelikost v b a B\t|\tMinimální hodnota\t\t|\tMaximální hodnota\t\t|%n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tbyte (Byte)\t\t|\t " + size[0] +"b" + "\t|\t " + size[0]/k +"B" + "\t| " + "\tmin: " + min[0] + "\t\t\t|\t " + "max: " + max[0] + "\t\t\t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tint (Integer)\t\t|\t " + size[1] +"b" + "\t|\t " + size[1]/k +"B" + "\t| " + "\tmin: " + min[1] + "\t\t|\t " + "max: " + max[1] + " \t\t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tshort (Short)\t\t|\t " + size[2] +"b" + "\t|\t " + size[2]/k +"B" + "\t| " + "\tmin: " + min[2] + "\t\t\t|\t " + "max: " + max[2] + " \t\t\t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tlong (Long)\t\t|\t " + size[3] +"b" + "\t|\t " + size[3]/k +"B" + "\t| " + "\tmin: " + min[3] + "\t|\t " + "max: " + max[3] + " \t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tfloat (Float)\t\t|\t " + size[4] +"b" + "\t|\t " + size[4]/k +"B" + "\t| " + "\tmin: " + min[4] + "\t|\t " + "max: " + max[4] + " \t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");      
        System.out.format("|\tdouble (Double)\t\t|\t " + size[5] +"b" + "\t|\t " + size[5]/k +"B" + "\t| " + "\tmin: " + min[5] + "\t\t\t|\t " + "max: " + max[5] + " \t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("|\tchar (Character)\t|\t " + size[6] +"b" + "\t|\t " + size[6]/k +"B" + "\t| " + "\tmin: " + (int)min[6] + "\t\t\t\t|\t " + "max: " + (int)max[6] + " \t\t\t| %n");
        System.out.format("-------------------------------------------------------------------------------------------------------------------------------------------------%n");
        
        
        
// TODO code application logic here
    }

         
    public static double[] getMaximum()
    {
    double[] max = {Byte.MAX_VALUE, Integer.MAX_VALUE, Short.MAX_VALUE, Long.MAX_VALUE, Float.MAX_VALUE, Double.MAX_VALUE, Character.MAX_VALUE};
    return max;    
    }
    
    public static double[] getMinimum()
    {
    double[] min = {Byte.MIN_VALUE, Integer.MIN_VALUE, Short.MIN_VALUE, Long.MIN_VALUE, Float.MIN_VALUE, Double.MIN_VALUE, Character.MIN_VALUE};
    return min;    
    }
    
    public static int[] getSize()
    {
    int[] size = {Byte.SIZE, Integer.SIZE, Short.SIZE, Long.SIZE, Float.SIZE, Double.SIZE, Character.SIZE};
    return size;    
    }

}