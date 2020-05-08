package create.single.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		for(;;){
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("����ʽ1 �� �̲߳���ȫ~");
				Singleton instance = Singleton.getInstance();
				Singleton instance2 = Singleton.getInstance();
				System.out.println(instance == instance2); // true
				if(instance != instance2){
				System.out.println("instance.hashCode=" + instance.hashCode());
				System.out.println("instance2.hashCode=" + instance2.hashCode());
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		}
	}

}

class Singleton {
	private static Singleton instance;
	private Singleton() {}
	//�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ����ȥ���� instance
	//������ʽ
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}