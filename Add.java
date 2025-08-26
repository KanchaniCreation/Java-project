import java.util.Scanner;

public class Add {
    int a , b , c;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter the no ");
        a = ip.nextInt();
        b = ip .nextInt();

    }

    void cal(){
        c = a+b;
        System.out.println("c = "+c);
    }

    public static void main(String arg[]){
        Add ob = new Add();
        ob.set();
        ob.cal();
    }

}
