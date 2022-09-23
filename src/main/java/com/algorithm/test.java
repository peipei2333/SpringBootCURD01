package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peipei
 * @create 2022-09-23 22:05
 * @discription 对类的描述
 */
public class test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);

        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }

        for (Integer value : map.values()) {
            System.out.println("Value =" + value);
        }


        Map<Integer, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        /**
         * map的结构是：
         * a d c b e
         * - - - - -
         * 1 4 3 2 5
         * 正常排序，map怎么排序？
         *
         */


    }
}
