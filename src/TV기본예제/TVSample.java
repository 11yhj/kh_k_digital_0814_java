package TV기본예제;

public class TVSample {
    public static void main(String[] args) {
        TV tv = new TV();
       // tv.getInfoTV();

        TV gTV = new TV(false, 20, 20);
        //gTV.getInfoTV();

        gTV.setON(true);
        gTV.setChannal(59);
        gTV.setVolume(20);
        gTV.getInfoTV();



    }
}
