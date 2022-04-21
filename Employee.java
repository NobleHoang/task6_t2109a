public class Employee {
        int id;
        String firstName;
        String lastName;
        int salary;
        public int getID() {
            return id;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public String getName(){
            return firstName+lastName;
        }
        public int getSalary(){
            return salary;
        }
        public void setSalary(int salary){
            this.salary=salary;
        }
        public int getAnnualSalary(){
            return salary*12;
        }
        public int raiseSalary(int percent){
            raiseSalary(80);
            return raiseSalary(80);
        }
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.id=2109027;
            emp.firstName="Hoang";
            emp.lastName="Hieu";
            emp.salary=60;
            emp.getName();
            System.out.println("ID: "+emp.id);
            System.out.println("FistName: "+emp.firstName);
            System.out.println("LastName: "+emp.lastName);
            System.out.println("Salary: "+emp.salary);
            System.out.println("Name: "+emp.getName());
            System.out.println("AnnualSalary: "+emp.getAnnualSalary());
    }
}
