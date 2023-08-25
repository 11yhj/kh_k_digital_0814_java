package 인터페이스기본;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 포함됨

    void send(String mag);
}

// 유선 인터넷
class LAN implements NetworkAdapter{
    String company;
    LAN(String company){
        this.company =company;
    }

    @Override
    public void connect() {
        System.out.println(company+"LAN 에 연결 되었습니다.");

    }

    @Override
    public void send(String mag) {

    }
}

class WIFI implements NetworkAdapter{
    String company;
    WIFI(String company){
        this.company = company;

    }

    @Override
    public void connect() {
        System.out.println(company + " WIFI에 연결 되었습니다.");

    }

    @Override
    public void send(String mag) {

    }
}

class FiveG implements NetworkAdapter{
    String company;
    FiveG(String company){
        this.company = company;

    }

    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결 되었습니다.");
    }

    @Override
    public void send(String mag) {

    }
}
