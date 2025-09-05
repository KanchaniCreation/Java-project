import java.util.Scanner ;
public class even {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int a = sc.nextInt();
    if (a%2==0){
        System.out.print("a is prime number ");
    }
    else {
        System.out.print("a is odd");
    }
}    
    
}
