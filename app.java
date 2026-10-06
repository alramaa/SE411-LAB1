package generics;

import java.util.Arrays;
import java.util.List;

public class app {

    public static void main(String[] args) {

        
        String[] names = {"Rama", "Lamia", "Ella"};
        PrintableList<String> stringList = new PrintableList<>(names);
        stringList.printItems();

        
        Integer[] numbers = {10, 20, 30};
        PrintableList<Integer> integerList = new PrintableList<>(numbers);
        integerList.printItems();

       
        NumberBox<Integer> integerBox = new NumberBox<>(10);
        System.out.println(integerBox.getItem());
        System.out.println(integerBox.add(20));

        
        NumberBox<Double> doubleBox = new NumberBox<>(5.5);
        System.out.println(doubleBox.getItem());
        System.out.println(doubleBox.add(4.5));

        
        List<String> words = Arrays.asList("Java", "Generics", "Lab");
        printList(words);

        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum: " + sumNumbers(nums));
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }
}