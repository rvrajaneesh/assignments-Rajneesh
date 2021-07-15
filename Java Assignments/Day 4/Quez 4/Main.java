package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> wordList = new ArrayList<>();
        wordList.add("New");
        wordList.add("Items");
        wordList.add("code");
        wordList.add("Zeba");
        wordList.add("words");
        wordList.add("write");
        wordList.add("static");
        wordList.add("yaak");
        wordList.add("dcss");

        Predicate<String> predicate = a -> ((a.length()) % 2 != 0);
        wordList.removeIf(predicate);
        wordList.forEach(System.out::println);


    }
}