package Basic;
import java.util.Arrays;
public class ArraySort {
        public static void main(String[] args) {
            int[] arr = {1,3,4,2,8};
            Arrays.sort(arr);
            System.out.println(arr[arr.length-2]);
        }
}
