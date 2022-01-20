package test01;

import javax.xml.bind.annotation.XmlAttribute;

public class Teacher extends PeopleInSchool{

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "teachNum")
    private int teachNum;

    public Teacher() {
    }

    public Teacher(String name, int teachNum) {
        this.name = name;
        this.teachNum = teachNum;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getTeachNum() {
//        return teachNum;
//    }
//
//    public void setTeachNum(int teachNum) {
//        this.teachNum = teachNum;
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teachNum=" + teachNum +
                '}';
    }

    @Override
    public void doSome() {
        System.out.println("Teacher doSome....");
    }
}
