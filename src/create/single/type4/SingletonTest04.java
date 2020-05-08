package create.single.type4;

//�� getInstance�ϼ�synchronized �̰߳�ȫ  ����ʽ
public class SingletonTest04 {

	public static void main(String[] args) {
		for(;;){
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//System.out.println("����ʽ2 �� �̰߳�ȫ~");
					Singleton instance = Singleton.getInstance();
					Singleton instance2 = Singleton.getInstance();
					//System.out.println(instance == instance2); // true
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

// ����ʽ(�̰߳�ȫ��ͬ������)
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ����
	//������ʽ
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}