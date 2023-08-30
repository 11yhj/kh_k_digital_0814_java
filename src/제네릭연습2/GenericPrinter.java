package 제네릭연습2;

public class GenericPrinter<T> {
    private T material; // T 자료형으로 변수 선언
    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }



}

class Power {
    public void doPrinting() {
        System.out.println("Power 재료로 출력 합니다.");


    }
    public String toString(){
        return  "재료는 Power 입니다";

    }
}




