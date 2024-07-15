package ku.cs.services;

import ku.cs.models.Student;

public class StudentDataSource {
    public Student readDatum() {
        Student std = new Student("6610402060", "ธนกฤต ตระการจันทร์", "เปอร์");

        return std;
    }
}
