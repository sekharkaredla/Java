class WaitNotify1

{


static public void main(String[] args)throws Exception

  {

StringBuffer sb = new StringBuffer(" CBIT");


    Object o = new Object();

    Thread t1 = new DataProducer1(sb);

    Thread t2 = new DataConsumer1(sb);

t2.start();

t1.start();

  }

}

class DataProducer1  extends Thread

{

StringBuffer sb;

boolean dataprodover = false;

public DataProducer1(StringBuffer o)

  { 

  }

public void run()

  { 

     { 

       {

sb.append("."+" Hello"); 



   } 

  }

}
}
class DataConsumer1 extends Thread

{

   DataProducer1 dp;

StringBuffer sb;

public DataConsumer1(StringBuffer o)

   { 

   }

public void run(){

try

   {


synchronized(sb)

     { 

     } 
}

catch(Exception e){}

    }

}
