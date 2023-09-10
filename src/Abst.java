abstract class Abd{
	abstract void m4();
	void m1() {
		System.out.println("dileep");
	}
}
class Adc extends Abd{
	void m4() {
		System.out.println("kumar");
	}
}
public class Abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adc g =new Adc();
		g.m4();
		g.m1();
		//we can't create objects for abstract classes but
		// we can create refrence for abstract classes
		Abd g1=new Adc();
		g1.m1();
      }

 }
