package Basic;

public class ConstructorJava {
	int a;
	int b;
	public ConstructorJava(int a,int b){
		 this.a=a;
		 this.b=b;
	}
public static void main(String[] args) {
ConstructorJava obj = new ConstructorJava(5,6);
	obj.add();
}
public void add() {
	int c =a+b;
	System.out.println(c);
}
}
