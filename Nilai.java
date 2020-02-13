/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int jum;
        float rata,max=0,min=100,total=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama    : ");
        nama = input.nextLine();
        System.out.print("Masukan Banyak Nilai    : ");
        jum = input.nextInt();
        System.out.println(" ");
        
        int nilai[] = new int [jum];
        
        for(int i=0;i<jum;i++){
            
            System.out.print("Masukan NIlai ke - "+ (i+1)+ " : ");
            nilai[i] = input.nextInt();
            
            if(nilai[i]>max){
                max=nilai[i];
            }
            if(nilai[i]<min){
                min=nilai[i];
            }
            total=total+nilai[i];
        
        }
        rata=total/jum;
        
        System.out.println("Nama            : "+nama);
        System.out.println("Nilai Tertinggi : "+max);
        System.out.println("Nilai Terendah  : "+min);
        System.out.println("Nila Rata-Rata  : "+rata);
        
    }
    
}
