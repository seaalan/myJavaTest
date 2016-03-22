package controllers;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;

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
        for (int i = 0; i < aArray.length; i++) {
            System.out.println(aArray[i]);
        }
        System.out.println("1.遍历数组的传统方式-end");

        // 2.遍历数组的简单方式 ****
        System.out.println("2.遍历数组的简单方式-start");
        for (String i : aArray) {
            System.out.println(i);/* 依次输出“aa”、“bb”、“cc”、“dd”、“ee” */
        }
        System.out.println("2.遍历数组的简单方式-end");

        Collection aArrayList = java.util.Arrays.asList(aArray);

        // 3.遍历Collection对象的传统方式
        System.out.println("3.遍历Collection对象的传统方式-start");
        for (Iterator itr = aArrayList.iterator(); itr.hasNext(); ) {
            Object str = itr.next();
            System.out.println(str);
        }
        System.out.println("3.遍历Collection对象的传统方式-end");

        // 4.遍历Collection对象的简单方式 ****
        System.out.println("4.遍历Collection对象的简单方式-start");
        for (Object str : aArrayList) {
            System.out.println(str);
        }
        System.out.println("4.遍历Collection对象的简单方式-end");

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

    /**
     * 3.从数组中创建数组列表（Create an ArrayList from an array）
     *
     * @return
     */
    public static Result createArrayListFromArray() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);// [a, b, c, d, e]
        return ok(Json.toJson(arrayList));
    }

    /**
     * 4.检查数组中是否包含特定值（Check if an array contains a certain value）
     *
     * @return
     */
    public static Result checkArrayContainsValue() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);// true
        return ok(Json.toJson(b));
    }

    /**
     * 5.连接两个数组（ Concatenate two arrays）
     *
     * @return
     */
    public static Result concatenateTwoArrays() {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = {6, 7, 8, 9, 10};
        // Apache Commons Lang library
        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
        return ok(Json.toJson(combinedIntArray));
    }

    /**
     * 6.将数组元素加入到一个独立的字符串中（Joins the elements of the provided array into a single String）
     *
     * @return
     */
    public static Result joinArrayToString() {
        String j = StringUtils.join(new String[]{"a", "b", "c"}, ", ");
        System.out.println(j);
        return ok(Json.toJson(j));
    }

    /**
     * 7.将数组列表转换成一个数组 （Covnert an ArrayList to an array）
     *
     * @return
     */
    public static Result covnertArrayListToArray() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr) {
            System.out.println(s);
        }
        return ok(Json.toJson(stringArr));
    }

    /**
     * 8.将数组转换成一个集合（Convert an array to a set）
     *
     * @return
     */
    public static Result covnertArrayToSet() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);//[d, e, b, c, a]
        return ok(Json.toJson(set));
    }

    /**
     * 9.反向数组（Reverse an array）
     *
     * @return
     */
    public static Result reverseArray() {
        int[] intArray = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));//[5, 4, 3, 2, 1]
        return ok(Json.toJson(intArray));
    }

    /**
     * 10.删除数组元素（Remove element of an array）
     *
     * @return
     */
    public static Result removeArrayElement() {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
        System.out.println(Arrays.toString(removed));
        return ok(Json.toJson(removed));
    }
}
