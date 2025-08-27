import java.util.Scanner;
public class userfactorial {
    public static void main(String[] args){
        int fact =1 ,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int num = sc.nextInt();
        for (i=1;i<=num;i++){
            fact *= i ;
        }
        System.out.println(fact);



    }
    
}
