import java.util.Scanner;
import java.util.ArrayList;

class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line;
        ArrayList<String> current = new ArrayList<String>();
        int valid = 0;
        String check;
        while (scan.hasNextLine()) {
            check = scan.nextLine();
            // if line is empty
            if (check.length() == 0) {
                current.remove("cid");
                if (current.size() == 7) {
                    valid++;
                }
                current.clear();

                // if line is not empty
            } else {
                line = check.split(" ");
                for (int i = 0; i < line.length; i++) {
                    current.add(line[i].substring(0, 3));
                }
            }
        }
        current.remove("cid");
        if (current.size() == 7) {
            valid++;
        }
        System.out.println(valid);
    }
}