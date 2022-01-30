/*
 * CS5004 HW1.
 * SPRING 2022.
 * Dat Nguyen.
 */

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

    Paycheck brucePaycheck2 = new Paycheck(23.345, 10.56);

    double expected2 = 246.5232;
    assertEquals(expected2, brucePaycheck2.getTotalPay(), 0.001);
  }

  /**
   * Test GetPayAfterTaxes with two different tax rate 10% and 15%.
   */
  @Test
  public void testGetPayAfterTaxes() {

    // Test for taxes for paycheck under $400 @ 10% tax rate
    Paycheck under$400Paycheck = new Paycheck(33.234, 11.111);

    double under$400Expected = 332.33;

    assertEquals(under$400Expected, under$400Paycheck.getPayAfterTaxes(), 0.01);

    // Test for taxes for paycheck over $400 @ 15% tax rate
    Paycheck over$400Paycheck = new Paycheck(53.67, 21.234);

    double over$400Expected = 968.68;
    assertEquals(over$400Expected, over$400Paycheck.getPayAfterTaxes(), 0.01);
  }

  /**
   * Test the toString methods.
   */
  @Test
  public void testToString() {

    String expected = "Payment after taxes: $ 190.08";
    assertEquals(expected, brucePaycheck.toString());
  }

  /**
   * Test the getweeklyhours methods.
   */
  @Test
  public void testGetWeeklyHours() {
    double expected = 10.56;
    assertEquals(expected, brucePaycheck.getWeeklyHours(), 0.001);
  }

  /**
   * Test the getpayrate methods.
   */
  @Test
  public void testGetPayRate() {
    double expected = 20.0;
    assertEquals(expected, brucePaycheck.getPayRate(), 0.001);
  }
}
