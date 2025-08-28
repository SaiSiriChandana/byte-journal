public class CountConsonants {
    //string="siri"
    //consonats="s r"
    //ccount=2
    public static int consonantCount(String word){
        String v="aeiouAEIOU";
        int ccnt=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLetter(ch) && v.indexOf(ch)==-1){
                ccnt++;
            }
        }
        return ccnt;
    }
    public static void main(String[] args){
        String word="siri";
        System.out.println(consonantCount(word));
    }
}
