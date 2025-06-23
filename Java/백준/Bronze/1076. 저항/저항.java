import java.math.*;
import java.util.*;

public class Main {
    public static int GetOme(String str) {
        switch (str) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            default:
                return 9;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        long first = 10L * GetOme(str1);
        long second = GetOme(str2);
        long sum = first + second;

        long multiplier;
        switch (str3) {
            case "black": multiplier = 1L; break;
            case "brown": multiplier = 10L; break;
            case "red": multiplier = 100L; break;
            case "orange": multiplier = 1000L; break;
            case "yellow": multiplier = 10000L; break;
            case "green": multiplier = 100000L; break;
            case "blue": multiplier = 1000000L; break;
            case "violet": multiplier = 10000000L; break;
            case "grey": multiplier = 100000000L; break;
            case "white": multiplier = 1000000000L; break;
            default: multiplier = 1L;  // 잘못된 입력에 대한 기본값
        }

        sum *= multiplier;

        System.out.println(sum);
    }
}