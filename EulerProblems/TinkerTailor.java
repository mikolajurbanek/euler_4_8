import java.util.*;

public class TinkerTailor {

    List<Integer> circle = new LinkedList<>();
    List<Integer> eliminatedPeople = new LinkedList<>();
    Map<Integer, Integer> temp = new HashMap<>();
    int eliminatedPerson = 0;


    protected List<Integer> getQueueFromSong(int syllables, int amountPeople) {

        populateCircle(amountPeople);

        int indexer = 0;

        while(!(eliminatedPeople.size()==amountPeople)) {
            for (int s = 0; s < syllables; s++) {
                if (indexer >= circle.size()) {
                    indexer = 0;
                }
                System.out.println(circle.get(indexer));
                indexer++;
            }
            indexer = indexer - 1;
            System.out.println();
            System.out.println(circle.get(indexer));

            eliminatedPerson = (circle.get(indexer));
            eliminatedPeople.add(eliminatedPerson);
            circle.remove(indexer);

            System.out.println();


        }

         for (int s : eliminatedPeople) {
                System.out.println(s);
            }

        return eliminatedPeople;
    }


    private List<Integer> populateCircle(int amountPeople) {
        for(int p = 1; p<= amountPeople; p++){
            circle.add(p);
        } return circle;
    }
}
