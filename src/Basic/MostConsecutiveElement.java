package Basic;

public class MostConsecutiveElement {
    public static void main(String[] args) {
        int[] arr = {4,5,1,1,1,6,2,2,2,2,5,5,5,5,5};
        int count=0;
        int maxCount=0;
        int i=0;
        int j=0;
        while (i<arr.length && j<arr.length){
            if(arr[i]==arr[j]){
                j++;
                count=count+1;
            }
            else{
                maxCount=Math.max(count,maxCount);
                count=0;
                i++;
            }
        }
        maxCount=Math.max(count,maxCount);
        System.out.println(maxCount);
    }
}