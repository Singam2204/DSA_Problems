package Basic;
import java.util.Scanner;
public class SecondLargestNumINArray {
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner n = new Scanner(System.in);
        int len = n.nextInt();
        int max;
        int sec_max;
        int[] arr = new int[len];
        System.out.println("Enter values");
        for (int i = 0; i < len; i++) {
            arr[i]=n.nextInt();
        }
        int j = 1;
        max=arr[0];
        sec_max=arr[0];
        while (j<len){
            if(arr[j]>max){
                sec_max= max;
                max=arr[j];
            }
            else if(arr[j]>sec_max){
                sec_max= arr[j];
            }
            System.out.println(max +"  "+sec_max);
            j++;
        }
        System.out.println("Largest: "+ max);
        System.out.println("Second Largest: "+ sec_max);
    }
}