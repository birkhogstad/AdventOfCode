import java.util.Scanner;

class TobogganTrajectory{
    public static char[][] map;
    public static int toPrint;

    public static int numOfTrees(int s, int d, int toAdd) {
        int count = 0; int down = 0; int side = 0;
        while (down <= 322) {
            if (Character.toString(map[down][side]).equals("#")) {
                count++;
            }
            down += d;
            side += s;
            if (side >= 31) {
                side = side - 31;
            }
        }
        return toAdd * count;
    }

  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    map = new char[323][31];
    int counter = 0;
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        for (int i = 0; i < line.length(); i++) {
            map[counter][i] = line.charAt(i);
        }
        counter++;
    }
    int toPrint = 1;
    toPrint = numOfTrees(1,1, toPrint);
    toPrint = numOfTrees(3,1, toPrint);
    toPrint = numOfTrees(5,1, toPrint);
    toPrint = numOfTrees(7,1, toPrint);
    toPrint = numOfTrees(1,2, toPrint);
    System.out.println(toPrint);
  }
}