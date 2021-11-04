package com.company;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = "Test";
        this.age = 3;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }
    void  setAge(int newAge){
        age = newAge;
    }
}

class Employee extends Person{
    private String name;
    private int age;
    private String company;
    public Employee(String name, int age, String company){
        super("Test", 3);
        this.name = "1";
        this.age = 2;
        this.company = "3";
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getCompany(){
        return company;
    }
    void setName(String newName){
        name = newName;
    }
    void  setAge(int newAge){
        age = newAge;
    }
     void setCompany(String newCompany){
        company = newCompany;
     }
}
/*class Employee extends Person{
    @Override
    public String className(){
        return
    }

}
class Bird extends Animal{
    @Override
    public String className(){
        return "Bird";
    }
 */