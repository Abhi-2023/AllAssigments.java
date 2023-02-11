
class demo{
private int age ;
private String name ;
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public void show(){
    System.out.println(name + " " + age);
}
}
public class Encapsulation {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.setAge(25);
        obj.setName("Abhishek");
        obj.show();
       int age =  obj.getAge();
        System.out.println(age);
        String name = obj.getName();
        System.out.println(name);
    }
}
