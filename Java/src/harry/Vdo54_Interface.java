package harry;

   interface Vdo54_Interface {
	   int c=3; // Can also create properties but cannot change them as they are final 
	   int speedUp(int a);
	   int applyBrakes(int b);
}
   class Volcano implements Vdo54_Interface{
	   int speed =10;
	   int d=34;
	   public int speedUp(int a) {
		   speed = speed-a; 
		   return speed;
	   }
	   public int applyBrakes(int b) {
		   speed = speed-b;
		   return speed;
	   }
   }
   
   


