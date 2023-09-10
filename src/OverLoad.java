
public class OverLoad {
	void m1(int a) {
		System.out.println(a);
		
	}
	void m1(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad s=new OverLoad();
		s.m1(12);
		s.m1(12.4);
	}

}
