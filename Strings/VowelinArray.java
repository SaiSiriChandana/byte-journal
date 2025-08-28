public class VowelinArray {
    //['h','e','l','l','o']
    //e,o
    //2
    public static int findVowelinArray(char[] word){
        String vowels = "aeiouAEIOU";
        int vcount=0;
        for (char ch : word) {
            if (vowels.indexOf(ch) != -1) {
                // this char is a vowel
                vcount++;
            }
        }
        return vcount;

    }
    public static void main(String[] args){
        char[] word={'h','e','l','l','o'};
        System.out.println(findVowelinArray(word));
    }
}
