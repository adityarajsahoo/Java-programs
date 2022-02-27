// We should either implement Runnable interface or extend the Thread class.

class ThreadJoin implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " is running() state");
        try 
        {
            for(int i=1;i<=5;i++)
            {
                String str = Thread.currentThread().getName();
                System.out.println(str + " is in running() and value of i is: "+i);
            }
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        ThreadJoin tj1, tj2, tj3, tj4;

        tj1 = new ThreadJoin();
        tj2 = new ThreadJoin();
        tj3 = new ThreadJoin();
        tj4 = new ThreadJoin();

        Thread t1, t2, t3, t4;

        t1 = new Thread(tj1, "Thread-1");
        t2 = new Thread(tj2, "Thread-2");
        t3 = new Thread(tj3, "Thread-3");
        t4 = new Thread(tj4, "Thread-4");

        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(5);
        t4.setPriority(1);


        System.out.println("T1, T2, T3, & T4 Names:" + t1.getName() + "\n" + t2.getName());
        System.out.println(t3.getPriority() + "\n" + t4.getPriority());

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        t3.start();
        t4.start();

        // Whenever we call start method from thread class, then JVM invokes run() method
        // run() method introduces InterruptedException
    }
}
// join() method will convert the parallel processing to serial mode
// we can change the priorities too