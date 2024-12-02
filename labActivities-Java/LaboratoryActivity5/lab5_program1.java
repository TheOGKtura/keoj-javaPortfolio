public class lab5_program1 {
    public static void main(String[] args) {
        Employee Two = new Employee("Joan Lazaro", "06208", "Engineering", "President");
        Employee Three = new Employee("Paraluman Sim", "05752", "R and D", "Manager");
        Employee Four = new Employee("Keoj Lyle M. Sioco", 11166, "Engineering", "Student");

        showEmployee(Two);
        showEmployee(Four);
        showEmployee(Three);
    }

    public static void showEmployee(Employee e) {
        System.out.print(e.getEmployeeName());
        System.out.printf(" %05d",e.getEmployeeID());
        System.out.print(" " + e.getEmployeeDepartment() + " " +  e.getEmployeePosition());
        System.out.println();
    }
}