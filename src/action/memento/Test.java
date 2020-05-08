package action.memento;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameRole gameRole = new GameRole();
        gameRole.setState("强状态");
        System.out.println("当前状态:"+gameRole.getState());
        gameRole.setMemento("history one");

        gameRole.setState("弱状态状态");
        System.out.println("当前状态:"+gameRole.getState());
        Memento history_one = gameRole.getMemento("history one");

        System.out.println("记录中的" +((GameRole)history_one.getMemento()).getState());
    }
}
