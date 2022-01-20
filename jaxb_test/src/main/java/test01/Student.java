package test01;

import javax.xml.bind.annotation.XmlAttribute;

public class Student extends PeopleInSchool{

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "stuNum")
    private int stuNum;

    public Student() {
    }

    public Student(String name, int stuNum) {
        this.name = name;
        this.stuNum = stuNum;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNum() {
//        return stuNum;
//    }
//
//    public void setNum(int stuNum) {
//        this.stuNum = stuNum;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + stuNum +
                '}';
    }

    @Override
    public void doSome() {
        System.out.println("Student doSome....");
    }
}
