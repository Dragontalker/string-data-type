package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("my String = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("my String = " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("my String = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString = " + numberString);
    }
}
