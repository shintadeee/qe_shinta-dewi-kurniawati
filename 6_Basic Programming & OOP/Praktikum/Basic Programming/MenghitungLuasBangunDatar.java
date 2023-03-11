package menghitung.luas.bangun.datar;
import java.util.Scanner;
public class MenghitungLuasBangunDatar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Menghitung Luas Segitiga
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan alas : ");
        float alas = input.nextFloat();
        System.out.print("Masukkan tinggi : ");
        float tinggi = input.nextFloat();
        float luasSegitiga = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga : " + luasSegitiga);
        
        //Menghitung Luas Persegi Panjang
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan panjang : ");
        float panjang = input.nextFloat();
        System.out.print("Masukkan lebar : ");
        float lebar = input.nextFloat();
        float luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        
        //MenghitungLuasLingkaran
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan jari-jari : ");
        float jari2 = input.nextFloat();
        float luasLingkaran = 3.14f * jari2 * jari2;
        System.out.println("Luas Lingkaran : " + luasLingkaran);
        
    }
    
}
