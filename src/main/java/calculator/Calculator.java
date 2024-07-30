package calculator;

import java.util.*;

public class Calculator {
    double calculate(double num1, double num2, char sign) {
        switch (sign) { // 입력된 사칙연산의 상황에 따라 계산 후 while문 조건식 false로 반복 해제
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                if (num2 == 0) {
                    noZero(0);
                } else {
                    return num1 / num2;
                }
            }
            default -> System.out.print("사칙연산 기호만을 작성해주세요.\n\n");
        }
        return 0;
    }

    void noZero(int num2) {
        System.out.printf("나눗셈 연산에서 분모(두번째 정수)에 %d이 입력될 수 없습니다. \n\n", num2);
    }

    public static void main(String[] args) {
        Calculator ksk = new Calculator();
        double result = ksk.calculate(5, 3, '/');
        System.out.println(result);


    }

}
