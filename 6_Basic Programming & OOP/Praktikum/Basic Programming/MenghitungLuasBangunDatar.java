package menghitung.luas.bangun.datar;
public class MenghitungLuasBangunDatar {
    public static void main(String[] args){
        //Menghitung Luas Segitiga
        float alas = 20;
        float tinggi = 25;
        float luasSegitiga = 0.5f*alas*tinggi;
        System.out.println("Luas Segitiga : " + luasSegitiga);
        
        //Menghitung Luas Persegi Panjang
        float panjang = 40;
        float lebar = 6;
        float luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        
        //Menghitung Luas Lingkaran
        double jari2 = 7;
        double phi = 3.14;
        double luasLingkaran = phi*jari2*jari2;
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
