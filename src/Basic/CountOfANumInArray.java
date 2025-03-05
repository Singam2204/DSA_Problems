package Basic;

import java.util.Scanner;
import java.lang.*;

class CountOfANumInArray{
    public static void main (String[] args) throws Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int len = sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter the Number to count");
        int target= sc.nextInt();
        int count = 0;
        System.out.println("Enter Values of Array");
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //logic starts
        for(int j = 0; j <len; j++) {
            if(arr[j]==target){
                count+=1;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else {
            System.out.println("Not Found");
        }



    }
}