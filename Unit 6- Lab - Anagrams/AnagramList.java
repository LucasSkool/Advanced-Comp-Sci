import java.util.ArrayList;
import java.util.AbstractList;

public class AnagramList extends AbstractList {
    AbstractList<Word> wordList;

    public AnagramList() {
        this.wordList = new ArrayList<>();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
        //do i need a case where it returns false because the original word isn't valid???
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.getSortedWord().equals(word2.getSortedWord())) {
            return true;
        }
        return false;
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> result = new ArrayList<>();
        Word keyWord = new Word(key);

        for (int i = 0; i < wordList.size(); i++) {
            if (checkAnagram(wordList.get(i), keyWord)) { //if the 2 are anagrams
                result.add(wordList.get(i));
            }
        }

        return result;
    }

    //other necessary methods
    public int size() {
        return wordList.size();
    }

    public Object get(int index) {
        return wordList.get(index);
    }

}
