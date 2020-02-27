
package bangunruang;


public class PrismaSegitiga extends Segitiga{
    int tinggip;
    double volume,luaspermukaan;
    PrismaSegitiga(int alas, int tinggi, int tinggip) {
       super(alas,tinggi);
       this.tinggip=tinggip;
    }
    double volume(){
        volume = super.luas()*tinggip;
        return volume;
    }
  

    double luaspermukaan() {
        luaspermukaan = (2*super.luas()+3*super.keliling()*tinggi);
        return luaspermukaan;   
    }
}
