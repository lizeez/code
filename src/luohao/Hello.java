package luohao;

class A {

    static {
        System.out.print("1");
    }
    
    static {
        System.out.print("2");
    }

    public A() {
        System.out.print("3");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    static {
        System.out.print("b");
    }
    public B() {
        System.out.print("c");
    }
}

public class Hello {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
        
    }

}
