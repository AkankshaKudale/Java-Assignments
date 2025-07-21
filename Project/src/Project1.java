import java.util.*;
class Employee {
    int Emp_no;
    String Emp_Name;
    String Join_date;
    char Designation_code;
    String Department;
    int Basic;
    int HRA;
    int IT;

    Employee(int Emp_no, String Emp_Name, String Join_date, char desig, String dept, int basic, int hra, int it) {
        this.Emp_no = Emp_no;
        this.Emp_Name = Emp_Name;
        this.Join_date = Join_date;
        this.Designation_code = Designation_code;
        this.Department = dept;
        this.Basic = basic;
        this.HRA = hra;
        this.IT = it;
    }

}

public class Project1 {
    static int getDA(char code) {
        switch(code) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
            default: return 0;
        }
    }
    static String getDesignationName(char code) {
        switch(code) {
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
            default: return "Unknown";
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide employee ID as a command line argument.");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        // Employee array
        Employee[] employees = {
                new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
                new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
                new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
                new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
                new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
                new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
                new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        boolean found = false;

        for (Employee emp : employees) {
            if (emp.Emp_no == empId) {
                found = true;
                int da = getDA(emp.Designation_code);
                int salary = emp.Basic + emp.HRA + da - emp.IT;
                String designation = getDesignationName(emp.Designation_code);

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp.Emp_no + "\t" + emp.Emp_Name + "\t\t" +
                        emp.Department + "\t\t" + designation + "\t" + salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }

    }



