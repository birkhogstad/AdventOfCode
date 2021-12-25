import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int isHighest = 0;
        int isLowest = 1000;
        ArrayList<Integer> listOfIDs = new ArrayList<Integer>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String s = line.substring(0, 7);

            int seatRow = 0;
            int pos = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'B') {
                    seatRow += Math.pow(2, pos);
                }
                pos++;
            }
            int seatColumn = 0;
            s = line.substring(7, line.length());
            pos = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'R') {
                    seatColumn += Math.pow(2, pos);
                }
                pos++;
            }
            int id = seatRow * 8 + seatColumn;
            listOfIDs.add(id);
        }
        Collections.sort(listOfIDs);
        int start = listOfIDs.get(0);
        for (int j = start; j < listOfIDs.get(listOfIDs.size() - 1); j++) {
            if (!listOfIDs.contains(j)) {
                System.out.println(j);
            }
        }
    }
}
