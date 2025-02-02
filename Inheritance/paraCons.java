package Inheritance;

public class paraCons extends Test {
    // Empty class as a class cannot define another class
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test(96,69);
    }

}

class Test {
    int a,b;
    Test(){
        this.a=0;
        this.b=0;
    }
    Test (int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
}




class Demo extends Test{
    int x,y;
    Demo(){
        super();
        this.x=0;
        this.y=0;
    }
    Demo(int x,int y){
        super();
        this.x=x;
        this.y=y;
    }
    Demo(int a, int b, int x, int y){
        super();
        this.x=x;
        this.y=y;
    }
    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo(1,2,3,4);
        d1.show();
        d2.show();
    }
}

    
