import java.util.Scanner;
import java.util.ArrayList;

class Task1 {

    public static void main(String[] args) {
        int finalSum = 0;

        Scanner scan = new Scanner(System.in);
        String check;
        ArrayList<Character> listOfYes = new ArrayList<Character>();
        while (scan.hasNextLine()) {
            check = scan.nextLine();
            if (check.length() != 0) {
                for (int i = 0; i < check.length(); i++) {
                    if (!listOfYes.contains(check.charAt(i))) {
                        listOfYes.add(check.charAt(i));
                    }
                }
            } else {
                finalSum += listOfYes.size();
                listOfYes.clear();
            }
        }
        if (listOfYes.size() != 0) {
            finalSum += listOfYes.size();
        }
        System.out.println(finalSum);

    }
}