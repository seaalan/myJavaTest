package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by alex on 3/22/2016.
 */
public class JavaArray extends Controller {

    /**
     * 1.声明一个数组（Declare an array）
     *
     * @return
     */
    public static Result createArray() {
        String[] aArray = new String[5];
        String[] bArray = {"a", "b", "c", "d", "e"};
        String[] cArray = new String[]{"a", "b", "c", "d", "e"};

        aArray[0] = "aa";
        aArray[1] = "bb";
        aArray[2] = "cc";
        aArray[3] = "dd";
        aArray[4] = "ee";

        // 1.遍历数组的传统方式 **
        System.out.println("1.遍历数组的传统方式-start");
        for (int j = 0; j < aArray.length; j++) {
            String i = aArray[j];
            System.out.println(i);
        }
        System.out.println("1.遍历数组的传统方式-end");

        // 2.遍历Collection对象的传统方式
        System.out.println("2.遍历Collection对象的传统方式-start");
        Collection aArrayList = java.util.Arrays.asList(aArray);
        for (Iterator itr = aArrayList.iterator(); itr.hasNext(); ) {
            Object str = itr.next();
            System.out.println(str);
        }
        System.out.println("2.遍历Collection对象的传统方式-end");

        // 3.第二种for循环 ****
        System.out.println("3.第二种for循环-start");
        for (String i : aArray) {
            System.out.println(i);/* 依次输出“aa”、“bb”、“cc”、“dd”、“ee” */
        }
        System.out.println("3.第二种for循环-end");

        // 4.遍历Collection的简单方式 ****
        System.out.println("4.遍历Collection的简单方式-start");
        Collection aArrayList1 = java.util.Arrays.asList(aArray);
        for (Object str : aArrayList1) {
            System.out.println(str);
        }
        System.out.println("4.遍历Collection的简单方式-end");

        return ok(Json.toJson(aArray));
    }

    /**
     * 2.在Java中输出一个数组（Print an array in Java）
     *
     * @return
     */
    public static Result printArray() {
        int[] intArray = {1, 2, 3, 4, 5};
        String intArrayString = Arrays.toString(intArray);
        // print directly will print reference value
        System.out.println(intArray);// [I@7150bd4d
        System.out.println(intArray.toString());// [I@7150bd4d
        System.out.println(intArrayString);// [1, 2, 3, 4, 5]
        return ok(Json.toJson(intArray));// [1, 2, 3, 4, 5]
//        return ok(Json.toJson(intArrayString));// "[1, 2, 3, 4, 5]"
    }
}
