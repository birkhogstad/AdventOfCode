import java.util.Scanner;
import java.util.Arrays;

class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line;
        int valid = 0;
        int currentCounter = 0;
        String check;
        String[] validECL = { "amb", "blu", "brn", "gry", "grn", "hzl", "oth" };
        while (scan.hasNextLine()) {
            check = scan.nextLine();
            // if line is empty
            if (check.length() == 0) {
                if (currentCounter == 7) {
                    valid++;
                }
                System.out.println("currentCounter -> " + currentCounter + "\n\n");
                currentCounter = 0;

                // if line is not empty
            } else {
                System.out.println(check);
                line = check.split(" ");
                for (int i = 0; i < line.length; i++) {
                    String[] part = line[i].split(":");
                    String key = part[0];
                    String value = part[1];
                    // System.out.println("Checking: " + key);
                    if (!key.equals("cid")) {
                        //// System.out.println("Check complete for: " + key);

                        if (key.equals("hgt")) {
                            String unit = value.substring(value.length() - 2, value.length());
                            if (unit.equals("cm")) {
                                int hValue = Integer.parseInt(value.substring(0, value.length() - 2));
                                if (hValue >= 150 && 193 >= hValue) {
                                    System.out.println("cm passed -> " + hValue);
                                    currentCounter++;
                                }
                            } else if (unit.equals("in")) {
                                int hValue = Integer.parseInt(value.substring(0, value.length() - 2));
                                if (hValue >= 59 && 76 >= hValue) {
                                    System.out.println("in passed -> " + hValue);
                                    currentCounter++;
                                }
                            }
                        }

                        else if (key.equals("byr") || key.equals("iyr") || key.equals("eyr")) {
                            // System.out.println("Check complete for: " + key);
                            if (!value.contains("[a-zA-Z]+")) {
                                System.out.println("Contains passed - > " + key);
                                int numVal = Integer.parseInt(value);
                                if (key.equals("byr")) {
                                    if (numVal <= 2002 && 1920 <= numVal) {
                                        System.out.println("byr passed -> " + numVal);

                                        currentCounter++;
                                    }
                                } else if (key.equals("iyr")) {
                                    if (numVal <= 2020 && 2010 <= numVal) {
                                        System.out.println("iyr passed -> " + numVal);
                                        currentCounter++;
                                    }
                                } else if (key.equals("eyr")) {
                                    if (numVal <= 2030 && 2020 <= numVal) {
                                        System.out.println("eyr passed -> " + numVal);
                                        currentCounter++;
                                    }
                                }
                            }
                        }

                        else if (key.equals("hcl")) {
                            // System.out.println("Check complete for: " + key);
                            if (value.charAt(0) == '#' && !value.contains("[g-zA-Z]+") && value.length() == 7) {
                                System.out.println("hcl passed -> " + value);
                                currentCounter++;
                            }
                        }

                        else if (key.equals("ecl")) {
                            // System.out.println("Check complete for: " + key);
                            if (Arrays.asList(validECL).contains(value)) {
                                System.out.println("ecl passed -> " + value);
                                currentCounter++;
                            }
                        }

                        else if (key.equals("pid")) {
                            // System.out.println("Check complete for: " + key);
                            if (value.length() == 9) {
                                if (!value.contains("[a-zA-Z]+")) {
                                    System.out.println("pid passed -> " + value);
                                    currentCounter++;
                                }
                            }
                        }

                    }

                }
            }
        }
        if (currentCounter == 7) {
            valid++;
        }
        System.out.println("currentCounter -> " + currentCounter + "\n\n");
        scan.close();
        System.out.println(valid);
    }
}