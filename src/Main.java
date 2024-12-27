import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Marsel", 88, "js"));
//        students.add(new Student("Nurislam", 44, "js"));
//        students.add(new Student("Ibrohim", 66, "js"));
//        students.add(new Student("Rinat", 11, "java"));
//        students.add(new Student("Beka", 22, "java"));
//        students.add(new Student("Ainazik", 1, "java"));
//        students.add(new Student("Altynai", 99, "java"));
//        students.add(new Student("Amanat", 13, "js"));
//        students.add(new Student("Asan", 99, "js"));
//        students.add(new Student("Uson", 19999, "java"));
//
//        studentsdatas(students);
//
//        ArrayList<Student> Java = new ArrayList<>();
//        ArrayList<Student> JavaScript = new ArrayList<>();
//
//        filter(students, Java, JavaScript);
//
//        ArrayList<Student> ageFrom19to23 = new ArrayList<Student>();
//
//        ageFrom19to23Method(ageFrom19to23);
//
//        ArrayList<Student> StartNameWithA = new ArrayList<>();
//        StartNameWithAMethod(StartNameWithA);


        // 2
        try {
            Employee employee = new Employee("Anna", 14, "analitycs");
            Employee employee2 = new Employee("Sasha", 19, "programmer");
            Employee employee3 = new Employee(null, 0, null);
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(employee);
            employees.add(employee2);
            employees.add(employee3);

            for (Employee value : employees) {
                System.out.println(value.getName());
                System.out.println(value.getAge());
                System.out.println(value.getJob());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Бутту");
        }

    }


//    public static void studentsdatas(ArrayList<Student> students){
//        for (Student student: students){
//            System.out.println(student.getName());
//            System.out.println(student.getAge());
//            System.out.println(student.getGroup());
//        }
//    }
//    public static void filter(ArrayList<Student> students, ArrayList<Student> Java, ArrayList<Student> JavaScript){
//        for (Student student: students){
//            if (student.getGroup().equals("java")){
//                Java.add(student);
//            } else {
//                JavaScript.add(student);
//            }
//        }
//    }
//
//    public static void ageFrom19to23Method(ArrayList<Student> arr){
//        for (Student student: arr){
//            if (student.getAge() >= 19 && student.getAge() <=23) {
//                arr.add(student);
//            }
//        }
//    }
//    public static void StartNameWithAMethod(ArrayList<Student> arr){
//        for (Student student: arr){
//            if (student.getName().startsWith("A")) {
//                arr.add(student);
//            }
//        }
//    }
}