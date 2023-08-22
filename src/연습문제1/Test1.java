package 연습문제1;
// 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70~ 79점은 C, 60~69점은 D, 나머지는 F를 출력하는 프로그램
// 0~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
// [옵션] 성적이 잘못 입력 되었으면 재입력 요구
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 입력을 위한 스캐너 생성
        // 입력을 받아서 정수형 변수에 대입
        // 조건문을 만드는데 우선, 0 ~ 100 사이에 정상 적인 입력 인지 확인
        // 정상적인 입력이었다면 가각의 성적 구간에 따라 한점 출력
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) continue;
            if (score >= 90) System.out.print("A");
            else if (score >= 80) System.out.print("B");
            else if (score >= 70) System.out.print("C");
            else if (score >= 60) System.out.print("D");
            else System.out.print("F");
            break;
            }
        }
    }
