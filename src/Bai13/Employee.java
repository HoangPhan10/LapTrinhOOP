package Bai13;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private long id;
    private String fullName;
    private LocalDate birthDay;
    private String phone;
    private String email;
    private int employee_type;
    private int employee_count;
    private List<Certificate> certificateList;

    public Employee() {

    }

    public Employee(long  id,String fullName, LocalDate birthDay, String phone, String email, int employee_type,int employee_count,List<Certificate> certificateList ) {
        this.id=id;
        this.employee_count=employee_count;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.certificateList = certificateList;
    }


    public void showInfo(){
        System.out.println("ID : "+id);
        System.out.println("FullName : "+fullName);
        System.out.println("BirthDay : "+birthDay);
        System.out.println("Phone : "+phone);
        System.out.println("Email : "+email);
        System.out.println("Employee_Type : "+employee_type);
        System.out.println("Employee_Count : "+employee_count);
    }
}
