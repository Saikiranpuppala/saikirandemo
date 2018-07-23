package demobitwise;

public class bitwise {
	public static void main1(String args[]) {
		System.out.println(1 | 3); //bitwise
	}
public static void main(String args[]) {
	/*System.out.println(2==2 & 3==3); //logical
	int a = 25, b = 37;
	int c = a < b ? 25 : 37; // terinary
	if(a<b) {
		System.out.println("print if");
	}
	else{
		System.out.println("print else");*/
	bitwise d = new bitwise();
	String str = d.getsum();
	System.out.println(str);
	}
public String getsum() {
	int a = 10, b = 15;
	if (a==b) {
		return "saikiran";
	}
	else {
		
		int c = a < b ? 10:15;
		return "kiran";
	}
}
	 
	 
			 
}


