
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        System.out.println("Кошки:");
        printCats(cats);
        Set<Dog> dogs = createDogs();
        System.out.println("Собаки:");
        printDogs(dogs);
        Set<Object> pets = join(cats, dogs);
        System.out.println("Все вместе:");
        printPets(pets);

        removeCats(pets, cats);
        System.out.println("Без кошек:");
        printPets(pets);
    }

    public static Set<Cat> createCats() { //создаём 4 котов
        Cat barsik = new Cat("Барсик"); //создание 1 кота
        Cat murzik = new Cat("Мурзик"); //создание 2 кота
        Cat chumik = new Cat("Чумик"); //создание 3 кота
        Cat chuchelo = new Cat("Чучело"); //создание 4 кота

        HashSet<Cat> result = new HashSet<>();
        result.add(barsik);
        result.add(murzik);
        result.add(chumik);
        result.add(chuchelo);
        return result;
    }

    public static Set<Dog> createDogs() { //создаём 3 собак
        Dog kasper = new Dog("Каспер"); //создание 1 собаки
        Dog julka = new Dog("Жулька"); //создание 2 собаки
        Dog tuzik = new Dog("Тузик"); //создание 3 собаки

        HashSet<Dog> result = new HashSet<>(); //наполняем собаками массив
        result.add(kasper);
        result.add(julka);
        result.add(tuzik);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
            Set pets = new HashSet(cats);
            pets.addAll(dogs);
            return pets;
        }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }
    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats)
            System.out.println(cat.name);    }

    public static void printDogs(Set<Dog> dogs) {
        for (Dog dog: dogs)
            System.out.println(dog.name);    }


    public static void printPets(Set<Object> pets) {
        for (Object pet: pets)
            System.out.println(pet);    }

    public static class Cat { //класс Cat
        String name;    // имя

        public Cat(String name) { //конструктор
            this.name = name;}
        }

    public static class Dog { //класс Dog
        String name;    //имя

        public Dog(String name) {
            this.name = name;
        }
    }
}