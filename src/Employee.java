/**
 * This is the employee class with name, ID, hoursWorked, payrate, and totalPayAfterTax.
 */

class Employee {

  private String name;
  private String employeeId;
  private double hoursWorked;
  private double payRate;
  private double totalPayAfterTax;

  /**
   * Constructor of Employee Class that initialize with these params below.
   *
   * @param name       name of the employee.
   * @param employeeId employee identification.
   * @param payRate    payrate for the hourly wage.
   */

  public Employee(String name, String employeeId, double payRate) {
    this.name = name;
    this.employeeId = employeeId;
    this.hoursWorked = 0.0;
    this.payRate = payRate;
    this.totalPayAfterTax = 0.0;
  }

  /**
   * Add hours worked to the employee hoursWorked object.
   *
   * @param hours hours worked by the employee.
   */
  public void addHoursWorked(double hours) {

    double totalHours = this.hoursWorked + hours;

    // check for negative hours
    if (totalHours < 0.0) {
      this.hoursWorked = 0.0;
    } else {
      this.hoursWorked = totalHours;
    }
  }

  /**
   * Resets the worked hours to 0.0 for the class.
   */
  public void resetHoursWorked() {
    this.hoursWorked = 0.0;
  }

  /**
   * Returns the class hoursWorked.
   *
   * @return the class hoursWorked.
   */
  public double getHoursWorked() {
    return hoursWorked;
  }

  /**
   * Returns a paycheck object initiated with hoursWorked and payRate from the employee object.
   *
   * @return a paycheck object.
   */
  public Paycheck getWeeklyCheck() {
    Paycheck employeePaycheck = new Paycheck(this.payRate, this.hoursWorked);
    this.totalPayAfterTax = employeePaycheck.getPayAfterTaxes();

    return employeePaycheck;
  }

  /**
   * Returns a string of with the name, id, and payment after taxes.
   *
   * @return string of with the name, id, and payment after taxes.
   */
  public String toString() {
    Paycheck employeePaycheck = this.getWeeklyCheck();
    return String.format("Name: %s\nID: %s\nPayment after taxes: $ %.2f", this.name,
        this.employeeId, employeePaycheck.getPayAfterTaxes());
  }

  /**
   * Return name from employee instance.
   *
   * @return name from employee instance.
   */
  public String getName() {
    return name;
  }

  /**
   * Return employeeId from employee instance.
   *
   * @return employeeId from employee instance.
   */
  public String getEmployeeId() {
    return employeeId;
  }

  /**
   * Return payrate from employee instance.
   *
   * @return payrate from employee instance.
   */
  public double getPayRate() {
    return payRate;
  }
}
