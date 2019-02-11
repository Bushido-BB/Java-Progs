class Test9{
    public static void main(String sa[]){
        Threader th1=new Threader();        
        th1.run();
        System.out.println("Main:"+th1.getName());
        System.out.println("Daemoncheck:"+th1.isDaemon());
        th1.setDaemon(!th1.isDaemon());
        th1.stop();
    }
}
class Threader extends Thread{
    public void run(){
        System.out.println("Thread:"+Thread.currentThread().getId()+"  "
        +this.getName()+"   "+Thread.currentThread().getName());
        //Threader th2=new Threader();
        //th2.start();
    }
}