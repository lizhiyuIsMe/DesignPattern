package action.state.allstate;

import action.state.AbstractStateAction;
import action.state.EnumState;

/**
 * 已经付钱
 */
public class AlreadyPayState  extends AbstractStateAction {


    //退钱
    @Override
    public void returnMoney() {
        System.out.println("退钱");
    }


    @Override
    public void getCurrentState() {
        System.out.println(EnumState.ALREADY_PAY);
    }
}
