package 매개변수람다식;

@FunctionalInterface    // 함수형 프로그램을 만들기 위한 어노테이션, 내부에 함수가 한 개만 존재.
interface MyFuncInterface {
    void method(int x);
}


@FunctionalInterface    // 리턴값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}


public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> {// 매개변수가 한 개인 경우는 () 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y;  //  구현부가 한 줄인 경우 {} 생략 가능 return 생략
        System.out.println(fi2.min(3, 4));

    }
}


