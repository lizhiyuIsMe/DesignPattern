package action.state;

/**
 * 用于启动的类
 */
public class Context extends AbstractStateAction{
    private StateAction stateAction;


    @Override
    public void Order() {
        stateAction.Order();
    }

    @Override
    public void payMoney() {
        stateAction.payMoney();
    }

    @Override
    public void returnMoney() {
        stateAction.returnMoney();
    }

    @Override
    public void getCurrentState() {
        stateAction.getCurrentState();
    }

    public StateAction getStateAction() {
        return stateAction;
    }

    public void setStateAction(StateAction stateAction) {
        this.stateAction = stateAction;
    }
}
