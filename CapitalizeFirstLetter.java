//program to capitalize the first letters of a word
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "i am anthony gatitu";
        String result = capitalizeFirstLetter(input);
        System.out.println(result);
    }

    public static String capitalizeFirstLetter(String input) {

        String[] words = input.split("\\s+");

        StringBuilder resultBuilder = new StringBuilder();


        for (String word : words) {

            if (word.length() > 0) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String capitalizedWord = firstLetter + word.substring(1);
                resultBuilder.append(capitalizedWord).append(" ");
            }
        }


        return resultBuilder.toString().trim();
    }
}
