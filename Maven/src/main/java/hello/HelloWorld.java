package hello;
import org.joda.time.LocalTime;
public class HelloWorld
{
  public static void main(String[] args)
  {
	 // added some comments
    Greeter greeter1 = new Greeter();
    LocalTime currentTime = new LocalTime();
    System.out.println("the current local time is:" + currentTime);
    System.out.println(greeter1.sayHello());
  }
}
