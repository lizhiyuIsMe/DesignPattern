package action.state;

import action.state.allstate.AlreadyPayState;
import action.state.allstate.BeforeOrderState;
import action.state.allstate.PrePayState;

public class Test {
    public static void main(String[] args) {
       Context context=new Context();

       //设置状态为还没有下单
       context.setStateAction(new BeforeOrderState());
       context.Order();


        context.setStateAction(new PrePayState());
        context.payMoney();

        context.setStateAction(new AlreadyPayState());
        context.returnMoney();
    }
}
