package DemoSpringBoot.test.Managers;

import DemoSpringBoot.test.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManger {

   private List<Student> students ;

   public StudentManger(){
       this.students = new ArrayList<>();
   }

   public void addStudent(Long id, String name){
       Student student = new Student(id, name);
       this.students.add(student);
   }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student getStudentById(Long id){
       for (Student student : students){
           if (student.getId() == id){
               System.out.println("Student against the ID "+id+" is::  "+student);
           }
           return student;
       }
        System.out.println("not found");
        return null;
    }

    public static void main(String[] args) {
        StudentManger manger =new StudentManger();

            manger.addStudent(1L,"ALI");
            manger.addStudent(2L,"AKRAM");
            manger.addStudent(3L,"GHANI");

            List<Student> studentList = manger.getAllStudents();
            for (Student student : studentList){
                System.out.println(student);
            }

      manger.getStudentById(1L);
    }

}
