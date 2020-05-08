package action.mediator;

public class China  implements Country {
    private Mediator concreteMediator;
    public China(Mediator concreteMediator) {
        this.concreteMediator=concreteMediator;
        concreteMediator.addCountry("china",this);
    }

    @Override
    public void sendMessage(String countryName, String msg) {
        Country country = concreteMediator.getCountryMap().get(countryName);
        country.getMessage(msg);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("中国收到消息： "+msg);
    }
}