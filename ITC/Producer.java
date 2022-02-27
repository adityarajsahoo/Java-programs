class Producer implements Runnable
{
    Queue q;
    String tName;
    Thread t;

    public Producer(Queue q, String tName)
    {
        this.q = q;
        this.tName = tName;
        t = new Thread(this,tName);
        t.start();
    }

    /*public void begin()
    {
        t = new Thread(this, tName);
        t.start();
    }
    */

    public void run()
    {
        int i = 0;

        while(true)
        {
            q.put(i++);
        }
    }
}