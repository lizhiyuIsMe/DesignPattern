package action.mediator;

public class America implements Country {

    private Mediator concreteMediator;

    public America(Mediator concreteMediator) {
        this.concreteMediator=concreteMediator;
        concreteMediator.addCountry("USA",this);
    }

    @Override
    public void sendMessage(String countryName, String msg) {
        Country country = concreteMediator.getCountryMap().get(countryName);
        country.getMessage(msg);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("美国收到消息： " + msg);
    }
}
