class Car{
	String a ="Dileep";
	
}
class Maruthi extends Car{
    int a=17;
	void m1() {
		System.out.println("Kishore");
	}
}
class Benz extends Car{
	void m2() {
		System.out.println("benz");
	}
}
class Rollsroyce extends Car{
   void m3() {
	   System.out.println("RR");
   }
	
}
public class Hirachal {
	public static void main(String[] args) {
		 Rollsroyce s=new Rollsroyce();
		 s.m3();
		 
		 System.out.println(s.a);
	}

}
