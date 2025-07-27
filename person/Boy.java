package person;

public class Boy extends Human{
    public Boy(String name, int age) {
        super(name, age, "Male");
        System.out.println(this.getName() + " : " + this.getAge() + " : " + this.getGender());
    }
    public void hello() {
        System.out.println("Hello, I am " + this.getName() + " and I am " + this.getAge() + " years old. And I am a " + this.getGender() + ".");
    }
}
