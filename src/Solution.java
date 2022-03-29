import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>(); {
            map.put("Барнаева", "Валентина");
            map.put("Захарова", "Надежда");
            map.put("Петрова", "Зоя");
            map.put("Сидорова", "Валентина");
            map.put("Иванова", "Лидия");
            map.put("Барнаев", "Максим");
            map.put("Захаров", "Максим");
            map.put("Петров", "Пётр");
            map.put("Сидоров", "Сидор");
            map.put("Иванов", "Иван");}
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(); //создаём массив для хранения имён
        for (Map.Entry<String, String> pair : map.entrySet()) list.add(pair.getValue());//заполняем массив
        //System.out.println("массив имён заполнен: " + list.toString());
        String value;
        System.out.println("Начинаем проверку на повторы");
        for (int i=0; i< list.size(); i++){
            String s = list.get(i);
            for (int k=i; k< list.size()-1; k++){
                if (s.equals(list.get(k+1))) {value = s;
                    System.out.println("Найден повтор "+s);
                    removeItemFromMapByValue(map, value); //
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value)
    {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                System.out.println("Удаляем повтор " + pair);//удаляем повтор
                map.remove(pair);}
        }
    }
}