package Thread;


class Demo3 implements Runnable
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
class Thread_3
{
    public static void main(String Args[])
    {
        System.out.println("Inside main thread");
        Demo3 obj1 = new Demo3();
        Demo3 obj2 = new Demo3();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}
