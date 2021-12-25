import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class ReportRepair{

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scan.hasNextLine() == true) {
            list.add(Integer.parseInt(scan.nextLine()));
        }

        //Oppgave 1
        for (int i = 0; i < list.size(); i++) {
            int ex = 2020 - list.get(i);
            if (list.contains(ex)) {
                System.out.println("i * j ==  " + list.get(i) * list.get(list.indexOf(ex)));
                break;
            }
        }

        
        //Oppgave 2
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                for (int k = j+1; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == 2020) {
                        System.out.println("i * j * k == " + list.get(i)*list.get(j)*list.get(k));              
                        return;
                    }             
                }
            }
        }
    }
} 