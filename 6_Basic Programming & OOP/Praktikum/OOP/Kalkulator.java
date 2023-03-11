package kalkulator;
public class Kalkulator {

    public static void main(String[] args) {
        int resultAdd = add(3, 4);
        System.out.println("Penjumlahan : " + resultAdd);
        
        int resultSubtract = subtract(15, 4);
        System.out.println("Pengurangan : " + resultSubtract);
        
        int resultMultiply = multiply(10, 10);
        System.out.println("Perkalian : " + resultMultiply);
        
        int resultDivide = divide(12, 3);
        System.out.println("Pembagian : " + resultDivide);
    }
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static int subtract(int a, int b){
        return a-b;
    }
    
    public static int multiply(int a, int b){
        return a*b;
    }
    
    public static int divide(int a, int b){
        return a/b;
    }   
}