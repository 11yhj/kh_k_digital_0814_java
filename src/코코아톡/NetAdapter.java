package 코코아톡;

import 인터페이스기본.NetworkAdapter;

public interface NetAdapter {
    void connect();
    void send(String mag); //필요한 기능에 대해 추상화 함

}
class WIFI implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WIFI에 연결 되었습니다");

    }

    @Override
    public void send(String mag) {
        System.out.println("WIFI >> " + mag);

    }

}

class FiveG implements NetAdapter{


    @Override
    public void connect() {
        System.out.println("5G에 연결 되었습니다.");

    }

    @Override
    public void send(String mag) {
        System.out.println("5G >>" + mag);

    }
}
