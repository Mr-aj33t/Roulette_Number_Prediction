// RoulettePredictorProgram.java
package jmapp.roulettepredictor;

import java.util.Scanner;

public class RoulettePredictorProgram {

    public static void main(String[] args) {
        // Create an instance of the Calculate class
        Calculate rouletteCalculator = new Calculate();

        // Run the program until manually terminated
        while (true) {
            // Get numbers manually
            int[] inputArray = getManualNumbers();

            // Call the getnumbers method and print the result
            int[] resultArray = rouletteCalculator.getnumbers(inputArray);

            // Print the result array with color coding
            System.out.println("=================================");
            System.out.println("Result Array: ");
            for (int value : resultArray) {
                printColoredNumber(value);
            }
        }
    }

    private static int[] getManualNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] manualNumbers = new int[6];
        System.out.println(" ");
        System.out.println("Enter 6 numbers: ");
        System.out.println("_______________________________________");
        for (int i = 0; i < 6; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            manualNumbers[i] = scanner.nextInt();
        }

        return manualNumbers;
    }

    private static void printColoredNumber(int value) {
        if (value == 0) {
            System.out.print("\u001B[32m" + value + "\u001B[0m "); // Green
        } else if (value >= 1 && value <= 10) {
            if (value % 2 == 1) {
                System.out.print("\u001B[31m" + value + "\u001B[0m "); // Red
            } else {
                System.out.print("\u001B[34m" + value + "\u001B[0m "); // Blue
            }
        } else if (value >= 11 && value <= 18) {
            if (value % 2 == 1) {
                System.out.print("\u001B[34m" + value + "\u001B[0m "); // Blue
            } else {
                System.out.print("\u001B[31m" + value + "\u001B[0m "); // Red
            }
        } else if (value >= 29 && value <= 36) {
            if (value % 2 == 1) {
                System.out.print("\u001B[34m" + value + "\u001B[0m "); // Blue
            } else {
                System.out.print("\u001B[31m" + value + "\u001B[0m "); // Red
            }
        } else {
            if (value % 2 == 1) {
                System.out.print("\u001B[31m" + value + "\u001B[0m "); // Red
            } else {
                System.out.print("\u001B[34m" + value + "\u001B[0m "); // Blue
            }
        }
    }
}

// Calculate.java
class Calculate {
    private int[] o = new int[]{0, 0, 0, 0, 0, 0};
    private int sum = 0;

