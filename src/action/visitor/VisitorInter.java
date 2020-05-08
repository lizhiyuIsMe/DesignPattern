package action.visitor;

/**
 * 访问者
 */
public interface VisitorInter {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}