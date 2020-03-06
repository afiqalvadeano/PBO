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
public class KlausaThrow {
    public static void main(String[] args){
        String input="Throw RuntimeException";
        System.out.println("\n******** MENGGUNAKAN KLAUSA THROW ********");
        try{
            if(input.equals("throw RUntimeException")){
                throw new RuntimeException("Melempar Exception");
            } else if (input==null){
                throw new NullPointerException();
            } else{
                System.out.println("Input adalah : "+input);
            }
            System.out.println("pernyataan dalam blok try setelah bebas dari pelemparan exception");
        }catch(Exception exc){
            System.err.println("Exception ditangkap disini");
            System.err.println("Exception yang di tangkap adalah"+exc);
        }
    }
}
