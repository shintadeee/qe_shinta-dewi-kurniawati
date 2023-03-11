package enkripsi.sederhana;
public class EnkripsiSederhana {
    private static String encrypt(String s){
        String result = "";
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                //shift character by 10 places
                c=(char) (((c-'A') + 10) % 26 + 'A');
            }
            result += c;
        }
        return result;
    }
    
    public static void main(String[] args){
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
