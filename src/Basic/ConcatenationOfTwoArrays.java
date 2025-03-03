package Basic;
import java.util.Scanner;
public class ConcatenationOfTwoArrays {
    public static void main(String[] args) {
        //taking input
        System.out.println("Enter length of 1st array");
        Scanner n = new Scanner(System.in);
        int len1 = n.nextInt();
        System.out.println("Enter length of 2nd array");
        int len2 = n.nextInt();
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int[] arr3 = new int[len1 + len2];
        System.out.println("Enter values of 1st array");
        for (int i = 0; i < len1; i++) {
            arr1[i] = n.nextInt();
        }
        System.out.println("Enter values of 2nd array");
        for (int i = 0; i < len2; i++) {
            arr2[i] = n.nextInt();
        }

        //logic starts
        for (int i = 0; i < len1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < len2; i++) {
            arr3[len1 + i] = arr2[i];
        }
        for (int j = 0; j < arr3.length; j++) {
            System.out.print("After concatenation " + arr3[j] + ",");
        }
    }
}