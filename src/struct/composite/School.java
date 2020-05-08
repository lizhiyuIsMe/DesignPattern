package struct.composite;

import java.util.ArrayList;
import java.util.List;
//学校
public class School extends Component {
    //这里存储的类型是Component 但是这里只存储班级
    private List<Component> Class=new ArrayList<Component>();
    @Override
    void say() {
        System.out.println(super.getName()+" school \t");
        for(Component hh:Class){
             hh.say();
        }
    }

    void addClass(Component component){
        Class.add(component);
    }

    public School(String name) {
        super.setName(name);
    }
}