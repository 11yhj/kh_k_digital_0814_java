package 텍스트파일읽기문제;
//임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.
//해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기(총점이 같은 경우 이름순)
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) throws  IOException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기문제/학생점수.txt");
        Scanner sc = new Scanner(fis);

        while (sc.hasNext()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));

        }
        for(Student e : treeSet) {
            System.out.println(e.name + " : " + e.getTotal());
        }
    }
}