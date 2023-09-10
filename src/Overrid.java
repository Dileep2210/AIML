class Dileep{
	void D1() {
		int a=1;
		System.out.println(a);
		
	}
}
class Kumar extends Dileep{
	void D1() {
		int b=12;
		System.out.println(b);
	}
}
public class Overrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kumar m=new Kumar();
		Dileep m=new Kumar();
		m.D1();
		Dileep m1= new Dileep();
//We can refer from parent to child--> Dileep m=new Kumar();
//but we cant't refer from child to parent-->Kumar m=new Dileep();
		m1.D1();
	}

}
