class notify1
{
public static void main(String args[]) throws InterruptedException
{
mythread b=new mythread();
b.start();
System.out.println(Thread.currentThread().getName());
synchronized(Thread.currentThread())
{
synchronized(b)
{
System.out.println("calling wait");
b.wait();
System.out.println("sum of 10 no.iz"+b.total);
}
System.out.println("end main");
}
}
}
class mythread extends Thread
{
int total=0;
public void run()
{
int i;
System.out.println(Thread.currentThread().getName());
synchronized(Thread.currentThread())
{
for(i=0;i<10;i++)
{
total=total+i;
}
System.out.println("notify waiting thread");
notify();
}
}
}
