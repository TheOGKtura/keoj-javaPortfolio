import java.util.*;

public class Employee {
    private String name, department, position;
    private int idNumber;

    // Arg Constructor
    public Employee(String n, int id, String dep, String pos) {
        name = n;
        idNumber = id;
        department = dep;
        position = pos;
    }

    public Employee(String n, String id, String dep, String pos) {
        name = n;
        idNumber = Integer.parseInt(id);
        department = dep;
        position = pos;
    }

    // No Arg Constructor
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    // No Department and Position Constructors
    public Employee(String n, int id) {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee(String n, String id) {
        name = n;
        idNumber = Integer.parseInt(id);
        department = "";
        position = "";
    }

    public String getEmployeeName() {
        return name;
    }

    public int getEmployeeID() {
        return idNumber;
    }

    public String getEmployeeDepartment() {
        return department;
    }

    public String getEmployeePosition() {
        return position;
    }
    
    // Returns said employee
    // Use List<Object> to return multiple values
    public List<Object> getEmployee() {
        return Arrays.asList(name, idNumber, department, position);
    }
}