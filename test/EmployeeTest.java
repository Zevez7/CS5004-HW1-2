
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * A JUnit test class for the Employee class.
 */
public class EmployeeTest {

  private Employee Bruce;

  /**
   * Setup with a new Employee instance initialization.
   */
  @Before
  public void setUp() {
    Bruce = new Employee("Bruce", "123 BATMAN", 50.00);
  }

  /**
   * Test  addHoursWorked.
   */
  @Test
  public void testAddHoursWorked() {

    // Test for positive work hours
    Bruce.addHoursWorked(20.0);
    double expectedPositiveHours = 20.0;
    assertEquals(expectedPositiveHours, Bruce.getHoursWorked(),0.001);

    // Test for negative work hours
    Bruce.addHoursWorked(-40.0);
    double expectedNegativeHours = 0.0;
    assertEquals(expectedNegativeHours, Bruce.getHoursWorked(),0.001);

  }

  /**
   * Test resetHoursWorked.
   */
  @Test
  public void testResetHoursWorked() {

    Bruce.addHoursWorked(20.0);
    Bruce.resetHoursWorked();
    double expected = 0.0;
    assertEquals(expected, Bruce.getHoursWorked(),0.001);
  }

  /**
   * Test getWeeklyCheck by checking the toString of the PayCheck obj inside Employee Obj.
   * Check if a new PayCheck obj toString has the same output.
   */
  @Test
  public void testGetWeeklyCheck() {

    Bruce.addHoursWorked(20.0);
    Paycheck expected = new Paycheck(20.0, 50.00);
    assertEquals(expected.toString(), Bruce.getWeeklyCheck().toString());
  }

  /**
   * Test toString.
   */
  @Test
  public void testToString() {

    Bruce.addHoursWorked(20.0);
    Bruce.getWeeklyCheck();

    String expected = "Name: Bruce \nID: 123 BATMAN \nPayment after taxes: $ 850.00";
    assertEquals(expected, Bruce.toString());
  }

}