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
public class JavaMap extends Controller {

    /**
     * 1.声明一个HashMap
     *
     * @return
     */
    public static Result createHashMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        //方法1 效率高,以后一定要使用此种方式！
        Iterator iter1 = map.entrySet().iterator();
        while (iter1.hasNext()) {
            Map.Entry entry = (Map.Entry) iter1.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
        }

        //方法2 效率低,以后尽量少使用！
        Iterator iter2 = map.keySet().iterator();
        while (iter2.hasNext()) {
            Object key = iter2.next();
            Object val = map.get(key);
        }

        return ok(Json.toJson(map));
    }
}
