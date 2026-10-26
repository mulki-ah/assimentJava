package ASSIMENT;


class Employee {
    protected String employeeID;
    protected String empName;
    protected String department;
 protected double basicSalary;

    ///  constructor //
    public Employee(String employeeID, String empName, String department, double basicSalary) {
        this.employeeID = employeeID;
        this.empName = empName;
        this.department = department;
        this.basicSalary = basicSalary;

    }

    // Getter method//
    public double getBasicSalary() {
        return basicSalary;
    }

    //method//
    void CalculateSalary() {
    }

    void display() {
        System.out.println("Employee id" +employeeID);
        System.out.println("Employee name" +empName);
        System.out.println("category" + department);
    }
}


// Full-time Employee///

    class FulltimeEmployee extends Employee {
        protected double allowance;


/// /constr
        FulltimeEmployee(String  employeeID, String empName, String department, double basicSalary, double allowance) {

            super(employeeID, empName, department, basicSalary);
            this.allowance = allowance;

        }

        void CalculateSalary(){
            double salary = getBasicSalary() + allowance;
            System.out.println("Monthly Salary: " + salary);
        }

        @Override
        void display() {
            super.display();
            System.out.println("Category: Full-time Employee");
            System.out.println("Allowance: " + allowance);
            CalculateSalary();
        }
    }


 //// part-time//

class PartTime extends Employee{
    int hourwork;
    double hourRate;

    PartTime(String employeeId ,String Name ,String Category,double basicsalary,int hourwork,double hourRate){
        super(employeeId,Name,Category,basicsalary);
        this.hourwork=hourwork;
        this.hourRate=hourRate;
    }

    @Override
    void CalculateSalary()  {

        double salary = hourwork * hourRate;
        System.out.println("Monthly Salary: " + salary);
    }

     @Override void display() {
        super.display();
        System.out.println("Category: Part-time Employee");
        System.out.println("Hours Worked: " + hourwork);
        System.out.println("Hourly Rate: " + hourRate);
        CalculateSalary();
    }


}



  // manager//

      class Manger extends Employee{
          double bonus;

          Manger(String employeeId ,String Name ,String Category,double basicSalary,double bonus){
              super(employeeId,Name,Category,basicSalary);
              this.bonus=bonus;
          }


      @Override
      void CalculateSalary() {
          double salary = getBasicSalary() + bonus;
          System.out.println("Monthly Salary: " + salary);
      }

      @Override
      void display() {
          super.display();
          System.out.println("Category: Manager");
          System.out.println("Bonus: " + bonus);
          CalculateSalary();
      }

  }





public class EMP {
    static void main(){
        Employee[] Employee={
                new FulltimeEmployee("Emp 002","Ahmed","Full-time",39,8),
                new PartTime("EMP008","Hassan","part-time",200,24,12),
                new Manger("Emp009","Aisha","full-time",400,500)
        };
        System.out.println("===== EMPLOYEE SALARY REPORT =====");
        System.out.println();
        for (Employee e:Employee){
            e.display();
            System.out.println("--------------------");
        }

    }
}
