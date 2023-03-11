package hasilpenjualan;
import java.util.Scanner;
public class HasilPenjualan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan harga beli : ");
        int hargaBeli = input.nextInt();
        System.out.print("Masukkan harga jual : ");
        int hargaJual = input.nextInt();
        int keuntungan = hargaJual - hargaBeli;
        
        if (keuntungan > 0){
            System.out.println("Untung sebesar : " + keuntungan);
        } else if (keuntungan < 0){
            System.out.println("Rugi sebesar : " + keuntungan);
        } else{
            System.out.println("Sama saja");
        }
    }
    
}