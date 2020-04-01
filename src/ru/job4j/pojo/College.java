package ru.job4j.pojo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setCourse("Informatics");
        String birth = "12/12/1990";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = simpleDateFormat.parse(birth);
        student.setBirthDay(date);
        System.out.println("Student: " + student.getFullName() + " born in " + student.getBirthDay() + " is studying on the course - " + student.getCourse() + ".");
    }
}
