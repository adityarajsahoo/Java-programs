class MyThread implements Runnable
{
    String tName;
    Thread t;

    public MyThread(String tName)
    {
        this.tName = tName;
    }

    public void begin()
    {
        if(t==null)
        {
            t = new Thread(this, tName);
            t.start();
        }
    }
    public void run() 
    {
        System.out.println("Thread " + tName + " is in running state");

        try
        {

        for(int i = 1; i<=6; i++)
        {
            System.out.println("Thread" + tName + " :: i value is : " + i);
            Thread.sleep(100);
        }
    }
    catch(InterruptedException ie){ ie.printStackTrace();}

    

        System.out.println("Thread gets terminated");
    }

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Thread-1");
        MyThread mt2 = new MyThread("Thread-2");

        mt1.begin();
        mt2.begin();
    }
}