package 해시맵기본;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        // Key, Value
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장 : Key, Value
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70);  // 키가 같기 때문에 나중에 저장된 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기 : get(Key), 지정된 키에 대한 값을 반환 합니다.
        System.out.println(map.get("동그라미"));
        // 향상된 for문으로 map 순회
        for(String Key : map.keySet()) { // keySet() key가 포함된 Set 컬렉션 반환
            System.out.println(Key + "\t" + map.get(Key));


        }
        // 객체 삭제 : 키 값으로 해당 Entry를 삭제
        map.remove("최수연");
        for(String Key : map.keySet()) {
            System.out.println(Key + "\t" + map.get(Key));





            // iterator(반복자)를 사용하는 방법
//        Set<String> keySet = map.keySet();
//        Iterator <String> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            String Key = iterator.next();
//            Integer value = map.get(Key);
//            System.out.println(Key + "\t" + value);
//        }

        }

    }
}
