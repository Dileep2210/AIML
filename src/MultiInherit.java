class Anial{
	String s="animals";
}
class Dig extends Anial{
	void dog() {
		System.out.println("Buah...");
	}
}
class Cat extends Dig{
	void cat() {
		System.out.println("Meow...");
	}
}
public class MultiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.cat();
		c.dog();
		System.out.println(c.s);

	}

}
