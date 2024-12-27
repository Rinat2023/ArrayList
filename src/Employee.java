public class Employee {
    private String name;
    private int age;
    private String job;


    public Employee(String name, int age, String job) {
        try {
            this.name = name;
            this.job = job;
            if (age < 0) {
                throw new MyException("vy vveli otricatelnoe chislo");
            } else {
                this.age = age;
            }

        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
