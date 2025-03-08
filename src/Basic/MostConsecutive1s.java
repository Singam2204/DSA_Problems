package Basic;

public class MostConsecutive1s {
    public static void main(String[] args) {
        int[] arr = {4,5,1,1,1,1,6,1,1,6,1,1,1,1,1};
        int count=0;
        int finalCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==1){
                count= count+1;
            } else{
                finalCount=Math.max(finalCount,count);
                count=0;
            }
        }
        finalCount=Math.max(finalCount,count);
        System.out.println(finalCount);
    }
}