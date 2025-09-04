import java.util.Scanner ;
public class greaterNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();
	if (a>b) {
		if(a>c) {
		System.out.println("a is greatest");
	}
	}
	else {
		System.out.println("a is smallest");
	}
    
	}
}


