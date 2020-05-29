package com.dhan.cache;

import java.util.HashMap;
import java.util.Set;

public class Cache {
    private HashMap<String, String> map;

    private static final Cache instance = new Cache();

    private Cache(){
        map = new HashMap<String, String>();
    }

    public static Cache getInstance(){
        return instance;
    }

    public String get(String key){
        return map.get(key);
    }

    public boolean put(String key, String value){
        try{
            map.put(key, value);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean delete(String key){
        try{
            map.remove(key);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean deleteAll(){
        try{
            map.clear();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Set<String> getKeys(){
        return map.keySet();
    }
}
