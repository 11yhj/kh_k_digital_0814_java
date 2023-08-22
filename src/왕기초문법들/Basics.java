package 왕기초문법들;

import java.util.Scanner;

//모르는 문법 찾기용
public class Basics {
    public static void main(String[] args) {

        //별찍기 연습
        for(int j =1; j <6; j++){
            for(int i = 0; i < j; i++){
                System.out.print("*");
            }

            System.out.println();
        }

        //        <<<<<<<<<왕기초 프로그래밍 문법들>>>>>>>>>

        //()<- 이곳에 "" <이걸 쓰고 문자입력하면 출력됨 ex) ("안녕") => 안녕
        System.out.println("안녕");

        // 1. 입력을 도와주는 도구 꺼내기용
        Scanner sc = new Scanner(System.in);
        // 2. 입력 받을 수 있는 구문(문장을 올바르게 구성하기위한 규칙)작성
        sc.next();




    }
}
