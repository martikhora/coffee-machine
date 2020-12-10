import java.util.*;
class Employee {

    private String name;
    private int age;
    private String education;
    private int experience;
    private String cuisine;

    public Employee() {
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}

class Main {
    public static void main(String[] args) {

        printOffer(createEmployee());

    }

    public static Employee createEmployee() {

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        employee.setName(scanner.next());
        employee.setAge(Integer.parseInt(scanner.next()));
        employee.setEducation(scanner.next());
        employee.setExperience(Integer.parseInt(scanner.next()));
        employee.setCuisine(scanner.next());

        return employee;
    }

    public static void printOffer(Employee employee) {
        System.out.println("The form for " + employee.getName() +
                " is completed. We will contact you if we need a chef that cooks " + employee.getCuisine() +
                " dishes.");
    }
}


