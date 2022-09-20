package com.bahetcoder.test;

import lombok.var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author peipei
 * @create 2022-09-17 22:15
 * @discription 对类的描述
 */
public class MasterBranchTest2 {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("lzp");
        list.add("lzp2");
        list.add("lzp3");
        list.add("lzp4");
        for (var c : list) {

            System.out.println("name: " + c);
        }

        System.out.println("============================");
        System.out.println("String[]转List<String>的结果：");
        String[] arr = new String[]{"s1", "s2", "s3"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2);
        for (var c : list2) {
            System.out.println("char: " + c);
        }

        System.out.println("List<String>转String[]");
        List<String> list3 = new ArrayList<String>();
        list3.add("a1");
        list3.add("a2");
        list3.add("a3");
        String[] arr1 = list3.toArray(new String[list3.size()]);
        for(var c : arr1) {
            System.out.println("char : " + c);
        }
        //System.out.println(arr1.toString());


        //单纯用来测试如何查看文件修改的
        List<String> list4 = new LinkedList<>();
        list4.add("1");
        list4.add("2");
    }
}
