import java.util.Scanner;

public class fact_search {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int scan1 = scan.nextInt();
        int fact = 1;

        while (scan1>0){
            fact=fact*scan1--;
        }
        System.out.println(fact);

    }
}
