import java.util.*;
class Employee {
    int id;
    String name;
    long mobileno;
 void insert(int id, String name, long mobileno) {
        this.id = id;
        this.name = name;
        this.mobileno = mobileno;
    }
}
class Main {
    public static void main(String args[]) {
        int size = 2;
        Employee[] employees = new Employee[size];
Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            employees[i] = new Employee();
            //id validation
            int id;
            int count = 0; // To track validation errors
            while (true) {
              System.out.println("enter id");
                id = sc.nextInt();
                if (id <=999 && id >=9999) {
                    System.out.println("Employee id must contain 4 digits");
                    count++;
                } else {
                    boolean isUnique = true;
                    for (int j = 0; j < i; j++) {
                        if (employees[j].id == id) {
                            System.out.println("Employee id must be unique");
                            isUnique = false;
                            count++;
                            break;
                        }
                    }
                  if (isUnique) {
                        break;
                    }
                }
            }
// Name validation
            String name;
            while (true) {
                System.out.println("Enter employee name");
                name = sc.next();
                if (name.length() >= 4 && name.length() <= 40) {
                    System.out.println("Name is valid");
                    break;
                } else {
                    System.out.println("Enter a valid name (between 4 and 40 characters)");
                }
            }
          long mobile;
            while(true)
            {
                 System.out.println("Enter mobile number");
            mobile = sc.nextLong();
            //mobile number validation
            String phno=Long.toString(mobile);
            if((phno.length()==10) && ( phno.startsWith("9") || phno.startsWith("8") || phno.startsWith("7") || phno.startsWith("6")))
            {
                 System.out.println("phoneno is valid");
                    break;
            }
            else
            {
              System.out.println("enter valid mobilenumber");  
            }
        }
          employees[i].insert(id, name, mobile);
        }
      System.out.println("Displaying details");
        for (Employee emp : employees) {
            System.out.println(emp.id + " " + emp.name + " " + emp.mobileno);
        }
 }
}