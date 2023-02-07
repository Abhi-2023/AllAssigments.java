import java.util.*;

public class AssignmentStrings {
 public static void main (String args[]){
    // // Question no 1 ..................
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name");
    // String Name = sc.nextLine();
    // System.out.println("Entered name is " + Name + ", is it correct?");

    // // Question no 3..............

    // String solution1 = "My name is Abhishek";
    // System.out.println(solution1.length());

    // // Question no 5..........

    // String solution = "refrigerator";
    // System.out.println(solution.length());


    // // Question no 6...........

    // String solution2 = "Umbrella";
    // System.out.println(solution2.contains("U"));

    
    // Question no 7..............
        // doesn't have informatio about it i searched it on youtube & on google but didn't understood it properly..................


    // Day 17 Assingnment Solutions

    // Question no..2.....

    String input = "PWSKILLS";

    String result = "";

    for ( int i = input.length()-1; i >=0; i--){
        result += input.charAt(i);
    }
    System.out.println(result);

    // Question no...... 3.......

    String input1 = "Think Twice";
    String result1 = "";
    String sarr[] = input1.split(" ");

    for(String elem : sarr){
        for ( int i = elem.length() - 1; i >= 0; i--){
            result1 += elem.charAt(i);
        }
        result1 += " ";
    }


    System.out.println(result1);

}   
}
