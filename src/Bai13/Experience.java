package Bai13;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(long id, String fullName, LocalDate birthDay, String phone, String email, int employee_type, int employee_count, List<Certificate> certificateList, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count, certificateList);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public void showMe(){
        super.showInfo();
        System.out.println("ExpInYear : "+expInYear);
        System.out.println("ProSkill : "+proSkill);

    }
}
