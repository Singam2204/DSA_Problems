package Basic;

public class Prime {
    public static void main(String[] args) {
        int num =1;
        if(num==1||num==2){
            System.out.print("Prime");
        }
        for(int c=2;c<num;c++){
            if(num%c!=0){
                System.out.print("Prime");
                break;
            }
            else{
                System.out.print("Not Prime");
                break;
            }
        }
    }
}
