// Modified Program to achieve ITC
class Queue
{
    int msg;
    boolean isAvail; // if true means, the message is available producer cannot produce it
    // if false means, the message is available consumer cannot consume it

    public synchronized int get()
    {
        if(!isAvail)
        {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println("Get :" + msg);
        this.isAvail = false; // because message has been taken by me
        notify(); // to the producer
        return msg;
    }

    public synchronized void put(int msg)
    {
        if(isAvail)
        {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        this.msg = msg;
        System.out.println("Put :" + msg);
        this.isAvail = true;
        notify();
    }
}
// ITC using two methods i.e wait() and notify(), can perfectly complete ITC
