class Dog
{
	String color="golden";
	String name="maxy";
	String breed="golden_retreiver";
	int cost=8000;
	
}
public class Arrayy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d1=new Dog();
System.out.println(d1.color);
System.out.println(d1.name);
System.out.println(d1.breed);
System.out.println(d1.cost);
Dog d2;
d2=d1;
System.out.println(d2.color);
System.out.println(d2.name);
System.out.println(d2.breed);
System.out.println(d2.cost);
	}
	


}