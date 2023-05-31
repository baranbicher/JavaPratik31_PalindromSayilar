import java.util.Scanner;

public class Main {
    static String paladrom(int number) {
        int tempNumber = number, reverseNumber = 0, lastNumber;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }
        if (number==reverseNumber)
        return "Girdiğiniz Sayı Polidrom Sayısır.";
        else
            return "Girdiğiniz Sayı Polidrom DEĞİLDİR!...";
    }

    public static void main(String[] args) {


        System.out.println(paladrom(101));

    }
}
