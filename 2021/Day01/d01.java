package Day01;
import java.util.ArrayList;
import java.util.Scanner;


class d01{
    
    static final int SIZE = 3;   //For task 2
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
            input.add(scan.nextInt());
        }
        scan.close();
        

        //Variable 'index' to iterate the input, 'counter' to count occurance for the task
        int counter = 0;



        //TASK 1
        int prev = input.get(0), cur;
        for (int i : input) {
            if (prev < i) {
                counter++;
            }
            prev = i;
        }
        System.out.println("TASK 1:  " + counter);




        //TASK 2

        counter = 0;
        //Creating an array to track the three wanted values
        int[] values = new int[SIZE];



        for(int i = 0; i < SIZE; i++) {
            values[i] = input.get(i);

        }
        //Int 'index' to index current in int[]
        int index = 0;
        for (int i : input) {
            //If values [a,b,c] < [b,c,d] then a < d.
            cur = i;
            if (values[index] < i) {
                counter++;
            }
            //Then I replaced value 'a' as in the example above, with value 'd':
            values[index] = cur;
            //Keeping track on what variable to replace, as based on variable 'i':
            if (index + 1 == SIZE) {
                index = 0;
            } else {
                index++;
            }
        }
        System.out.println("TASK 2:  " + counter);

        
        
    }
}