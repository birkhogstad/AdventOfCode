import java.util.Scanner;

class PasswordPhilosophy{

  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    String[] nums; String letter; String password; int counter; int toPrint = 0;
    while (scan.hasNextLine()) {
        
        String[] line = scan.nextLine().split(" ");
        nums = line[0].split("-");
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[1]);
        letter = line[1].replace(":","");
        password = line[2];
        counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (letter.equals(Character.toString(password.charAt(i)))) {
                counter++;
            }
            if (counter > max) {
                break;
            }
        }
        if (counter < min || counter > max) {
            toPrint++;
        }      
    }
    System.out.println("Task 1: " + (1000 - toPrint));
  }



  
}