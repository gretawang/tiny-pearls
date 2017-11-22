package space.gretawang.tp.threads;

public class Person {
    private String name;
    private int age;

    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean validateAge(int givenAge){
        boolean result = givenAge > 100;

        return result;
    }
}
