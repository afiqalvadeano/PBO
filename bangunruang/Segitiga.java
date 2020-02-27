
package bangunruang;


public class Segitiga {
    int alas,tinggi;
    double luas,keliling;
    
    Segitiga (int alas, int tinggi) {
       this.alas = alas;
       this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggir() {
        return tinggi;
    }
    
    double luas(){
        luas = (alas*tinggi)/2;
        return luas;
    }
    double keliling(){
        keliling = 3*alas;
        return keliling;
    } 
}
