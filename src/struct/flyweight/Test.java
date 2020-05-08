package struct.flyweight;

public class Test {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory=new WebSiteFactory();
        Website phone = webSiteFactory.getWebsite("phone");
        phone.see("lizhiyu");


        Website pc = webSiteFactory.getWebsite("pc");
        pc.see("wangranqingkuang");

    }
}
