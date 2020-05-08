package action.state.allstate;

import action.state.AbstractStateAction;
import action.state.EnumState;

/**
 * 还没有下单
 */
public class BeforeOrderState extends AbstractStateAction {

    //下单
    @Override
    public void Order(){
        System.out.println("下单");
    }


    @Override
    public void getCurrentState() {
        System.out.println(EnumState.BEFORE_ORDER);
    }

}
