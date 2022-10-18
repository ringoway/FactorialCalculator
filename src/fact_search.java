import java.util.Scanner;

public class fact_search {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(fac(scan.nextInt()));
    }
    private static int fac(int n){
        if(n==1)
            return 1;
        return n *fac(n-1);
    }


}
