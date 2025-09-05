import java.util.Scanner;
public class prime {
    public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
        int div =2;
        while (div<n) {
            if(n%div==0){
                System.out.println("number is not  prime");
            break ;
            }
             else {
                div=div+1;
        }
    }

    System.out.println("number is prime");
}
}