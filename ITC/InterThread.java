public class InterThread
{
    public static void main(String[] args) 
    {
        Queue queue = new Queue();

        Producer p = new Producer(queue,"Producer Thread");
        Consumer c = new Consumer(queue,"Consumer Thread");

        System.out.println("Ctrl+C to terminate the program");
    }
}