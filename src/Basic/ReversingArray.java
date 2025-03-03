package Basic;
import java.util.Scanner;
public class ReversingArray{
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner n = new Scanner(System.in);
        int len = n.nextInt();
        int[] arr = new int[len];
        int[] arr2 = new int[len];
        System.out.println("Enter values");
        for (int i = 0; i < len; i++) {
            arr[i]=n.nextInt();
        }
        for(int i=0; i < len;i++){
            System.out.print(arr[i]+" ");
        }
        //logic start
        for(int j=len-1; j>=0;j--){
            arr2[len-1-j]=arr[j];
        }
//        for(int j=0;j<len-1;j++){
//            arr2[j]= arr[len-1-j];
//        }

//        int k=0;
//        for(int j=arr.length-1; j>=0;j--){
//            arr2[k]=arr[j];
//            k++;
//        }
        System.out.println();
        System.out.print("Array 2: ");
        for(int i=0; i < len;i++){
            System.out.print(arr2[i]+" ");
        }
        }
}
