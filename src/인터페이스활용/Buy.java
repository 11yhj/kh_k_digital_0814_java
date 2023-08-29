package 인터페이스활용;

public interface Buy {
    void buy();

}
interface Sell {
    void Sell();
}

class Customer implements Buy, Sell {


    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void Sell() {
        System.out.println("판매하기");

    }
}
