import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        {
            map.put("Барнаева", 500);
            map.put("Захарова", 550);
            map.put("Петрова", 450);
            map.put("Сидорова", 300);
            map.put("Иванова", 200);
            map.put("Барнаев", 600);
            map.put("Захаров", 510);
            map.put("Петровcкий", 480);
            map.put("Сидоров", 250);
            map.put("Иванченко", 499);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500) {
                System.out.println("Удаляем нищеброда " + pair);//удаляем запись
                copy.remove(pair.getKey());
            }
        }
        System.out.println("Вот что получилось:");
        for (Map.Entry<String, Integer> pair : copy.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());//печатаем
        }
    }