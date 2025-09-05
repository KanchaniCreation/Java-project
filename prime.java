public class prime {
    public static void main(String[] args ){
        int n =7, div =2;
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