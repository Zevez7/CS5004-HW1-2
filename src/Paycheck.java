/**
 * Dat Nguyen This class represents a PayCheck. The paycheck has weeklyhours, payrate, and
 * totalpay.
 */
class Paycheck {

  private double weeklyHours;
  private double payRate;
  private double totalPay;

  /**
   * The constructor of the class is initialized with weeklyhours and payrate.
   * @param weeklyHours how many hours the employee worked this week
   * @param payRate     the hourly wages of the employee
   */
  public Paycheck(double weeklyHours, double payRate) {
    this.weeklyHours = weeklyHours;
    this.payRate = payRate;
    this.totalPay = this.calculatePay();
  }

  /**
   * Calculate the pay of the employee once the PayCheck constructor is initialized Work hours over
   * 40hrs will be given a 1.5X for the payarate for overtime work.
   * @return the total pay before taxes
   */
  public double calculatePay() {
    double totalPay;

    if (this.weeklyHours > 40.0) {
      double overtimeHours = this.weeklyHours - 40.0;
      double overtimePayRate = this.payRate * 1.5;

      double overtimePay = overtimeHours * overtimePayRate;

      double normalPay = this.payRate * 40.0;

      totalPay = normalPay + overtimePay;
    } else {
      totalPay = this.payRate * this.weeklyHours;
    }
    totalPay = Math.floor(totalPay * 100) / 100.0;
    return totalPay;
  }

  /**
   * Returns the totalPay before taxes.
   * @return the totalPay before taxes.
   */
  public double getTotalPay() {
    return totalPay;
  }

  /**
   * Returns the pay amount minus taxes based the before pay amount.
   * @return the pay amount minus taxes
   */
  public double getPayAfterTaxes() {
    double payAfterTaxes;
    if (this.totalPay < 400.0) {
      payAfterTaxes = this.totalPay - this.totalPay * 0.10;
    } else {
      payAfterTaxes = this.totalPay - this.totalPay * 0.15;
    }

    return payAfterTaxes;
  }

  /**
   * Prints out a string statement that shows the payment after taxes.
   * @return a string of the payment after taxes.
   */
  public String toString() {
    return String.format("Payment after taxes: $%.2f", getPayAfterTaxes());
  }
}
