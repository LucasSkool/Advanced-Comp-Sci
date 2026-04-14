import java.util.ArrayList;

public class AnagramListTester {
    public static void main(String[] args) {
        AnagramList list1 = new AnagramList();
        //key will be cat
        list1.add(new Word("act"));
        list1.add(new Word("tac"));
        list1.add(new Word("run"));
        list1.add(new Word("fun"));
        list1.add(new Word("shy"));

        ArrayList<Word> result = list1.searchAnagrams("cat");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getOriginalWord());
        }
    }
    
}
