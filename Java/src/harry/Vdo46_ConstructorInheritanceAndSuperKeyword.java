package harry;

// Keep in mind super keyword is necessary to to call parameterized constructor


class Base2{
	public Base2(){
		System.out.println("Base constructor with no argument ");		
	}
	public Base2(int c, int b, int u){
		System.out.println("Base constructor with no argument ");		
	}
	public Base2(int x,int y){
		System.out.println("Base constructor with argument " +x+" " +y);		
	}
}

class Derived extends Base2{
	public Derived(){
		System.out.println("Derived constructor with no argument ");		
	}
	public Derived(int x,int y,int z){
		super(2,4);
		System.out.println("Derived constructor with argument " +x+" " +y+ " "+z);		
	}
}
class childDerived extends Derived{
	public childDerived(){
		System.out.println("childDerived constructor with no argument ");		
	}
	public childDerived(int z){
		super(2,2,1);
		System.out.println("childDerived constructor with argument " +z);		
	}
}
public class Vdo46_ConstructorInheritanceAndSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base2 b=new Base2();
		childDerived cd=new childDerived(2);
		

	}

}
