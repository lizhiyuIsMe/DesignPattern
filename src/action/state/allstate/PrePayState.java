package action.state.allstate;

import action.state.AbstractStateAction;
import action.state.EnumState;

/**
 *  还没有付款
 */
public class PrePayState extends AbstractStateAction {

    //付钱
    @Override
    public void payMoney() {
        System.out.println("付钱操作");
    }


    @Override
    public void getCurrentState() {
        System.out.println(EnumState.BEFORE_PAY);
    }
}
