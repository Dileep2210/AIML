interface Dile{
   void m1();
}
interface Kuar{
	   void m2();
	}

class S implements Dile,Kuar{
	public void m1() {
		System.out.println("DIleep");
	}
	public void m2() {
		System.out.println("Kumar");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S d=new S();
		d.m1();
		d.m2();

	}

}
