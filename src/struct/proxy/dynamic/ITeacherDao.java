package struct.proxy.dynamic;

/**
 * jdk 代理的类必须要实现接口
 */
public interface ITeacherDao {

	void teach(); // 授课方法

	void sayHello(String name);
}
