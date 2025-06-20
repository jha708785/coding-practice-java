package java8;

public class thread {

    public static void main(String[] args) {

        Runnable r=()->{

            for (int i=0;i<=10;i++){
                System.out.println("value of i is"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t=new Thread(r);
        t.setName("SUMIT");
        t.start();
        System.out.println(t.getName());



        //r.run();
    }
}
