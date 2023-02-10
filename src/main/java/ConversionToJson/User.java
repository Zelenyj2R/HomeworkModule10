package ConversionToJson;

public class User{
    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return result;
    }



    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", age='" + age + '\'' +
                '}';
    }

}

