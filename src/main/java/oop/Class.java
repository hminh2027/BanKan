package oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Class {
    private String id;
    private String roomId;
    private Teacher teacher;
    @Builder.Default
    private List<Student> studentList = new ArrayList<>();
    private Date endDate;
    private Date startDate;

    public boolean addStudent(Student student) {
        return studentList.add(student);
    }
}
