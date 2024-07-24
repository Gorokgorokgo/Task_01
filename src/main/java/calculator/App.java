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

        char sign = ' ';
        int result = 0;
        Boolean flag = true;
        while (flag) {
            System.out.print("사칙연산 기호를 입력하세요: ");
            sign = sc.next().charAt(0);
            // sc 입력변수로 받은 String 타입의 문자열중 Index(0)에 해당하는 문자를 sign 변수에 저장

            switch (sign) { // 입력된 사칙연산의 상황에 따라 계산 후 while문 조건식 false로 반복 해제
                case '+' -> {
                    result = a + b;
                    flag = false;
                }
                case '-' -> {
                    result = a - b;
                    flag = false;
                }
                case '*' -> {
                    result = a * b;
                    flag = false;
                }
                case '/' -> {
                    if (b == 0) {
                        result = 0;
                    } else {
                        result = a / b;
                    }
                    flag = false;
                }
                default -> System.out.print("사칙연산 기호만을 작성해주세요.\n\n");
            }
        }
        if (b == 0) {
            System.out.print("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n\n");
        } else {
            System.out.print("a " + sign + " b = " + result); // 결과값 출력
        }
    }
}
