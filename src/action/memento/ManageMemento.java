package action.memento;

import java.util.HashMap;
import java.util.Map;

public  class ManageMemento {
     private static Map<String,Memento> mementoMap=new HashMap<String,Memento>();


     public  static void add(String name,Memento memento){
         mementoMap.put(name,memento);
     }
    public  static Memento get(String name){
       return mementoMap.get(name);
    }
}
