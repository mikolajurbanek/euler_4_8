import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fourth {


    protected Integer palindromesByMultiplicity() {
        List<Integer> palindromes = new ArrayList<>();
        for(int i=100; i<1000; i++) {
            for (int j = 100; j < 1000; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                String number = String.valueOf(i * j);
                stringBuilder.append(number);
                stringBuilder.reverse();
                String reversedNumber = String.valueOf(stringBuilder);
                if (number.equals(reversedNumber)) {
                    if (!palindromes.contains(Integer.decode(number))) {
                        palindromes.add(Integer.decode(number));
                    }
                }
            }
        }
        Collections.sort(palindromes, Collections.reverseOrder());
        return palindromes.get(0) ;
    }

}