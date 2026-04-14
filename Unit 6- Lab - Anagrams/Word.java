import java.util.ArrayList;

public class Word {
    private String originalWord;
    private String sortedWord;

    public Word(String originalWord) {
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return this.originalWord;
    }

    public String getSortedWord() {
        return this.sortedWord;
    }
    // String
    //97 = a, 122 = z
    public String sortWord() {
        originalWord = validateOriginalWord();
        ArrayList<Character> word = new ArrayList<>();
        for (int i = 0; i < originalWord.length(); i++) {
            word.add(Character.toLowerCase(originalWord.charAt(i)));
        }
        //by now, ArrayList word is the original word broken up (all in Lowercase)
        
        String newSortedWord = "";
        for (int i = 0; i < originalWord.length(); i++) { //itterate through newSortedWord
            int tempLowest = 122;
            for (int j = 0; j < word.size(); j++) { //itterate through ArrayList<> word
                if ((int) word.get(j) < tempLowest) {
                    tempLowest = (int) word.get(j);
                }
            }
            newSortedWord += (char) tempLowest;
            word.remove((Character) ((char) tempLowest));

        }
        return newSortedWord;
    }

    public String validateOriginalWord() {
        String newOGWord = "";
        for (int i = 0; i < originalWord.length(); i++) {
            if (Character.toLowerCase(originalWord.charAt(i)) >= 97
                && Character.toLowerCase(originalWord.charAt(i)) <= 122) {
                    newOGWord += originalWord.charAt(i);
            }
        }
        return newOGWord;
    }



}
