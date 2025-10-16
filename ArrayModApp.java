//This import is necessary to utilize methods that work with arrays.
import java.util.Arrays;
import java.util.Scanner;
public class ArrayModApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args){

        //Ask user how many numbers they plan to input.
        //This is so that we can set the size of the array.
        System.out.print("How many numbers do you want to input (up to 20) --> ");
        int size = userinput.nextInt();
        userinput.nextLine();

        //Initiate an array of integers with the size chosen by the user.
        int[] numbers = new int[size];

        //Prompt the user to enter the numbers in the array.
        System.out.print("Enter the numbers --> ");
        //Fill the array with the numbers the user chose.
        //Also, print a list of the numbers with their indexes so the user can choose which ones they want to edit.
        for(int i = 0; i<size; i++){
            numbers[i] = userinput.nextInt();
            System.out.println(numbers[i]+ " has an index of " + i + ".");
        }

        //Formatting.
        System.out.println("\n");

        //Iterate through the values in the array and ask the user if they want to change any values.
        int j = 0;
        while (j < size){
            System.out.print("Do you want to change the number with index " + j + " (Enter y for yes and anything else for no) --> ");

            //Get the user input.
            //Why is it necesary to include both of these statements?
            //I would have thought that just userinput.nextLine() would have been enough.
            String change = userinput.next();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Prompt the user for the new number.
            if (change.equalsIgnoreCase("y")){
                System.out.print("Enter the number you want to replace " + numbers[j]+ " with --> ");

                //Get the number and set it equal to an int name newNumber.
                int newNumber = userinput.nextInt();

                //Insert the new number into the array in the place of the previous numvber.
                numbers[j]=newNumber;

                //Formatting.
                System.out.println("\n");

                //Print the edited version for user's refrence.
                System.out.println("Here is the edited version:");
                for(int k=0;k<size;k++){
                    System.out.println(numbers[k]+ " has an index of " + k + ".");
                }
            }

            //Add one to j.
            j += 1;


        }

        //Formatting.
        System.out.println("\n");

        //Sort the numbers in the array.
        Arrays.sort(numbers);
        
        //Print out the array.
        System.out.println("Here is the list sorted from lowest to highest " + Arrays.toString(numbers));

        //Formatting.
        System.out.println("\n");

        //Tell the user that the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");
    }
}
