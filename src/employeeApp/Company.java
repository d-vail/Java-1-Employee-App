package employeeApp;

public class Company {
  private static int maxId = 0;
  public int id;
  public String name;
  public int debt;

  public final static double match401K = 0.05;  // final means no one can change it

  public Company(String name, int debt) {
    maxId++;
    id = maxId;

    this.name = name;
    this.debt = debt;
  }

  // override toString method
  @Override
  public String toString() {
    String rtnStr = "id: " + id + "\n" +
		    "name: " + name + "\n" +
		    "debt: " + debt + "\n";
  
    return rtnStr;
  }
}
