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
                Calculator ksk = new Calculator();
                result = ksk.calculate(num1, num2, sign);
                if (num2 == 0 && sign == '/') {
                    break;
                } else {
                    System.out.print("num1 " + sign + " num2 = " + result + "\n\n"); // 결과값 출력
                    flag = false;
                    resultStack.push(result); // Stack에 result 값 저장
                }
            }

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String text = sc.next(); // scanner로 받아온 sc 값중 한 단어만 remove 변수로 문자열 저장
            if (text.equalsIgnoreCase("remove")) {
                resultStack.pop();
            }
            System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            text = sc.next();
            if (text.equalsIgnoreCase("inquiry")) {
                for (double a : resultStack) {
                    System.out.println(a);
                }
            }
            System.out.print("더 계산하시려면 아무 값이나 입력하세요. (exit 입력 시 종료)");
            String exit = sc.next();
            // sc 변수를 .next() 메서드를 이용하여 한 단어만 exit 변수로 문자열 저장
            if (exit.equalsIgnoreCase("exit")) {
                endFlag = false; // 전체 반복 해제
            }
        }
    }
}
