public class Palindrome {
    public static void main(String[] args) {

        int n=54344345,r;
        int sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        if(sum==temp)
        System.out.println("given number is palindrome");
        else System.out.println("given number is not palindrome");

}}