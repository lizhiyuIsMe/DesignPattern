package action.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //初始化容器
        List<Course> courses = new ArrayList<>();

        //构建课程实现
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC.");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java design pattern.");
        codingCourse.setPrice("299");

        //装填
        courses.add(freeCourse);
        courses.add(codingCourse);

        //访问者
        Visitor visitor = new Visitor();

        for (Course course : courses) {
            //被访问者接受访问者访问
            course.accept(visitor);
        }
    }
}
