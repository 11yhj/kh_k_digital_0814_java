package TV기본예제;

public class TV {
    private boolean isON; // TV전원
    private int channal;  // 채널
    private  int volume;  // 볼륨
    TV(){
        isON = false;
        channal = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channal + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol){
        this.isON = isON;
        channal = ch;
        volume = vol;
    }

    private void setON(boolean isON){
        this.isON = isON;
    }

}
