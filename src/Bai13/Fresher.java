package Bai13;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
    private LocalDate graduation_date;
    private String graduation_rank;
    private String education;

    public Fresher() {
    }

    public Fresher(long id, String fullName, LocalDate birthDay, String phone, String email, int employee_type, int employee_count, List<Certificate> certificateList, LocalDate graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificateList);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public void showMe(){
        super.showInfo();
        System.out.println("Graduation_date : "+graduation_date);
        System.out.println("Graduation_rank : "+graduation_rank);
        System.out.println("Education : "+education);
    }
}
