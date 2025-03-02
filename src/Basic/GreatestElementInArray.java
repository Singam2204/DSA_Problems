package Basic;

import java.util.Scanner;

public class GreatestElementInArray {
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner n = new Scanner(System.in);
        int len = n.nextInt();
        int max;
        int[] arr = new int[len];
        System.out.println("Enter values");
        for (int i = 0; i < len; i++) {
            arr[i]=n.nextInt();
        }
        int j = 0;
        max=0;
        while (j<len){
            if(max<arr[j]){
                max=arr[j];
            }
            j++;

        }
        System.out.println(max + " is the greatest number");

    }
}