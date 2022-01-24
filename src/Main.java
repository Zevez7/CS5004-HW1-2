
public class Main {

  public static void main(String[] args) {
    PayCheck paycheck1 = new PayCheck(10.0, 10.0);
    System.out.println(paycheck1.getTotalPay());
    System.out.println(paycheck1.toString());

    Double pay = paycheck1.getTotalPay();
    System.out.println(pay);

    Employee john = new Employee("John", "1234", 10.0);
    System.out.println("John hours worked " + john.getHoursWorked());
    john.addHoursWorked(40.0);
    System.out.println("John hours worked " + john.getHoursWorked());
    john.getWeeklyCheck();

    System.out.println(john.toString());
  }

}
