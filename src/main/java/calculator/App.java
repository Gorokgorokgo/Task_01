package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Boolean endFlag = true;
        // 반복 실행을 멈추기위한 flag
        Stack<Double> resultStack = new Stack<Double>();
        int count = 0;
        while (endFlag) {

            Scanner sc = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = (double) sc.nextInt();
            // sc 입력변수로 받은 int 타입의 수를 num1로 저장

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = (double) sc.nextInt();
            // sc 입력변수로 받은 int 타입의 수를 num2로 저장

            char sign = ' ';
            double result = 0;
            Boolean flag = true;
            while (flag) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                sign = sc.next().charAt(0);
                // sc 입력변수로 받은 String 타입의 문자열중 Index(0)에 해당하는 문자를 sign 변수에 저장

                switch (sign) { // 입력된 사칙연산의 상황에 따라 계산 후 while문 조건식 false로 반복 해제
                    case '+' -> {
                        result = num1 + num2;
                        flag = false;
                    }
                    case '-' -> {
                        result = num1 - num2;
                        flag = false;
                    }
                    case '*' -> {
                        result = num1 * num2;
                        flag = false;
                    }
                    case '/' -> {
                        if (num2 == 0) {
                            result = 0;
                        } else {
                            result = num1 / num2;
                        }
                        flag = false;
                    }
                    default -> System.out.print("사칙연산 기호만을 작성해주세요.\n\n");
                }
            }
            if (num2 == 0 && sign == '/') {
                System.out.print("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. \n\n");
            } else {
                System.out.print("num1 " + sign + " num2 = " + result + "\n\n"); // 결과값 출력
                resultStack.push(result); // Stack에 result 값 저장

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next(); // scanner로 받아온 sc 값중 한 단어만 remove 변수로 문자열 저장
                if (remove.equalsIgnoreCase("remove")) {
                    resultStack.pop();
                }
            }

            System.out.print("더 계산하시려면 아무 값이나 입력하세요. (exit 입력 시 종료)");
            String exit = sc.next();
            // sc 변수를 .next() 메서드를 이용하여 한 단어만 exit 변수로 문자열 저장
            if (exit.equalsIgnoreCase("exit")) {
                endFlag = false; // 전체 반복 해제
            }
        }
        while(!resultStack.isEmpty()) {
            System.out.print(resultStack.pop() + " "); // 결과 값 체크
        }
        // System.out.println(Arrays.toString(resultArr)); // 결과 값 체크
    }
}