    public int[] getnumbers(int[] iArr) {
        this.sum = 0;
        int i = 0;

        while (i < 6) {
            if (iArr[i] == 0) {
                this.sum += 37;
            } else {
                this.sum += iArr[i];
            }
            i++;
        }

        // Use modulo to ensure the sum is within the specified range
        int i2 = this.sum % 37;

        int[] iArr2 = this.o;
        iArr2[0] = i2;

        if (i2 * 2 > 37) {
            iArr2[1] = (i2 * 2) - 37;
        } else {
            iArr2[1] = i2 * 2;
        }

        iArr2[2] = 37 - iArr2[0];

        // Handle other conditions appropriately based on the updated i2 value
        if (i2 == 1) {
            iArr2[2] = 6;
            iArr2[3] = 36;
            iArr2[4] = 31;
        }
        // ... (continuation of value assignments as needed)
        if (i2 == 6) {
            iArr2[2] = 1;
            iArr2[3] = 36;
            iArr2[4] = 31;
        }
        if (i2 == 36) {
            iArr2[2] = 6;
            iArr2[3] = 1;
            iArr2[4] = 31;
        }
        if (i2 == 31) {
            iArr2[2] = 6;
            iArr2[3] = 36;
            iArr2[4] = 1;
        }
        if (i2 == 32) {
            iArr2[2] = 35;
            iArr2[3] = 5;
            iArr2[4] = 2;
        }
        if (i2 == 35) {
            iArr2[2] = 32;
            iArr2[3] = 5;
            iArr2[4] = 2;
        }
        if (i2 == 5) {
            iArr2[2] = 2;
            iArr2[3] = 35;
            iArr2[4] = 32;
        }
        if (i2 == 2) {
            iArr2[2] = 35;
            iArr2[3] = 32;
            iArr2[4] = 5;
        }
        if (i2 == 3) {
            iArr2[2] = 34;
            iArr2[3] = 33;
            iArr2[4] = 4;
        }
        if (i2 == 34) {
            iArr2[2] = 3;
            iArr2[3] = 4;
            iArr2[4] = 33;
        }
       if (i2 == 33) {
            iArr2[2] = 3;
            iArr2[3] = 4;
            iArr2[4] = 34;
        }
        if (i2 == 4) {
            iArr2[2] = 3;
            iArr2[3] = 34;
            iArr2[4] = 33;
        }
        if (i2 == 7) {
            iArr2[2] = 30;
            iArr2[3] = 25;
            iArr2[4] = 12;
        }
        if (i2 == 30) {
            iArr2[2] = 7;
            iArr2[3] = 25;
            iArr2[4] = 12;
        }
        if (i2 == 25) {
            iArr2[2] = 7;
            iArr2[3] = 30;
            iArr2[4] = 12;
        }
        if (i2 == 12) {
            iArr2[2] = 25;
            iArr2[3] = 7;
            iArr2[4] = 30;
        }
        if (i2 == 19) {
            iArr2[2] = 18;
            iArr2[3] = 13;
            iArr2[4] = 24;
        }
        if (i2 == 18) {
            iArr2[2] = 19;
            iArr2[3] = 24;
            iArr2[4] = 13;
        }
        if (i2 == 24) {
            iArr2[2] = 13;
            iArr2[3] = 18;
            iArr2[4] = 19;
        }
        if (i2 == 13) {
            iArr2[2] = 24;
            iArr2[3] = 18;
            iArr2[4] = 19;
        }
        if (i2 == 11) {
            iArr2[2] = 8;
            iArr2[3] = 29;
            iArr2[4] = 26;
        }
        if (i2 == 8) {
            iArr2[2] = 11;
            iArr2[3] = 29;
            iArr2[4] = 26;
        }
        
        if (i2 == 29) {
            iArr2[2] = 11;
            iArr2[3] = 8;
            iArr2[4] = 26;
        }
        if (i2 == 26) {
            iArr2[2] = 8;
            iArr2[3] = 11;
            iArr2[4] = 29;
        }
        if (i2 == 14) {
            iArr2[2] = 20;
            iArr2[3] = 23;
            iArr2[4] = 17;
        }
        if (i2 == 20) {
            iArr2[2] = 14;
            iArr2[3] = 23;
            iArr2[4] = 17;
        }
        if (i2 == 23) {
            iArr2[2] = 17;
            iArr2[3] = 20;
            iArr2[4] = 14;
        }
        if (i2 == 17) {
            iArr2[2] = 20;
            iArr2[3] = 14;
            iArr2[4] = 23;
        }
        if (i2 == 27) {
            iArr2[2] = 28;
            iArr2[3] = 9;
            iArr2[4] = 10;
        }
        if (i2 == 28) {
            iArr2[2] = 27;
            iArr2[3] = 9;
            iArr2[4] = 10;
        }
        if (i2 == 10) {
            iArr2[2] = 9;
            iArr2[3] = 27;
            iArr2[4] = 28;
        }
        if (i2 == 9) {
            iArr2[2] = 10;
            iArr2[3] = 27;
            iArr2[4] = 28;
        }
        if (i2 == 16) {
            iArr2[2] = 15;
            iArr2[3] = 22;
            iArr2[4] = 21;
        }
        if (i2 == 15) {
            iArr2[2] = 16;
            iArr2[3] = 22;
            iArr2[4] = 21;
        }
        if (i2 == 22) {
            iArr2[2] = 15;
            iArr2[3] = 16;
            iArr2[4] = 21;
        }
        if (i2 == 21) {
            iArr2[2] = 16;
            iArr2[3] = 15;
            iArr2[4] = 22;
        }
        return iArr2;
    }
}
