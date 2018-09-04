package test;

public class Ref {
	public static void fun(SS ss) {
		ss.setName("Li");
	}
	
	public static void main(String[] args) {
		SS ss = new SS("Ze");
		fun(ss);
		System.out.println(ss.name);
		System.out.println("a");
	}
	
}

class SS{
	String name;
	SS(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
