package acessmodifier2;

import accessmodifier.Acess1;

public class Acess3 extends Acess1 {
	
	 	public static void main(String[] args) {
		Acess3 obj = new Acess3();
		obj.publicmethod(); 
		//obj.privatemethod(); //can be accessed only in same class and pakage
		//obj.defaultmethod(); // can be accesses only in same pakage
		obj.protectedmethod();
		// TODO Auto-generated method stub

	}

}
