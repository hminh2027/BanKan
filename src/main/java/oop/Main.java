package oop;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Class javaClass = Class.builder()
                .id("java")
                .roomId("fv2")
                .teacher(new Teacher())
                .startDate(new Date())
                .endDate(new Date())
                .build();
//        Class javClass = new Class();
        System.out.println(javaClass.getStudentList());
    }
}
