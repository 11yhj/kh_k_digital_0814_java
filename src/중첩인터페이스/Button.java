package 중첩인터페이스;

public class Button {
    OnClickListener listener; // 생성된 객체의 주소를 대입 받기 위함

    void setonclickListener(OnClickListener listener){
        this.listener = listener;


    }

    void touch(){
        listener.onclick();  // 구현 객체의 onclick() 메소드 호출
    }


    // 클래스 내부에서 인터페이스를 만듦(중첩인테페이스)
    interface OnClickListener{
        void onclick();

    }
}
