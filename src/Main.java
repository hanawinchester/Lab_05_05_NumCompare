public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please input a number: ");
        System.out.println("Please input another number: ");
        int numberOne = 5;
        int numberTwo = 7;

        if (numberOne == numberTwo) {
            System.out.println(numberOne + " = " + numberTwo);
        }
        else if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
        }
        else if (numberOne < numberTwo) {
            System.out.println(numberOne + " is less than " + numberTwo);
        }
        else {
            System.out.println("Something went wrong, at least one input is not a number. Please try again.");
        }

    }
}