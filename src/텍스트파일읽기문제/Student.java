package 텍스트파일읽기문제;

public class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    int getTotal() {
        return kor + eng + mat;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getTotal() < o.getTotal()) return  1;
        else return -1;

    }
}
