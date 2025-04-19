package modleLabJava;





class threadDemo extends Thread{
    public  threadDemo(String Name) {
        super(Name);
    }
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(getName()+"-"+ i );
            if(i==3){
                System.out.println(Thread.currentThread().getName()+"is yeilding...");
                Thread.yield();
            }
    }
}   

public static void main(String[] args) {
    threadDemo t1 = new 
    threadDemo("thread - 1");
    threadDemo t2 = new 
    threadDemo("thread - 2");

    t1.start();
    t2.start();
}

}
            
        