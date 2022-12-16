package decorator;

import java.util.HashMap;

public class CachedDocument {
    HashMap<String, String> data = new HashMap<String, String>();
    public static void main(String[] args) {

    }
    String toCheck(String path){
        if (data.containsKey(path)){
            return data.get(path);
        }
        return "";
    }
}
