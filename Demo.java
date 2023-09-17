package Assignment_no_1;

public class Demo {
	static int j=30;
	int i=30;
	boolean isActive;
	public Demo() {
		i=60;
	}
//... is called var args just like String... ke age
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50;
		Demo a1=new Demo();
		a1.i=80;
		Demo a2=new Demo();
		a2.i=90;
		System.out.println(a1+"\t"+a2);
		System.out.println(a1.i+"\t"+a2.i);

	}

}
