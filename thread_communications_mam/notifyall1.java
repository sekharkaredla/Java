
class a extends Thread
{
mythread b;
a(mythread b1)
{
b=b1;
}
public void run() 
{
System.out.println(Thread.currentThread().getName());
synchronized(Thread.currentThread())
{
synchronized(b)
{
System.out.println("calling wait"+Thread.currentThread().getName());
try
{
b.wait();
}
catch(InterruptedException ie)
{
System.out.println(ie.getMessage());
}
System.out.println("sum of 10 no.iz "+b.total+Thread.currentThread().getName());
}
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
synchronized(this)
{
for(i=0;i<10;i++)
{
total=total+i;
}
System.out.println("notify waiting thread");
notifyAll();
}
}
}
class notifyall1
{
public static void main(String args[]) 
{
mythread b2=new mythread();
System.out.println("main");
a a1=new a(b2);
a a2=new a(b2);
a1.setName("1");
a2.setName("2");
a1.start();
a2.start();
b2.start();

System.out.println("end of main");
}
}
