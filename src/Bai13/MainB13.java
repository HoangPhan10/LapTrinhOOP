package Bai13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainB13 {
    public static void main(String[] args) {
        List<Certificate> certificateList = new ArrayList<>();
        Certificate certificate = new Certificate(100,"Master Python","hard",LocalDate.of(2022,12,10));
        certificateList.add(certificate);
        Employee employee = new Employee(1000,"Phan", LocalDate.of(2002,12,10),"03391212121","phan@gmail.com",0,1,certificateList);
        employee.showInfo();
        Employee employee2 = new Employee(1001,"Phan",LocalDate.of(2002,2,10),"03391212121","phan@gmail.com",1,2,certificateList);
        employee2.showInfo();
        
    }
}
