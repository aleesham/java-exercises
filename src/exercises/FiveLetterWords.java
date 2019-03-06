package exercises;


public class FiveLetterWords {
    public static void printFiveLetterWords(String[] words){
        for (String word : words){
            if (word.length()%5 == 0){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args){
        String[] words = new String[]{"These", "are", "some", "words"};

        printFiveLetterWords(words);
    }
}
