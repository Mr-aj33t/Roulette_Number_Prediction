#include <iostream>
#include <vector>
#include <array>

using namespace std;

class Calculate {
private:
    array<int, 6> o = {0, 0, 0, 0, 0, 0};
    int sum = 0;

public:
    array<int, 6> getnumbers(array<int, 6>& iArr) {
        sum = 0;
        int i = 0;

        while (i < 6) {
            if (iArr[i] == 0) {
                sum += 37;
            } else {
                sum += iArr[i];
            }
            i++;
        }

        int i2 = sum % 37;

        array<int, 6> iArr2 = o;
        iArr2[0] = i2;

        if (i2 * 2 > 37) {
            iArr2[1] = (i2 * 2) - 37;
        } else {
            iArr2[1] = i2 * 2;
        }

        iArr2[2] = 37 - iArr2[0];

        if (i2 == 1) {
            iArr2[2] = 6;
            iArr2[3] = 36;
            iArr2[4] = 31;
        }
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
};

void printColoredNumber(int value) {
    if (value == 0) {
        cout << "\033[32m" << value << "\033[0m "; // Green
    } else if (value >= 1 && value <= 10) {
        if (value % 2 == 1) {
            cout << "\033[31m" << value << "\033[0m "; // Red
        } else {
            cout << "\033[34m" << value << "\033[0m "; // Blue
        }
    } else if (value >= 11 && value <= 18) {
        if (value % 2 == 1) {
            cout << "\033[34m" << value << "\033[0m "; // Blue
        } else {
            cout << "\033[31m" << value << "\033[0m "; // Red
        }
    } else if (value >= 29 && value <= 36) {
        if (value % 2 == 1) {
            cout << "\033[34m" << value << "\033[0m "; // Blue
        } else {
            cout << "\033[31m" << value << "\033[0m "; // Red
        }
    } else {
        if (value % 2 == 1) {
            cout << "\033[31m" << value << "\033[0m "; // Red
        } else {
            cout << "\033[34m" << value << "\033[0m "; // Blue
        }
    }
}

array<int, 6> getManualNumbers() {
    array<int, 6> manualNumbers;
    cout << endl;
    cout << "Enter 6 numbers: " << endl;
    cout << "_______________________________________" << endl;
    for (int i = 0; i < 6; i++) {
        cout << "Number " << (i + 1) << ": ";
        cin >> manualNumbers[i];
    }

    return manualNumbers;
}

int main() {
    Calculate rouletteCalculator;

    while (true) {
        array<int, 6> inputArray = getManualNumbers();

        array<int, 6> resultArray = rouletteCalculator.getnumbers(inputArray);

        cout << "=================================" << endl;
        cout << "Result Array: " << endl;
        for (int value : resultArray) {
            printColoredNumber(value);
        }
        cout << endl;
    }

    return 0;
}
