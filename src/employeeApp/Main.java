package employeeApp;

public class Main {
  private static void workWithData() {
    HealthPlan h1 = new HealthPlan("Florida Blue myBlue Silver");
    HealthPlan h2 = new HealthPlan("Florida Blue BlueSelect Gold");

    Company c1 = new Company("Publix", 100);
    Company c2 = new Company("Winn Dixie", 100);

    Employee emp1 = new Employee("Steve", "Green", 45000, c1.id, h1.getId());
    Employee emp2 = new Employee("May", "Ford", 80000, c1.id, h2.getId());
    Employee emp3 = new Employee("Doug", "Jones", 75000, c2.id, h2.getId());

    System.out.println("*** Query Data ***");
    System.out.println(c1); // will print c1.toString()
  }

  public static void main(String[] args) {
    workWithData();
  }
}
