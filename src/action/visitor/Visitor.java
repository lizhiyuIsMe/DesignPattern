package action.visitor;

public class Visitor implements VisitorInter{
    //根据访问者类型来 调用访问者的方法
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("你的课程是:"+freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("你的课程是:"+codingCourse.getName() +" 价钱是:"+codingCourse.getPrice());
    }
}
