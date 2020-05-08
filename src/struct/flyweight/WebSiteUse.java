package struct.flyweight;

public class WebSiteUse extends  Website{
    //内部属性
    private String type="";

    public WebSiteUse(String type) {
        this.type = type;
    }

    //这里的username是外部属性
    @Override
    void see(String username) {
        System.out.println(username +" use "+type+" see website");
    }
}
