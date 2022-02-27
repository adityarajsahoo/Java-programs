class Consumer implements Runnable
{
    Queue q;
    String tName;

    public Consumer(Queue q, String tName)
    {
        this.q = q;
        this.tName = tName;
        /*
        t = new Thread(this, tName);
        t.begin();
        next line is optimization of above comment line
        */ 
        new Thread(this, tName).start();
    }

    public void run()
    {
        while(true)
        {
            q.get();
        }
    }
}