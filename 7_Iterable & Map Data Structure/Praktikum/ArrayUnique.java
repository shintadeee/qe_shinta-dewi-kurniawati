package arrayunique;
import java.util.*;
public class ArrayUnique {
    public static void main(String[] args) {
        int[] arr1 = {3, 8};
        int[] arr2 = {2, 8};
        int[] result = getUniqueElements(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getUniqueElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        for (int num : arr1) {
            if (!set.contains(num)) {
                duplicates.add(num);
            }
        }

        int[] result = new int[duplicates.size()];
        int index = 0;
        for (int num : duplicates) {
            result[index++] = num;
        }
        return result;
    }
}
