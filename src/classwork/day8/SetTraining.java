package classwork.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetTraining {
    public static void splitByRegExp(String inputString){
        Set<String> mySet = new HashSet<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(inputString);
        while(matcher.find()){
            mySet.add(matcher.group());
        }
        System.out.println("Iterate via for-each:");
        for(String word : mySet){
            System.out.println(word);
        }
        System.out.println("Iterate via Iterator:");
        Iterator<String> iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        splitByRegExp("Mama mila ramu Mama");
    }
}
