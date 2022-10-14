package JavaClass16;

public class Task1Tester {

    public static void main(String[] args) {
        SyntaxEmployee asgharEmployee= new SyntaxEmployee();
        asgharEmployee.empId="123";
        asgharEmployee.salary=10000;

        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee moazzamEmp=new SyntaxEmployee();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);


    }
}
