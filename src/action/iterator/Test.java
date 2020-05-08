package action.iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //ArrayList 实现了 Iterable<T> 迭代器接口
        //Iterable  接口中会返回 调用 iterator();  会返回一个迭代器对象
        //也就是在ArrayList中要创建一个迭代器
        //ArrayList继承的 AbstractList中 创建了一个内部类 Itr();
        // Itr  类中实现了  hasnext next  等方法用于ArrayList遍历
        List list=new ArrayList<String>();

        // 的父类 AbstractSequentialList 对象,会创建 new ListItr(index) 对象
        // 对象中重写了
        List list2=new LinkedList();
    }
}
