package Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public ArrayList<Student>  s = new ArrayList<>();
    void addStudentRecords(){
        s.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        s.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        s.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        s.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        s.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        s.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        s.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        s.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        s.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        s.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        s.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        s.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        s.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        s.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        s.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        s.add(new Student(266, "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
        s.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }
    void printDepartmentNames(){
        System.out.println("Department Names");
        Stream<Student> studentStream = s.stream();
        studentStream.map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }
    void namesOfStudentsEnrolledAfter2018(){
        System.out.println("Names of all students who have enrolled after 2018");
        Stream<Student> studentStream = s.stream();
        studentStream.filter(s->s.getYearOfEnrollment()>2018).map(Student::getName).forEach(System.out::println);
    }

    void detailsOfMaleStudentsInCSDept(){
        System.out.println("Details of male Students of Computer Science Dept");
        Stream<Student> studentStream = s.stream();
        studentStream.filter(s->s.getEngDepartment().equals("Computer Science") && s.getGender().equals("Male")).forEach(System.out::println);
    }
    void countOfMaleFemaleStudents(){
        System.out.println("Count of Male & Female Students");
        Stream<Student> studentStream = s.stream();
        studentStream.collect(Collectors.groupingBy(Student::getGender,Collectors.counting())).forEach((gender,count)->System.out.println(gender+" : "+count));
    }
    void avgAgeOfMaleFemaleStudents(){
        System.out.println("average age of male and female student");
        Stream<Student> studentStream = s.stream();
        studentStream.collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)))
                .forEach((gender,avgAge)->System.out.println(gender+" : "+avgAge));
    }
    void printDetailsOfStudentHavingHighestPercentage(){
        System.out.println("details of highest student having highest percentage");
        Stream<Student> studentStream = s.stream();
        studentStream.max(Comparator.comparingDouble(Student::getPerTillDate)).ifPresent(System.out::println);

    }
    void studentCountInEachDept(){
        System.out.println("number of students in each department");
        Stream<Student> studentStream = s.stream();
        studentStream.collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())).forEach((dept,count)->System.out.println(dept+" : "+count));
    }
    void avgPercentageInEachDept(){
        System.out.println("Average Percentage in each department");
        Stream<Student> studentStream = s.stream();
        studentStream.collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))).forEach((dept,avgPer)->System.out.println(dept+" : "+avgPer));
    }
    void detailsOfYoungMaleStudentInElectronic(){
        System.out.println("Details of Young Male Student in Electronic department");
        Stream<Student> studentStream = s.stream();
        studentStream.filter(s->s.getGender().equals("Male")&&s.getEngDepartment().equals("Electronic")).min(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);
    }
    void countMaleFemaleInComputerScience(){
        System.out.println("Count of Male and Female Students in Computer Science Department");
        Stream<Student> studentStream = s.stream();
        studentStream.filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())).forEach((gender,count)->System.out.println(gender+" : "+count));
    }
    public static void main(String[] args) {
        Main object = new Main();
        object.addStudentRecords();
        object.printDepartmentNames();
        object.namesOfStudentsEnrolledAfter2018();
        object.detailsOfMaleStudentsInCSDept();
        object.countOfMaleFemaleStudents();
        object.avgAgeOfMaleFemaleStudents();
        object.printDetailsOfStudentHavingHighestPercentage();
        object.studentCountInEachDept();
        object.avgPercentageInEachDept();
        object.detailsOfYoungMaleStudentInElectronic();
        object.countMaleFemaleInComputerScience();
    }
}
