public class employee {
    String name;
    int id;
    double salary;
    int age;

    public employee(String name, int id, double salary, int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee  Name : " + name);
        System.out.println("Salary: $: " + salary);
        System.out.println("Age :" + age);
    }

    public static void main(String[] args) {
        employee emp1 = new employee("xyz", 101, 50000.0, 25);
        emp1.displayInfo();
    }
}
