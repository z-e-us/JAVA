package Basic;
public class Javademo{
Javademo(){
	System.out.println("Default");
}
Javademo(int a){
	System.out.println("Parameterized");
}
Javademo(int a,int b){
	System.out.println("Multi-Parameters");
}
public static void main(String[] args){
	Javademo obj = new Javademo();
	Javademo obj1 = new Javademo(1);
	Javademo obj2 = new Javademo(1,2);
	obj.display();
	System.out.println(obj.display1());
	System.out.println(obj.display2(10,20));

}
public void display(){
	System.out.println("Default");
}

public int display1(){
	int a=10;
	return a;
}

public int display2(int a,int b){
	return (a+b);
}

}