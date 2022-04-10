
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        //HashMap<Character, Integer> map = new HashMap<>();

        for (int a = 0; a < 33; a++) {
            //map.put(alphabet.get(a), counter(alphabet.get(a), list));
            System.out.println(alphabet.get(a)+" "+ counter(alphabet.get(a), list));
        }

    }

    public static Integer counter(Character letter, ArrayList list) {
        int count = 0;
        for(int i=0; i< list.size(); i++)
        {
            for(int j=0; j<list.get(i).toString().length(); j++) {
                if (list.get(i).toString().charAt(j) == letter) count++;
                //System.out.println("Проверяем элемент " + list.get(i).toString().charAt(j) + ". Буква " + letter + " попалась " + count + " раз");
            }
        }
    return count;}
}
