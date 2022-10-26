import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знак(+ или -)");
        String a = scanner.next();
    if (a.equals ("+")) {
        System.out.println("Введите число");
        int num1 = scanner.nextInt();
        System.out.println("Введите число");
        int num2 = scanner.nextInt();
        int otvet = plus(num1, num2);
        System.out.println(otvet);
    } else if (a.equals ("-")) {
        System.out.println("Введите число");
        int num1 = scanner.nextInt();
        System.out.println("Введите число");
        int num2 = scanner.nextInt();
        int otvet = minus(num1, num2);
        System.out.println(otvet);
    }
    else {
        System.out.println("error");
    }
    }


    public static int plus(int plus1, int plus2){
        return plus1 + plus2;

    }
    public static int minus(int minus1, int minus2) {
        return minus1 - minus2;
    }
}



