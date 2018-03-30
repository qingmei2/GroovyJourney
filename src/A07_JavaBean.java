public class A07_JavaBean {

    private String name;
    private final int age;

    public A07_JavaBean(String name, String address, int age) {
        this.name = name;
        this.age = age;
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
}
