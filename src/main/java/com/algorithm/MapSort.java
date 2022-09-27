package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peipei
 * @create 2022-09-27 23:4 +4
 * @discription 对类的描述
 */
public class MapSort {
    public static void main(String[] args) {
        // 近期最重要的就是搞懂map中key怎么排序，value怎么排序
        // 是用系统提供的方式还是自己能够手写
        // 系统提供的方式的话，就要能记下来
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " +entry.getValue());
        }
    }
}
