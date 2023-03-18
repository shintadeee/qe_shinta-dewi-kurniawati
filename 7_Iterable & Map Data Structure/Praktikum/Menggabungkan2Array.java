package menggabungkan.pkg2.array;

import java.util.*;

public class Menggabungkan2Array {

    public static void main(String[] args) {
        String[] arr1 = {"lee", "jin"};
        String[] arr2 = {"kazuya", "panda"};
        String[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));
    }
    
    public static String[] mergeArrays(String[] arr1, String[] arr2){
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(new String[0]);
    }
    
}