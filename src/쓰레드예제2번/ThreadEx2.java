package 쓰레드예제2번;
import static java.lang.Thread.sleep;
// 다른 쓰레드이 종료로 기다림(Join)
public class ThreadEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(); // sumThread 가 작업을 완료 할때까지 기다림.
        } catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());

    }
}

class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run(){
        for (int i=0; i<= 100; i ++){
            sum += 1;
        }
    }

}