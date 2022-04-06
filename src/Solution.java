
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
    ArrayList <Integer> digitList = new ArrayList<>();
    ArrayList <String> stringList = new ArrayList<>();
        for(String s : array){
            if(isNumber(s)? digitList.add(Integer.parseInt(s)) : stringList.add(s));
        }
        digitList.sort(Comparator.reverseOrder());
        System.out.println("Отсортированы цифры "+digitList.toString());
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Отсортированы строки "+stringList.toString());
        //if (isGreaterThan("a", "b"));

        for(int i=0; i<digitList.size(); i++)
        {
            System.out.println("Записываем в итоговый массив число "+digitList.get(i) + " на место "+i);
            array[i] = String.valueOf(digitList.get(i));
        }

        for(int j=0; j<stringList.size(); j++)
        {
            System.out.println("Записываем в итоговый массив число "+stringList.get(j) + " на место "+j);
            array[digitList.size()+j] = stringList.get(j);
        }
    }
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}