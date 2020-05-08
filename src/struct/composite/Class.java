package struct.composite;

import java.util.ArrayList;
import java.util.List;
//班级
public class Class extends Component {
    //这里只存储学生
    private List<Component> students=new ArrayList<Component>();
    @Override
    void say() {
        System.out.println("--"+super.getName()+" class\t");
        for(Component student:students){
            student.say();
        }
    }
    void addStudent(Component component){
        students.add(component);
    }


    public Class(String name) {
        super.setName(name);
    }
}
