package Patterns_Java;
public class Pat{
public static void main(String[] args){
	for (int i=1;i<=8;i++){
		for (int j=1;j<=i;j++){
			System.out.print("*");
		}
		for (int k=1;k<=(2*8-1)-2*i;k++){
			System.out.print("_");
		}
		if(i==8){
		for (int l=1;l<=i-1;l++){
			System.out.print("*");
		}
		break;
		}
		for (int l=1;l<=i;l++){
			System.out.print("*");
		}
	System.out.println();
	}
}
}

