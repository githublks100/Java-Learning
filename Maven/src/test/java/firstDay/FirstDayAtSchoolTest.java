package firstDay;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
public class FirstDayAtSchoolTest
{
   FirstDayAtSchool firstdayinSchool = new FirstDayAtSchool();
  @Test
  public void testPrepareMyBag()
  {
    String[] schoolbag = {"Books" , "NoteBooks", "Pens"};
    assertArrayEquals(firstdayinSchool.prepareMyBag(),schoolbag);
  }
}
