package uniquenumbers;
import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        String input = "1122";
        int[] uniqueNumbers = findUniqueNumbers(input);
        System.out.println(Arrays.toString(uniqueNumbers));
    }

    public static int[] findUniqueNumbers(String input) {
        Map<Character, Integer> counts = new HashMap<>();
        // Menghitung jumlah kemunculan setiap angka di input
        for (char c : input.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        // Membuat list untuk menampung angka-angka yang hanya muncul satu kali
        List<Integer> unique = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (counts.get(c) == 1) {
                unique.add(Character.getNumericValue(c));
            }
        }
        // Mengubah list menjadi array
        int[] uniqueNumbers = new int[unique.size()];
        for (int i = 0; i < uniqueNumbers.length; i++) {
            uniqueNumbers[i] = unique.get(i);
        }
        return uniqueNumbers;
    }
}

