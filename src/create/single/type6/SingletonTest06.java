package create.single.type6;


public class SingletonTest06 {

	public static void main(String[] args) {

		for(;;){
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//System.out.println("˫�ؼ��");
					Singleton instance = Singleton.getInstance();
					Singleton instance2 = Singleton.getInstance();
					//System.out.println(instance == instance2);   //true
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
	private static volatile Singleton instance;
	
	private Singleton() {}
	//�ṩһ����̬�Ĺ��з���������˫�ؼ����룬����̰߳�ȫ����, ͬʱ�������������
	//ͬʱ��֤��Ч��, �Ƽ�ʹ��
	public static  Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
}