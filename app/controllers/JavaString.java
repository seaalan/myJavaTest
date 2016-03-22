package controllers;

import play.*;
import play.libs.Json;
import play.mvc.*;

/**
 * Created by alex on 3/21/2016.
 */
public class JavaString extends Controller {

    /**
     * 1.查找字符串
     * 返回参数字符串s在指定字符串中首次出现的索引位置
     *
     * @return
     */
    public static Result searchFirstSize() {
        String str = "We are students";
        int size = str.indexOf("a"); // 变量size的值是3
        return ok(Json.toJson(size));
    }

    /**
     * 2.查找字符串
     * 该方法用于返回字符串最后一次出现的索引位置
     *
     * @return
     */
    public static Result searchLastSize() {
        String str = "We are students";
        int size = str.lastIndexOf("t"); // 变量size的值是13
        return ok(Json.toJson(size));
    }

    /**
     * 3.获取指定索引位置的字符
     *
     * @return
     */
    public static Result searchChar() {
        String str = "hello world";
        char ch = str.charAt(4);//变量ch为o
        return ok(Json.toJson(ch));
    }

    /**
     * 4.获取子字符串
     *
     * @return
     */
    public static Result searchSubstring() {
        String str = "hello world";
        String substr = str.substring(0, 3);//变量substr为“hel”
        return ok(Json.toJson(substr));
    }

    /**
     * 5.替换字符串
     *
     * @return
     */
    public static Result replaceString() {
        String str = "Hello world";
        String substr = str.replace('H', 'h');//变量substr为“hello world”
        return ok(Json.toJson(substr));
    }

    /**
     * 6.判断字符串的开始
     *
     * @return
     */
    public static Result isStartWith() {
        String str = "Hello world";
        Boolean isStart = str.startsWith("He");//isStart是true
        return ok(Json.toJson(isStart));
    }

    /**
     * 7.判断字符串的结尾
     *
     * @return
     */
    public static Result isEndWith() {
        String str = "Hello world";
        Boolean isEnd = str.endsWith("d");//isEnd是true
        return ok(Json.toJson(isEnd));
    }

    /**
     * 8.判断字符串是否相等
     *
     * @return
     */
    public static Result isEquals() {
        String str = "Hello world";
        Boolean substr1 = str.equals("Hello");
        return ok(Json.toJson(substr1));
    }

    /**
     * 9.字符串分割
     *
     * @return
     */
    public static Result strSplit() {
        String str = "Hello world";
        String[] substr1 = str.split(" ");
        return ok(Json.toJson(substr1));
    }

}
