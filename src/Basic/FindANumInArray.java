package Basic;

import java.util.*;
import java.lang.*;

class FindANumInArray
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int len = sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter the Number to find");
        int x= sc.nextInt();
        boolean ans = false;
        System.out.println("Enter Values of Array");
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //logic starts
        for(int j = 0; j <len; j++){
            if(arr[j]==x){
                ans= true;
                break;
            }
        }
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
