import java.util.ArrayList;


public class Switcher {
//    Swapping each adjacent pair of characters in the word.
    ArrayList<String> switchedAdjacentCharsWords = new ArrayList<>();

    public ArrayList switchAdjacentChars(String word) {

        char[] theWord = word.toCharArray();
        char tempLetter;
        for (int i = 0; i < theWord.length -1; i++) {


            tempLetter = theWord[i];
            theWord[i] = theWord[i+1];
            theWord[i+1] = tempLetter;

            String newWord = new String(theWord);
            switchedAdjacentCharsWords.add(newWord);
            theWord = word.toCharArray();
        }

        for (String w: switchedAdjacentCharsWords) {
            System.out.println(w);

        }
        return switchedAdjacentCharsWords;
    }
}
