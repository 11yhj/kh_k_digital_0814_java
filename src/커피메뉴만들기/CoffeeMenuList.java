package 커피메뉴만들기;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// HashMap으로 커피 메뉴 리스트 만들기
public class CoffeeMenuList {
    // 문자열로 만들어진 키와 커피의 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        makeMenu();
        selectMenu();

    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함 커피"));


    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String Key = "";  // 키를 받기 위한 문자열 변수
        while (true){
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.println("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu){
                case 1 :
                    System.out.println("=".repeat(10) + "메뉴보기" + "=".repeat(10));
                    for (String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescription());
                        System.out.println("-".repeat(28));
                    }
                    break;

                case 2 :
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    Key = sc.next();
                    // 포함여주 확인하는 메소드 containsKey(Key) : map내에 해당 키가 있는지 확인하여 결과를 반환
                    if (map.containsKey(Key)) {
                        System.out.println("메뉴 : " + map.get(Key).getName());
                        System.out.println("가격 : " + map.get(Key).getPrice());
                        System.out.println("분류 : " + map.get(Key).getCategory());
                        System.out.println("설명 : " + map.get(Key).getDescription());
                    }else{System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;

                    }
                case 3 :
                    System.out.println("추가할 메뉴를 입력 하세요 : ");
                    Key = sc.next();
                    if (map.containsKey(Key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    }else{
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : "  );
                        String description = sc.nextLine();
                        map.put(Key, new MenuInfo(Key, price, category, description));
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 메뉴를 입력 하세요.");
                    Key = sc.next();
                    if (map.containsKey(Key)) {
                        map.remove(Key);
                        System.out.println(Key + "메뉴를 삭제 하였습니다");
                    }else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                        break;
                    }
                case 5 :
                    System.out.print("수정할 메뉴를 입력 하세요 : ");
                    Key = sc.next();
                    if (map.containsKey(Key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // 키값은 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(Key, new MenuInfo(Key, price, category, description));
                    }else {
                        System.out.println("수정할 메뉴가 없습니다.");
                        break;

                    }
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    FileOutputStream fos = new FileOutputStream("src/커피메뉴만들기/coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;
                default: System.out.println("선택하신 메뉴가 없습니다.");

            }
        }
    }

}
