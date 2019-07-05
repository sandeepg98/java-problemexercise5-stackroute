package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class MapModifier {

    public static Map<String,String> modify (HashMap<String,String> hashMap) {

        hashMap.put("val2",hashMap.get("val1"));
        hashMap.put("val1"," ");
        return hashMap;
    }
}
