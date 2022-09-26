package com.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
            System.out.println("每个entry内容是：" + entry);
            System.out.print("key值是：" + entry.getKey() +" ");
            System.out.print("value值是：" + entry.getValue());
            System.out.println();
        }
        System.out.println("map3.entrySet()内容是：" + map3.entrySet());
        Map.Entry<String, Integer> entry;

        // 方案二
        map3.forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.println("hhh");

        System.out.println("分界线=============");
        System.out.println(map3.keySet());
        System.out.println(map3.keySet().size());
        map3.keySet();
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println(set);

        System.out.println();

        System.out.println("分割线=================");
        Map<String, Object> map4 = new HashMap<>();
        map4.put("1", 1);
        map4.put("2", 2);
        map4.put("3", 3);
        map4.put("4", 4);
        map4.put("5", 5);
        map4.put("6", 6);
        for (Map.Entry<String, Object> entry2 : map4.entrySet()) {
            System.out.print("entry2的值是" + entry2.getKey() + " ");
            System.out.print("entry2的键是" + entry2.getValue());
            System.out.println();
        }

        // 重新遍历map4
        for (Map.Entry<String, Object> entry2 : map4.entrySet()) {
            System.out.println(entry2.getKey() + " " + entry2.getValue());
        }
    }
}
