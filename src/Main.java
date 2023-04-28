import java.math.MathContext;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    static int myMethod(int x, int y){
        return x + y;
    }


    static int ageChecker(int age){
        String message = (age <= 18) ? "You are not old enough" : "You are of the age";
        System.out.println(message);
        return 0;
    }


    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//




//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How old are you?");
//
//        String ageString = scanner.nextLine();
//        int age = Integer.parseInt(ageString);
//
//        ageChecker(age);

//        System.out.println("Age : " + age  );


//        int ans = myMethod(5, 6);
//        System.out.println(ans);
        // Press ⇧F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println("i = " + i);
//
//        }
        /*
        String name = new String("mike angelo");
        System.out.println(name.toUpperCase());

        Date todaysDate = new Date();
        System.out.println(todaysDate);

        System.out.println(Math.PI);

        boolean isAdult = true;
        System.out.println(isAdult);

        int age = 9;
        String message;
        message = (age <= 10) ? "age is less than ten" : "age is not less than ten";
        System.out.println(message);


        int [] numbers = {34, 45, 65, 76, 87, 66};
        numbers.
        System.out.println(Arrays.toString(numbers));

        */


//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//
//        for(String i : cars){
//            System.out.println(i);
//        }

//        int week = 3;
//        int day = 7;
//
//        for(int i = 0; i<week; i++){
//            System.out.println("Week" + i);
//
//            for (int j = 0; j<day; j++){
//                System.out.println("Day" + j);
//            }
//        }


//        int [][] numbers = { {1, 2, 3, 4}, {5, 6, 7 , 8} };
//        for( int i = 1; i <numbers[0].length; i++){
//            for (int j = 1; j<numbers[1].length; j++){
//                System.out.println(numbers[i][j]);
//            }
//        }

//        Scanner scanner = new Scanner (System.in);
//        System.out.println("What is your name?");
//
//        String username = scanner.nextLine();
//
//        System.out.println("Welcome " + username);


        Person personOne = new Person(
                "Daniel",
                45.9F,
                true);

        System.out.println(personOne.name);



    }

    static class Person{
        String name;
        float height;
        boolean isAlive;

        Person(String name, float height, boolean isAlive){
            this.name = name;
            this.height = height;
            this.isAlive = isAlive;
        }
    }


}