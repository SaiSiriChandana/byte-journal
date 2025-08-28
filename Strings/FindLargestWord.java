
public class FindLargestWord {
    //sentence="hi i am siri"
    //largest word="siri"
    //length(largest_word)=4
    public static int findLargestWordLen(String word){

        String[] words = word.trim().split("\\s+");
        int max=0;
        for(String w:words){
            int len=w.length();
            if(len>max){
                max=len;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        String word = "hi i am siri";
        System.out.println(findLargestWordLen(word));

    }

}
