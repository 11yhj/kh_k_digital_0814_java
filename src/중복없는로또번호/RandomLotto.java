package 중복없는로또번호;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함.
// 단 중복 제거
// 생성된 val값을 배열에 담을 때 배열내에 해당하는 값이 있는 지 확인 필요.
// 배열은 6개
// 반복횟수는 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 (중복되지 않은 번호 6개가 저장되면 break)
public class RandomLotto {
    public static void main(String[] args) {
//        int[] lotto = new int[6];
//        int tmp, index = 0; // 임시 로또 번호
//        boolean isExist = false;
//
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for (int i = 0; i < lotto.length; i++) {
//                if (lotto[i] == tmp) isExist = true;
//            }
//            if (!isExist) lotto[index++] = tmp;
//            if (index == 6) break;
//            isExist = false;
//        }
//        for (int e : lotto) System.out.print(e + " ");



        //ArrayList
//        List<Integer> list = new ArrayList<>();
//        int tmp;
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            if (!list.contains(tmp)){
//                list.add(tmp);
//            }
//            if (list.size() == 6) break;
//        }
//        System.out.println(list);




        //set : 자바에서 사용 집합 개념
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int tem =(int) ((Math.random() * 45) + 1);
            set.add(tem);
            if (set.size() == 6) break;
        }
        System.out.println(set);


    }
}
