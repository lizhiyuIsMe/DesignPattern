package action.mediator;

public class Test {
    public static void main(String[] args) {
        //创建中介者
        Mediator concreteMediator = new ConcreteMediator();

        //中介者和国家关联
        China china=new China(concreteMediator);
        America america = new America(concreteMediator);

        //通过中介者 china对USA说
        china.sendMessage("USA","我们武汉有疫情,请协助资源");
        //通过中介者 america对china说
        america.sendMessage("china","我们不协助");

        china.sendMessage("USA","我们疫情控制住了");
    }
}
