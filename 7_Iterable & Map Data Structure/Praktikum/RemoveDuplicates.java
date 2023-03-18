package removeduplicates;

public class RemoveDuplicates {
    public static int remove(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int nonDuplicateIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[nonDuplicateIndex - 1]) {
                arr[nonDuplicateIndex++] = arr[i];
            }
        }
        return nonDuplicateIndex;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,11};
        int length = remove(arr);
        System.out.println("Length of subarray with no duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}