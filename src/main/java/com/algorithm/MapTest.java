package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peipei
 * @create 2022-09-25 13:35
 * @discription 对类的描述
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "hah");
        map.put("b", "xix");
        map.put("c", "cac");;

        System.out.println(map.entrySet());



        System.out.println("=====================");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "zhansan");
        System.out.println(map2);
        map2.put("name", "lisi");
        System.out.println(map2);
        map2.put("name1", "wanwu");
        System.out.println(map2);

        System.out.println("hello world");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.print("key值是：" + entry.getKey() + " ");
            System.out.print("value值是：" + entry.getValue());
            System.out.println();
        }

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 1);
        map3.put("b", 2);
        map3.put("c", 3);
        map3.put("d", 4);
        map3.put("e", 5);
        map3.put("f", 6);
        System.out.println(map3);
        // 方案一
        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
            System.out.print("key值是：" + entry.getKey() +" ");
            System.out.print("value值是：" + entry.getValue());
            System.out.println();
        }
        Map.Entry<String, Integer> entry;

        // 方案二
        map3.forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.println("hhh");
    }
}
