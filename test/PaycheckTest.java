import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * A JUnit test class for the PayCheck class.
 */
public class PaycheckTest {

  private Paycheck brucePaycheck;

  /**
   * Setup with a new PayCheck initialization.
   */
  @Before
  public void setUp() {
    brucePaycheck = new Paycheck(20.0, 10.56);
  }

  /**
   * Test for the GetTotalPay method.
   */
  @Test
  public void testGetTotalPay() {

    double expected = 211.20;
    assertEquals(expected, brucePaycheck.getTotalPay(),0.001);
  }

  /**
   * Test GetPayAfterTaxes with two different tax rate 10% and 15%.
   */
  @Test
  public void testGetPayAfterTaxes() {

    // Test for taxes for paycheck under $400 @ 10% tax rate
    Paycheck under$400Paycheck = new Paycheck(30.0, 10.0);

    double under$400Expected = 270.00;
    assertEquals(under$400Expected, under$400Paycheck.getPayAfterTaxes(),0.001);

    // Test for taxes for paycheck over $400 @ 15% tax rate
    Paycheck over$400Paycheck = new Paycheck(50.0, 10.0);

    double over$400Expected = 467.50;
    assertEquals(over$400Expected, over$400Paycheck.getPayAfterTaxes(),0.001);
  }

  /**
   * Test the toString methods.
   */
  @Test
  public void testToString() {

    String expected = "Payment after taxes: $ 190.08";
    assertEquals(expected, brucePaycheck.toString());
  }

}
