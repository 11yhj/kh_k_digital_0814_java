package 스퀘어출력;
// input : 4
// Output
// 1  2  3  4
// 5  6  7  8
// 9 10 11 12
public class SquareEx {
    public static void main(String[] args) {
        int i = 1;
        for (;;) {
            System.out.printf("%4d", i);
            if (i % 4 ==0)System.out.println();
            i++;
            if (i > 12) break;

        }

    }
}
