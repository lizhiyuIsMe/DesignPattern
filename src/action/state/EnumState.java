package action.state;

//存储所有状态以及说明
public enum EnumState {

    BEFORE_ORDER(2, "已经下单,还没有付款"),

    BEFORE_PAY(1, "还没有下单"),


    ALREADY_PAY(3, "已付款");


    private int key;
    private String value;

    EnumState(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public int getKey() {return key;}
    public String getValue() {return value;}


}
