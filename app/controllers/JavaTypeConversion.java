package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alex on 3/21/2016.
 */
public class JavaTypeConversion extends Controller {

    /**
     * 1.String 转换为 Int
     *
     * @return
     */
    public static Result stringToInt() {
        int i = Integer.parseInt("1");
        int j = Integer.valueOf("2").intValue();
        return ok(Json.toJson(i));
    }

    /**
     * 2.Int 转换为 String
     *
     * @return
     */
    public static Result intToString() {
        int i = 1;
        String s1 = String.valueOf(i);
        String s2 = Integer.toString(i);
        String s3 = "" + i;
        return ok(Json.toJson(s1));
    }

    /**
     * 3.String—>Date
     *
     * @return
     */
    public static Result stringToDate() throws ParseException {
        String dateString = "2012-12-06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        return ok(Json.toJson(date));
    }

    /**
     * 4.Date—>String
     *
     * @return
     */
    public static Result DateToString() {
        Date date = new Date();
        String sdate = (new SimpleDateFormat("yyyy-MM-dd")).format(date);
        return ok(Json.toJson(sdate));
    }

}
