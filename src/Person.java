public class Person {

    private String name;
    private int age;
    private Address address;
    private Gender genderEnum;

    public Person(String name, int age, Address address, Gender genderEnum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.genderEnum = genderEnum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Gender getGenderEnum() {
        return genderEnum;
    }

    public String getInfo(){
        return "name:" + name +
                "\n age:" + age +
                "\n address:" + address.getAddress()+
                "\n postcode:" + address.getPostcode() +
                "\n gender:" + getGenderEnum();
    }
}

