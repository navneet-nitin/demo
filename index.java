import java.util.*;

class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number to convert to decimal");
        long num = sc.nextLong();
        long dec = 0;
        long r = 0;
        int pow = 0;
        while (num != 0) {
            r = num % 10;
            dec = dec + (long) Math.pow(2, pow) * r;
            pow++;
            num = num / 10;
        }
        System.out.println("Binary to decimal converted number is \n" + dec);
    }
}