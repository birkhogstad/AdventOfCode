import java.util.Scanner;

class Task2{

  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String[] nums; String letter; String password; int toPrint = 0; int counter;
    while (scan.hasNextLine()) {
        String[] line = scan.nextLine().split(" ");

        nums = line[0].split("-");
        int pos1 = Integer.parseInt(nums[0]);
        int pos2 = Integer.parseInt(nums[1]);

        letter = line[1].replace(":","");
        password = line[2];
        counter = 0;
        if (letter.equals(Character.toString(password.charAt(pos1-1)))) {
            counter++;
        } if (letter.equals(Character.toString(password.charAt(pos2-1)))) {
            counter++;
        } if (counter == 1) {
            toPrint++;
        }
    }
    System.out.println("Task 2: " + toPrint);
  }



  
}