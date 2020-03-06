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
public class MultipleCatch {
    public static void main(String[] args){
        System.out.println("******** MENGGUNAKAN MULTIPLE CATCH *********");
        try{
            int[] array = new int[9];
            array[9]=13/0;
            System.out.println("elemen array indeks ke 9 adalah"+array[9]);
            System.out.println("pernyataan ini ada dalam blok try setelah bebas dari exception");
        } catch(ArrayIndexOutOfBoundsException exc){
            System.err.println("anda mengakses array di luar indeks yang di deklarasikan.");
        } catch(NegativeArraySizeException exc){
            System.err.println("anda mendeklarasikan array dengan ukuran negatif");
        } catch(Exception exc){
            System.err.println("anda melakukan pembagian blangan oleh nol.");
        }
    }
}
