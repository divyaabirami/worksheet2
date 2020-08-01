package worksheet2;

public class box2 {
public static void main(String a[])
{
	boxs obj1=new boxs();
	obj1.depth=100;
	obj1.heigth=200;
	obj1.width=300;
	obj1.volume();
	boxs obj2=new boxs();
	obj2.depth=10;
	obj2.heigth=20;
	obj2.width=30;
	obj2.volume();
}
}
class boxs
{
	int depth;
	int heigth;
	int width;
	void volume()
	{
		double vol=depth*heigth*width;
		System.out.println("vol="+vol);
	}
}