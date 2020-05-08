package action.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    //用于保存所有中介者可以联系到的对象
    private Map<String,Country> countryMap=new HashMap<String,Country>();

    public  void addCountry(String countryName,Country country){
        countryMap.put(countryName,country);
    }
    public abstract void sendMessage(String countryName, String method);

    public Map<String, Country> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, Country> countryMap) {
        this.countryMap = countryMap;
    }
}
