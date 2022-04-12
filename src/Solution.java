import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        while (list.size()!=0)
        {
        int count = 0;
        String word = list.get(0);
        for (int i=0; i< list.size(); i++){
            if (word.equals(list.get(i)))
            {
                count++;
                //System.out.println("Найден повтор! Слово "+list.get(i)+" встретилось "+count+" раз");
                list.remove(i);
                i--;
            }

        }
            result.put(word, count);
            //System.out.println("В карту добавлена пара: " + word + " " +count);

        }
        return result;
    }
}

