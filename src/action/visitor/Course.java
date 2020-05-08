package action.visitor;

//被访问者
public interface Course {

    void  accept(Visitor visitor);

}
