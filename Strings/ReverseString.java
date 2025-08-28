
public class ReverseString {
    //str="siri"
    //str="iris"
    public static void stringReversal(String name){
        char[] ch=name.toCharArray();
        int n=ch.length;
        int low=0;
        int high=n-1;
        while(low<high){
            char temp= ch[low];
            ch[low]=ch[high];
            ch[high]=temp;
            low++;
            high--;
        }
        System.out.println(new String(ch));


    }
    public static void main(String[] args){
        String name="siri";
        stringReversal(name);
    }
}
