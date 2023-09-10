class Animal{
	int a=12;
}
class Dog extends Animal{
	void m2() {
		
	    String s="Dileep";
	    System.out.println("meow...."+s);
	}
	
}
public class Inherit {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.m2();
		System.out.println(d.a);
		
	}

}
