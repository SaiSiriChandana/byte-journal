public class ReverseNum {
    //num=123
    //num=321
    public static int numberReversal(int num){
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args){
        int n=123;
        System.out.println(numberReversal(n));
    }
}
