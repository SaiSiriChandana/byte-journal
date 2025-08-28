public class CountVowels {
    //string="siri"
    //vowels="i i"
    //vcount=2
    public static int vowelCount(String word){
        String v="aeiouAEIOU";
        int vcnt=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(v.indexOf(ch)!=-1){
                vcnt+=1;
            }
        }
        return vcnt;
    }
    public static void main(String[] args){
        String word="siri";
        System.out.println(vowelCount(word));
    }
}
