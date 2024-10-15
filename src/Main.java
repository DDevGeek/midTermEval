import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

class Person {
    private String name, age, nationality, phoneNumber, emailAddress;
    private final double ID;

    public Person (String name, String age, String nationality, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.ID = Math.random() * 1000000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getID() {
        return this.ID;
    }
}

interface SchoolPeople {
    void printJobDescription(Person person);
    void printPeople();
    void addPerson(Person person);
    void removePerson(Person person);
    void executeJob();
}

abstract class SchoolWorker implements SchoolPeople {
    private String salary;

    @Override
    public void printJobDescription(Person person) {
        System.out.println("persons");
    }

    @Override
    public void printPeople() {
        System.out.println("printing people");
    }

    @Override
    public void addPerson(Person person) {
        System.out.println("adding persons");
    }

    @Override
    public void removePerson(Person person) {
        System.out.println("removing person");
    }

    @Override
    public void executeJob() {
        System.out.println("executing job");
    }
}



class SchoolTeachers extends SchoolWorker {

}

abstract class SchoolStudent implements SchoolPeople {
    List<Person> studentList = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        studentList.add(person);
        System.out.println(person.getName() + " Was Added successfully");
    }

    @Override
    public void removePerson(Person person) {
        for (Person person1 : studentList) {
            if (person1.getName().equals(person1.getName())) {
                studentList.remove(person);
                System.out.println(person.getName() + " was removed successfully");
            }else {
                System.out.println(person.getName() + " does not exist in the database");
            }
        }
    }

    @Override
    public void printPeople() {
        System.out.println("========= STUDENTS ========");
        System.out.println();
        for (Person student : studentList) {
            System.out.println("Name" + student.getName());
            System.out.println("Age" + student.getAge());
            System.out.println("Phone number" + student.getPhoneNumber());
            System.out.println("Location" + student.getNationality());
            System.out.println("Email" + student.getEmailAddress());
        }
    }
}



class FirstGradeStudents extends SchoolStudent {

    @Override
    public void printJobDescription(Person person) {
        System.out.println("persons");
    }

    @Override
    public void printPeople() {
        System.out.println("printing people");
    }

    @Override
    public void addPerson(Person person) {
        System.out.println("adding persons");
    }

    @Override
    public void removePerson(Person person) {
        System.out.println("removing person");
    }

    @Override
    public void executeJob() {
        System.out.println("executing job");
    }
}

class SchoolCleaners extends SchoolWorker {

}

public class Main {
    public static void main(String[] args) {
        FirstGradeStudents student = new FirstGradeStudents();
        SchoolWorker cleaners = new SchoolCleaners();
        SchoolWorker schoolWorker  = new SchoolTeachers();

        Person student1 = new Person("jack", "23", "ugandan", "0998787", "jack@j.com");
        Person student2 = new Person("julie", "24", "congo", "0998787", "julie@gmail.com");
        Person teacher1 = new Person("graig", "43", "uganda", "0998787", "graid@gmail.com");
        Person teacher2 = new Person("blues", "45", "uganda", "0998787", "blues@gmail.com");
        Person cleaner1 = new Person("jackson", "49", "uganda", "008788", "jackson@gmail.com");
        Person cleaner2 = new Person("jess", "76", "uganda", "998899", "jess@gmail.com");
        student.addPerson(student1);
        student.addPerson(student2);
        schoolWorker.addPerson(teacher1);
        schoolWorker.addPerson(teacher2);
        cleaners.addPerson(cleaner1);
        cleaners.addPerson(cleaner2);


    }
}