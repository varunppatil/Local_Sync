import java.util.ArrayList;
import java.util.List;

public class ArraylistP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gav=new ArrayList<String>();
		gav.add("Pimpale");
		System.out.println(gav.get(0));
		gav.remove(0);
		gav.get(0);
		
		try {
			System.out.println(gav.get(0));
		} catch (Exception e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
