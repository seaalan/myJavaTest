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
public class JavaList extends Controller {

    /**
     * 1.声明一个ArrayList
     *
     * @return
     */
    public static Result createArrayList() {
        List<String> list = new ArrayList<String>();
        list.add("luojiahui");
        list.add("luojiafeng");

        //方法1
        Iterator it1 = list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        //方法2
        for(Iterator it2 = list.iterator();it2.hasNext();){
            System.out.println(it2.next());
        }

        //方法3
        for(String tmp:list){
            System.out.println(tmp);
        }

        //方法4
        for(int i = 0;i < list.size(); i ++){
            System.out.println(list.get(i));
        }

        return ok(Json.toJson(list));
    }

}
