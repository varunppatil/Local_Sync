package harry;

abstract class Base6{
	int a=45;
	abstract void head();
	abstract void tail();
	
}

class Child2 extends Base6{
	@Override
	void head() {
		System.out.println("Head at top ");
	}
	@Override
	void tail() {
		System.out.println("Tail at end ");
	}
}
 abstract class Child3 extends Base6{
	 void head() {
		 System.out.println("Head in child3");
	 }
 }

public class Vdo53_AbstractClassesAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child3 ch3 =new Child3(); // Not been instantiated cause it is abstract class
		//NO issue as we utilized class methods
		Child2 ch2=new Child2();
		ch2.head();
		ch2.tail();
		ch2.a=444; // No issue for changing properties varibles of abstract class
		
	}

}
