abstract class machine
  {
private int id;
   static int getid()
    {
      return id;
    }
    static void  setid(int id)
    {

      this.id = id;
      
    }

    //define
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();
    public void run()
    {

      start();
      doStuff();
      shutdown();
      
    }
    
    
  }
class camera extends machine
  {//declare
    void start()
    {

      System.out.println("camera is starting");
    }

    void doStuff()
    {

      System.out.println("do stuff with camera");
    }

    void shutdown()
    {
System.out.println("shut down camera");
      
    }
  }

class car extends machine
  {
//declare
    void start()
    {
System.out.println("car starting");
      
    }

     void doStuff()
    {

      System.out.println("do stuff with car");
    }

    
    void shutdown()
    {
System.out.println("shut down car");
      
    }
  }
