package Basic;
public class Rev{
public static void main(String[] args){
	String text="This is a String";
	StringBuffer sbuff = new StringBuffer();
	System.out.println(text.length());
	for(int i=text.length()-1;i>=0;i--){
		sbuff.append(text.charAt(i));
	}
	System.out.println(sbuff);
} 
}