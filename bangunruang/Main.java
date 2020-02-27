
package bangunruang;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pilih,sisi,panjang,lebar,tinggi,alas,tinggip;
        Scanner input = new Scanner(System.in);
        System.out.println("=====  MENU  =====");
        System.out.println("1. Persegi");
        System.out.println("2. Kubus");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Balok");
        System.out.println("5. Segitiga");
        System.out.println("6. Prisma Segitiga");
        System.out.print("PILIH :  ");
        pilih = input.nextInt();
        
    switch (pilih){
        case 1 :
            System.out.println("PERSEGI");
            System.out.print("Masukkan sisi persegi  = ");
            sisi = input.nextInt();
            Persegi hitungpersegi = new Persegi(sisi); 
            System.out.println("luas persegi = "+hitungpersegi.luas());
            System.out.println("keliling persegi = "+hitungpersegi.keliling());
        break;
        case 2 :
            System.out.println("KUBUS");
            System.out.print("masukkan sisi kubus  = ");
            sisi = input.nextInt();
            Kubus hitungkubus;
            hitungkubus = new Kubus(sisi);
            System.out.println("volume kubus = "+hitungkubus.volume());
            System.out.println("luaspermukaan kubus  = "+hitungkubus.luaspermukaan());
        break ;
        case 3 :
            System.out.println("PERSEGI PANJANG");
            System.out.print("masukkan panjang  = ");
            panjang = input.nextInt();
            System.out.print("masukkan lebar  = ");
            lebar = input.nextInt();
            PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar); 
            System.out.println("luas persegi panjang= "+persegipanjang.luas());
            System.out.println("keliling persegi panjang  = "+persegipanjang.keliling());
        break;
        case 4 :
            System.out.println("BALOK");
            System.out.print("masukkan panjang balok = ");
            panjang = input.nextInt();
            System.out.print("masukkan lebar balok = ");
            lebar = input.nextInt();
            System.out.print("masukkan tinggi balok = ");
            tinggi = input.nextInt();
            Balok hitungbalok = new Balok(panjang,lebar,tinggi); 
            System.out.println("volume balok = "+hitungbalok.volume());
            System.out.println("luaspermukaan balok = "+hitungbalok.luaspermukaan());
        break;
        case 5 : 
            System.out.println("SEGITIGA");
            System.out.print("Masukan Alas  = ");
            alas = input.nextInt();
            System.out.print("masukkan Tinggi  = ");
            tinggi = input.nextInt();
            Segitiga segitiga = new Segitiga(alas,tinggi); 
            System.out.println("luas lingkaran= "+segitiga.luas());
            System.out.println("keliling persegi panjang  = "+segitiga.keliling());
        break;
        case 6 :
            System.out.println("PRISMA SEGITIGA");
            System.out.print("masukkan panjang alas = ");
            alas = input.nextInt();
            System.out.print("masukkan tinggi alas = ");
            tinggi = input.nextInt();
            System.out.print("masukkan tinggi prisma = ");
            tinggip = input.nextInt();
            PrismaSegitiga hitungprisma = new PrismaSegitiga(alas,tinggi,tinggip); 
            System.out.println("volume balok = "+hitungprisma.volume());
            System.out.println("luaspermukaan balok = "+hitungprisma.luaspermukaan());
        break;
            
    
    }
    }
    
}
