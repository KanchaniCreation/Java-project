import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number where u get the series ");
        int num = sc.nextInt();
        int first = 0,second=1;
        System.out.println(("fibonacci series up to"));
        for( int i=1;i<=num;i++){
            System.out.println(first+"");
            int next = first+second;
            first=second;
            second=next;
        }
    }
    
}
