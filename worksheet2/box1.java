package worksheet2;

import java.util.Scanner;

public class box1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
box obj=new box();
obj.depth=10;
obj.heigth=20;
obj.width=10;
obj.volume();
}
}
class box
{
int depth;
int heigth;
int width;
void volume()
{
	double vol=depth*heigth*width;
	System.out.println("VOLUME="+vol);
	
}
}