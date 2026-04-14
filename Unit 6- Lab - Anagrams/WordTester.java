public class WordTester {
    public static void main(String[] args) {
        String word = "cat";
        System.out.println(word);
        Word newWord = new Word(word);
        System.out.println(newWord.sortWord());

        Word newWord2 = new Word("alphabet");
        System.out.println(newWord2.sortWord());


    }
}
