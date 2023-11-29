package map.ex.fourthExFilterAndMap;

public class User {
    private final String name;

    private final int age;

    private final double salary;

    public User(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public User decreaseSalary(final Double sumToDecrease) {
        return new User(this.name, this.age, this.salary - sumToDecrease);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}