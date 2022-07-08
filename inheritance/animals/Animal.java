package inheritance.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;
    String message = "Invalid input";

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(message);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s %d %s\n%s", this.getClass().getSimpleName(),
                name, age, gender, produceSound());
    }

    public String produceSound() {
        return "";
    }
}