package 코코아톡;

import 인터페이스기본.NetworkAdapter;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk = new CocoaTalk("곰돌이사육사");
        cocoaTalk.writeMsg("오늘 아침에 비가 많이 왔어요^^");
        NetAdapter adapter; // 상속을 주기 위한 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WIFI [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WIFI();
        else  adapter = new FiveG();
        cocoaTalk.send(adapter);
    }
}
