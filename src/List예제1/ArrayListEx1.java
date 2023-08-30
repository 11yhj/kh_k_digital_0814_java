package List예제1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // List 인터페이스의 참조 변수로 ArrayList 객체를 참조함
        List<MenuInfo> menuLInfoList = new ArrayList<>();
        // add는 객체를 추가, 추가 할때마다 크기가 변함
        menuLInfoList.add(new MenuInfo("Americano", 2500, "coffee", true));
        menuLInfoList.add(new MenuInfo("Latte", 4000, "coffee", true));
        menuLInfoList.add(new MenuInfo("BlackTea", 4000, "tea", true));
        // 향상된 for문 배열이나 Collection 클래스 자식들
        for (MenuInfo menu : menuLInfoList) {
            System.out.println(menu.getMenuInfo());
        }

        for (int i = 0; i < menuLInfoList.size(); i ++){
            System.out.print(menuLInfoList.get(i).getMenuInfo());
        }

    }
}

class MenuInfo{
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }
    public String getMenuInfo(){
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+",}";

    }


}