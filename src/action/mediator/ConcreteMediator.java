package action.mediator;

/*
具体中介者
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void sendMessage(String countryName, String method) {
        //在这里可以对消息进行拦截
        Country country = super.getCountryMap().get(countryName);
    }
}
