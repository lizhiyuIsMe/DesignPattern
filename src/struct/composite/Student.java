package struct.composite;
//学生
public class Student  extends Component {

    @Override
    void say() {
        System.out.println("----"+super.getName()+" student\t");
    }
    public Student(String name) {
        super.setName(name);
    }
}