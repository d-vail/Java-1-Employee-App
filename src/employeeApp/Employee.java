package employeeApp;

public class Employee {
  private static int maxId = 0;
  private int id;
  private String fname;
  private String lname;
  private double salary;
  private int companyId;
  private int healthPlanId;

  public Employee(String fname, String lname, double salary, int companyId, int healthPlanId) {
    maxId++;     // static variable; this not required
    id = maxId;  // only instance of id; this is not required

    this.fname = fname;
    this.lname = lname;
    this.salary = salary;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getName() {
    return fname + " " + lname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
