package action.state;

public abstract class AbstractStateAction implements StateAction{
    private static final Exception exception=new RuntimeException("你没有该权限");
    @Override
    public void Order() {
        try {
            throw exception;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void payMoney() {
        try {
            throw exception;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void returnMoney() {
        try {
            throw exception;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
