package TV기본예제;

public class TV {
    private boolean isON; // TV전원
    private int channal;  // 채널
    private int volume;  // 볼륨

    TV() {
        isON = false;
        channal = 11;
        volume = 10;
        System.out.println("전원 : " + isON + ", 채널 : " + channal + ", 볼륨 : " + volume);
    }

    TV(boolean isON, int ch, int vol) {
        this.isON = isON;
        channal = ch;
        volume = vol;
    }

    void setON(boolean isON) {
        this.isON = isON;
        String onoffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onoffStr + "되었습니다.");
    }

    public void setChannal(int ch) {
        if (ch >= 1 && ch <= 999) {
            channal = ch;
            System.out.println("채널을 " + channal + "로 변경 하였습니다.");
        } else {
            System.out.println("채널 설정값이 허용 범위를 벗어났습니다.");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100){
            volume = vol;
            System.out.println("볼륨을" + volume + "변경 하였습니다.");
        }
    }
    public void getInfoTV(){
        String onoffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onoffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channal);
    }

}