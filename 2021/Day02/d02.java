package Day02;
import java.util.ArrayList;
import java.util.Scanner;

public class d02 {
    


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);


        //Saving input values as it's used for both tasks:
        String[] line;
        ArrayList<String> cmndList = new ArrayList<String>();
        ArrayList<Integer> valList = new ArrayList<Integer>();
        while(scan.hasNextLine()) {
            line = scan.nextLine().split(" ");
            cmndList.add(line[0]);
            valList.add(Integer.parseInt(line[1]));
        } 
        scan.close();


        //Task 1:
        String cmnd;            //cmnd: Input command
        int val,                //val:  Input value 
        xVal = 0, yVal = 0;     //xVal: Calculating forward movement
                                //yVal: Calculating 'down' minus 'up' movement

        for (int i = 0; i < cmndList.size(); i++){
            cmnd = cmndList.get(i);
            val = valList.get(i);
            if (cmnd.equals("forward")) {
                xVal += val;
            } else if (cmnd.equals("up")) {
                yVal -= val;
            } else {
                yVal += val;
            }
        }
        System.out.println("TASK 1:  " + (xVal * yVal));



        //Task 2:
        //Reusing and resetting (necessary) variables used in task 1
        xVal = 0;
        yVal = 0;
        int aim = 0;

        for (int i = 0; i < cmndList.size(); i++) {
            cmnd = cmndList.get(i);
            val = valList.get(i);
            if (cmnd.equals("forward")) {
                xVal += val;
                yVal += aim * val;
            } else if (cmnd.equals("up")) {
                aim -= val;
            } else if (cmnd.equals("down")) {
                aim += val;
            } else {
                System.err.println("'cmnd' not found");
                System.exit(0);
            }
            
        }
        System.out.println("TASK 2:  " + (xVal * yVal));
    }
}
