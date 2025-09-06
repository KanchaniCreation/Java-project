import java.util.Scanner ;
public class sumNatural {
     
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = sc.nextInt();

    int sum=0,val=1;
    while(val<=num) {
    	sum=  sum +val;
    	System.out.println(sum);
    	val++ ;
   

        }
   System.out.println(sum);



    }
    
    }
