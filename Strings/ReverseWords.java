public class Reversewords {
    // sentence = "hi i am siri"
    // reversed = "siri am i hi"
    public static String reverseWords(String sentence) {
        // split into words (handle multiple spaces)
        String[] words = sentence.trim().split("\\s+");

        // reverse the array of words
        int low = 0, high = words.length - 1;
        while (low < high) {
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }

        // join them back into a single string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String sentence = "hi i am siri";
        System.out.println(reverseWords(sentence));
    }
}
