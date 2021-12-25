package Day03;
import java.util.ArrayList;
import java.util.Scanner;

public class d03 {
    

    public static void main(String[] args) {


        //Saving input as ArrayList as it's needed for both tasks:
        Scanner scan = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();
        String line;

        while(scan.hasNextLine()) {
            line = scan.nextLine();
            input.add(line);
        }
        scan.close();



        //TASK 1:
        int[][] binary = new int[2][input.get(0).length()];
        
        //Adding occurance of binary in respectable list.
        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    binary[1][i]++;
                    continue;
                }
                binary[0][i]++;
            }
        }





        
        //'gam_eps' takes binary with most occurances for each index in [0] and least in [1]
        int[][] gam_eps = new int[2][binary[0].length];
        for (int i = 0; i < binary[0].length; i++) {
            if (binary[0][i] < binary[1][i]) {
                gam_eps[0][i] = 1;
                gam_eps[1][i] = 0;
                continue;
            }
            gam_eps[0][i] = 0;
            gam_eps[1][i] = 1;
        }

        for (int i = 0; i < gam_eps.length; i++) {
            for (int j= 0; j < gam_eps[i].length; j++) {
            }
        }



        // Taking sum of binary and multiplying with sum, set as 1
        int sum = 1;
        for (int i = 0; i < gam_eps.length; i++) {
            int currentSum = 0;
            for (int b = 0; b < gam_eps[i].length; b++) {
                if (gam_eps[i][b] == 1) {
                    currentSum += Math.pow(2, gam_eps[i].length - b - 1);
                }
            }
            sum *= currentSum;
        }

        System.out.println("TASK 1:  " + sum);






        //TASK 2:

        int multi = 1;
        for (int check = 0; check < 2; check++) {
            ArrayList<String> sort = input;
            int i = 0;
            while (sort.size() > 1) {
                ArrayList<String> zeros = new ArrayList<>();
                ArrayList<String> ones = new ArrayList<>();
                for (String s : sort) {
                    if (s.charAt(i) == '0') {
                        zeros.add(s);
                    } else {
                        ones.add(s);
                    }
                } 
                if (check == 0) {
                    if (zeros.size() > ones.size()) {
                        sort = zeros;
                    } else {
                        sort = ones;
                    }
                } else {
                    if (zeros.size() > ones.size()) {
                        sort = ones;
                    } else {
                        sort = zeros;
                    }
                }
                i++;
            }
            String bin = sort.get(0);
            int currentSum = 0;
            for (int c = 0; c < bin.length(); c++) {
                if (bin.charAt(c) == '1') {
                    currentSum += Math.pow(2, bin.length() - c - 1);
                }
            }
            multi *= currentSum;
            i = 0;
        }
        System.out.println("TASK 2:  " + multi);    
    }
}



