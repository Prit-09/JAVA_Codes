package Thread;


class Demo4 extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 1; i<= 1000; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

public class Thread_4 
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");
        Demo4 obj1 = new Demo4();
        Demo4 obj2 = new Demo4();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    } 

}
