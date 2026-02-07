class Person {
    void showPerson() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a Manager");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}
