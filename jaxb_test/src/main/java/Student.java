import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Student {
    String name;
    String sex;
    int number;
    String className;
    List<String> hobby;

    public Student() {
    }

    public Student(String name, String sex, int number, String className, List<String> hobby) {
        this.name = name;
        this.sex = sex;
        this.number = number;
        this.className = className;
        this.hobby = hobby;
    }

//    @XmlElement(name="name")
    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name="sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @XmlAttribute(name="number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @XmlAttribute(name="className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

//    @XmlElementWrapper(name="hobbys")
    @XmlAttribute(name="hobby")
    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", number=" + number +
                ", className='" + className + '\'' +
                ", hobby=" + hobby +
                '}';
    }
}
