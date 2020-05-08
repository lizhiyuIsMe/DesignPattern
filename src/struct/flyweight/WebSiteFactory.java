package struct.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebSiteFactory {
    private Map<String,Website> pool=new ConcurrentHashMap<String,Website>();

    Website getWebsite(String type){
        Website website = pool.get(type);
        if(website == null){
            pool.put(type,new WebSiteUse(type));
            website=pool.get(type);
        }
       return website;
    }

}
