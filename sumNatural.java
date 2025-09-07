import java.util.Scanner ;
public class sumNatural {
     
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n = sc.nextInt();

    int sum=0,val=1;
  //  while(val<=n) {
    //	sum=  sum +val;
    //	System.out.println(sum);
    //	val++ ;
   for (int i = 1;i<=n;i++){
    sum = sum+i;
    System.out.println(sum);
   }
System.out.println(sum);
        }
   



    }
    
    
