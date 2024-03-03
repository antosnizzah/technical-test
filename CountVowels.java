// program to count number of vowels in a sentence
public class CountVowels {
    public static void main(String[] args) {
        String sentence = "Hello ANTHONY gatitu";
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String sentence) {
        int count = 0;
        // catering for both uppercase and lowercase
        String vowels = "aeiouAEIOU";


        for (int i = 0; i < sentence.length(); i++) {
            
            if (vowels.indexOf(sentence.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}
