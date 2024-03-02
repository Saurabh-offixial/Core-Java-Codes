import java.util.*;
public class ReverseArray{
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 4};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        System.out.println("\nArray elements in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}