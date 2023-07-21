import java.util.Scanner;

class TopperProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int regnum = scanner.nextInt();
        scanner.close();
        int sumodd = 0;
        int sumeven = 0;

        while (regnum != 0) {
            int digit = regnum % 10;

            if (digit % 2 == 0) {
                sumeven += digit;
            } else {
                sumodd += digit;
            }

            regnum /= 10;
        }


        if (sumodd==sumeven){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}