package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        // sc 입력변수로 받은 int 타입의 수를 a로 저장

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        // sc 입력변수로 받은 int 타입의 수를 b로 저장

        System.out.print("사칙연산 기호를 입력하세요: ");
        char sign = sc.next().charAt(0);
        // sc 입력변수로 받은 String 타입의 문자열중 Index(0)에 해당하는 문자를 sign 변수에 저장




    }
}
