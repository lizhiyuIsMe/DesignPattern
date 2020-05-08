package struct.composite;

public class Test {
    public static void main(String[] args) {
       //创建一个学校
        School school=new School("xinhua xiaoxue");
        //创建一个班级
        Class aClass = new Class("5nian2ban");
        school.addClass(aClass);
        //创建一个同学
        Student student=new Student("lizhiyu");
        aClass.addStudent(student);
        Student student2=new Student("huadajie");
        aClass.addStudent(student2);
        school.say();

        
    }
}
