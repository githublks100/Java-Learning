package hello;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;

public class GreeterTest
{
  private Greeter greeter = new Greeter();
  private Greeter greeter1 = new Greeter();
  static int counter = 0;

  @BeforeClass
  public static void onceExecutedBeforeAll() {
  System.out.println("@BeforeClass: onceExecutedBeforeAll");
  }
  @Before
  public void executedBeforeEach() {
  System.out.println("@Before: executedBeforeEach");
  counter = counter + 1;
    System.out.println ("Counter value :" + counter);
  }
  @AfterClass
  public static void onceExecutedAfterAll() {
  System.out.println("@AfterClass: onceExecutedAfterAll");
  System.out.println ("Executed as many as :" + counter);
  }
  @After
  public void executedAfterEach() {
    System.out.println("@After: executedAfterEach");
    counter = counter + 1;
    System.out.println ("Counter value :" + counter);
  }

  @Test
  public void greeterSaysHello()
  {
    assertThat(greeter.sayHello(), containsString("Hello"));
    assertEquals(greeter, greeter);
    assertSame(greeter, greeter);
    assertNotSame(greeter, greeter1);
    assertNotEquals(greeter, greeter1);
    assertNotNull(greeter);
  }

  @Test
  public void greeterSaysNoHello()
  {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
}
