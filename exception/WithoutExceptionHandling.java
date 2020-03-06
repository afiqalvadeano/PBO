/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Lab Informatika
 */
public class WithoutExceptionHandling {
    public static void main(String[] args){
        System.out.println("\n******** PROGRAM Tanpa exception handling *******");
        try{
        int hasil=9/0;
        System.out.println("hasil pembagian = "+hasil);
        System.out.println("Pernyataan setelah bebas dari exception");
        } catch (ArithmeticException exc){
            System.out.println("");
            System.err.println("ArithmeticException menangkap exception hail pembagian oleh nol");
            System.err.println("Exception yang di tangkap adalah "+exc);
            System.out.println("");
        } finally{
            System.out.println("");
            System.out.println("Pernyataan dalam blok finally");
        }
        System.out.println("pernyataan ini diluar block try-catchfinally");
    
    }
    
}
