package strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        StringHelpers helper=new StringHelpers(s);
        System.out.println("\""+s+"\""+" is palindrome : "+helper.palindrome());
        System.out.println("Number of a's in "+"\""+s+"\""+" : "+helper.numberOfa());
        System.out.println(s + " contains %"+" : " + helper.containsPercentSign());
        System.out.println("Length of \""+s+"\""+" is bigger than 5 : "+ helper.lengthIsBiggerThan5());
    }
}
