package action.state;

/**
 * 所有的状态的执行方法都要在这里
 */
public interface StateAction {
    //下单
    void Order();

    //付款
    void  payMoney();

    //退款
    void  returnMoney();

    void getCurrentState();
}
