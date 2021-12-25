import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Task2 {

    public static void main(String[] args) {
        int finalSum = 0;

        Scanner scan = new Scanner(System.in);
        String check;
        int numPersons = 0;
        int allYes = 0;
        HashMap<Character, Integer> listOfYes = new HashMap<Character, Integer>();
        while (scan.hasNextLine()) {
            check = scan.nextLine();
            if (check.length() != 0) {
                numPersons++;
                for (int i = 0; i < check.length(); i++) {
                    if (listOfYes.containsKey(check.charAt(i))) {
                        listOfYes.replace(check.charAt(i), listOfYes.get(check.charAt(i)) + 1);
                    } else {
                        listOfYes.put(check.charAt(i), 1);
                    }
                }
            } else {
                if (listOfYes.size() != 0) {
                    for (int value : listOfYes.values()) {
                        if (value == (int) value) {
                            if (value == numPersons) {
                                allYes++;
                            }
                        }
                    }
                }

                finalSum += allYes;
                listOfYes.clear();
                allYes = 0;
                numPersons = 0;
            }
        }
        if (listOfYes.size() != 0) {
            for (int value : listOfYes.values()) {
                if (value == (int) value) {
                    if (value == numPersons) {
                        allYes++;
                    }
                }
            }
            finalSum += allYes;
            listOfYes.clear();
            allYes = 0;
            numPersons = 0;
        }
        System.out.println(finalSum);
    }
}