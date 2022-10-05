package com.bahetcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peipei
 * @create 2022-10-04 22:56
 * @discription 对类的描述
 */
public class IDEA {
    public static void main(String[] args) {
        System.out.println("开始对IDEA的一些高效的操作进行整合");
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
