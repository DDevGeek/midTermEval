
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
    void printJobDescription();
    void printPeople();
    void addPerson(Person person);
    void removePerson(Person person);
    void executeJob(Person person);
}

abstract class SchoolWorker implements SchoolPeople {
    private String salary;
    private String role;

    @Override
    public void printJobDescription() {
        System.out.println("persons");
    }

    @Override
    public void printPeople() {
        System.out.println("List");
    }

    @Override
    public void addPerson(Person person) {
        System.out.println("add");
    }

    @Override
    public void removePerson(Person person) {
        System.out.println("remove");
    }
}

class SchoolTeachers extends SchoolWorker {
    private final List<Person> schoolTeacherList = new ArrayList<>();

    @Override
    public void printPeople() {
        System.out.println("========= SCHOOL TEACHERS 🧑‍🏫========");
        System.out.println();
        for (Person teacher : schoolTeacherList) {
            System.out.println("ID: " + teacher.getID());
            System.out.println("Name: " + teacher.getName());
            System.out.println("Age: " + teacher.getAge());
            System.out.println("Phone number: " + teacher.getPhoneNumber());
            System.out.println("Location: " + teacher.getNationality());
            System.out.println("Email: " + teacher.getEmailAddress());
            System.out.println("=======");
            System.out.println();
        }
    }

    @Override
    public void addPerson(Person person) {
        schoolTeacherList.add(person);
    }

    @Override
    public void removePerson (Person person) {
        for (Person teacher : schoolTeacherList) {
            if (teacher.getName().equals(person.getName()) && teacher.getID() == person.getID()) {
                schoolTeacherList.remove(person);
                System.out.println(person.getName() + " was removed successfully 😃");
            }else {
                System.out.println(person.getName() + " does not exist in the database ⚠️");
            }
        }
    }

    @Override
    public void printJobDescription() {
        System.out.println("School teacher teaches students at school");
    }

    @Override
    public void executeJob(Person person) {
        System.out.println(person.getName() + " is teaching students in class 👨‍🏫");
    }
}

abstract class SchoolStudent implements SchoolPeople {
    private final List<Person> studentList = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        studentList.add(person);
    }

    @Override
    public void removePerson(Person person) {
        for (Person student : studentList) {
            if (student.getName().equals(person.getName()) && student.getID() == person.getID()) {
                studentList.remove(person);
                System.out.println(person.getName() + " was removed successfully 😃");
            }else {
                System.out.println(person.getName() + " does not exist in the database ⚠️");
            }
        }
    }

    @Override
    public void printPeople() {
        System.out.println("========= STUDENTS 👩‍🎓 ========");
        System.out.println();
        for (Person student : studentList) {
            System.out.println("ID: " + student.getID());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Phone number: " + student.getPhoneNumber());
            System.out.println("Location: " + student.getNationality());
            System.out.println("Email: " + student.getEmailAddress());
            System.out.println("=======");
            System.out.println();
        }
    }
}


class FirstGradeStudents extends SchoolStudent {
    private final String role = "Student";

    @Override
    public void addPerson(Person person) {
        super.addPerson(person);
    }

    @Override
    public void removePerson(Person person) {
        super.removePerson(person);
    }

    @Override
    public void printPeople() {
        super.printPeople();
    }

    @Override
    public void executeJob(Person person) {
        System.out.println(person.getName() + " is " + " Studying in class 👨‍🎓");
    }

    @Override
    public void printJobDescription() {
        System.out.println("Study 24/7");
    }

}

class SchoolCleaners extends SchoolWorker {
    private final String role = "School cleanser";

    private final List<Person> schoolCleanersList = new ArrayList<>();

    @Override
    public void printPeople() {
        System.out.println("========= SCHOOL CLEANERS 🧹 ========");
        System.out.println();
        for (Person cleaner : schoolCleanersList) {
            System.out.println("ID: " + cleaner.getID());
            System.out.println("Name: " + cleaner.getName());
            System.out.println("Age: " + cleaner.getAge());
            System.out.println("Phone number: " + cleaner.getPhoneNumber());
            System.out.println("Location: " + cleaner.getNationality());
            System.out.println("Email: " + cleaner.getEmailAddress());
            System.out.println("=======");
            System.out.println();
        }
    }

    @Override
    public void addPerson(Person person) {
        schoolCleanersList.add(person);
    }

    @Override
    public void removePerson(Person person) {
        for (Person worker : schoolCleanersList) {
            if (worker.getName().equals(person.getName()) && worker.getID() == person.getID()) {
                schoolCleanersList.remove(person);
                System.out.println(person.getName() + " was removed successfully 😃");
            }else {
                System.out.println(person.getName() + " does not exist in the database ⚠️");
            }
        }
    }

    @Override
    public void printJobDescription() {
        System.out.println(this.role + " cleans the school");
    }

    @Override
    public void executeJob(Person person) {
        System.out.println(person.getName() + " is cleaning 🧹");
    }
}

public class Main {
    public static void main(String[] args) {
        FirstGradeStudents student = new FirstGradeStudents();
        SchoolCleaners cleaners = new SchoolCleaners();
        SchoolTeachers schoolWorker  = new SchoolTeachers();

        Person student1 = new Person("jack", "23", "ugandan", "0998787", "jack@j.com");
        Person student2 = new Person("julie", "24", "congo", "0998787", "julie@gmail.com");
        Person teacher1 = new Person("graig", "43", "uganda", "0998787", "graid@gmail.com");
        Person teacher2 = new Person("blues", "45", "uganda", "0998787", "blues@gmail.com");
        Person cleaner1 = new Person("jackson", "49", "uganda", "008788", "jackson@gmail.com");
        Person cleaner2 = new Person("jess", "76", "uganda", "998899", "jess@gmail.com");
        Person johnDoe = new Person("john Doe", "87", "unknown", "998899100-111", "johndoe@gmail.com");

        student.addPerson(student1);
        student.addPerson(student2);
        student.printPeople();
        student.executeJob(student1);
        student.removePerson(student1);

        // trying to remove a un registered person
        student.removePerson(johnDoe);
        System.out.println();

        schoolWorker.addPerson(teacher1);
        schoolWorker.addPerson(teacher2);
        schoolWorker.printPeople();
        schoolWorker.executeJob(teacher1);
        schoolWorker.removePerson(teacher1);

        // trying to remove a un registered person
        schoolWorker.removePerson(johnDoe);
        System.out.println();

        cleaners.addPerson(cleaner1);
        cleaners.addPerson(cleaner2);
        cleaners.printPeople();
        cleaners.executeJob(cleaner1);

        cleaners.removePerson(cleaner1);

        // trying to remove a un registered person
        cleaners.removePerson(johnDoe);
    }
}