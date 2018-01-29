class train
{
}
class compartment
{
}
//train first and then compartment
class book extends Thread
{
train t;
compartment c;
book(train t3,compartment c3)
{
t=t3;
c=c3;
}
public void run()
{
System.out.println("booking tickets");
synchronized(t)
{
//to solve the deadlock , comment the try and catch block in book and cancel
 try{
Thread.sleep(1000);
}catch(InterruptedException ie){
System.out.println(ie);
}
System.out.println("searching for compartment");
synchronized(c)
{
System.out.println("bokking iz in progress");
System.out.println("ticket has been booked");
}
}
}
}
//compartment first and then train
class cancel  extends Thread
{
train t;
compartment c;
cancel(train t3,compartment c3)
{
t=t3;
c=c3;
}
public void run()
{
System.out.println("cancelling tickets");
synchronized(c)
{
try{
Thread.sleep(1000);
}catch(InterruptedException ie){
System.out.println(ie);
}
System.out.println("searching for train");
synchronized(t)
{
System.out.println("cancellation in progress");

System.out.println("cancelled");
}
}
}
}
class ticket_deadlock
{
public static void main(String args[])
{
compartment c1=new compartment();
train t1=new train();
book b=new book(t1,c1);
cancel c=new cancel(t1,c1);
b.start();
c.start(); 
}
} 
