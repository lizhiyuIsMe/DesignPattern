package action.visitor;

public class CodingCourse implements Course{
    private String name;
    private String price;
    //被访问者 接收 访问者 进而将自己给访问者
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
