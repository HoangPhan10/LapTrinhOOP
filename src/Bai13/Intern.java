package Bai13;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee{
    private String majors;
    private int semester;
    private String university_name;

    public Intern() {
    }

    public Intern(long id, String fullName, LocalDate birthDay, String phone, String email, int employee_type, int employee_count, List<Certificate> certificateList, String majors, int semester, String university_name) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificateList);
        this.majors = majors;
        this.semester = semester;
        this.university_name = university_name;
    }

    public void showMe(){
        super.showInfo();
        System.out.println("Majors : "+majors);
        System.out.println("Semester : "+semester);
        System.out.println("University_name : "+university_name);
    }
}
