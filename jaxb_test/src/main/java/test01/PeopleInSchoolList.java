package test01;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.List;

@XmlRootElement(name="list")
public class PeopleInSchoolList {

    @XmlElements({ @XmlElement(name = "student", type = Student.class),
                    @XmlElement(name = "teacher", type = Teacher.class)})
    private List<PeopleInSchool> peoples;

    public PeopleInSchoolList() {
    }

    public PeopleInSchoolList(List<PeopleInSchool> peoples) {
        this.peoples = peoples;
    }

//    public List<PeopleInSchool> getPeoples() {
//        return peoples;
//    }
//
//    public void setPeoples(List<PeopleInSchool> peoples) {
//        this.peoples = peoples;
//    }

    @Override
    public String toString() {
        return "PeopleInSchoolList{" +
                "peoples=" + peoples +
                '}';
    }

    public static Object xmlToBean(String xmlPath, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }

    public static void main(String[] args) throws JAXBException {
        String xmlPath = "testConfig_peopleInSchool.xml";
        Object object = xmlToBean(xmlPath, PeopleInSchoolList.class);
        PeopleInSchoolList peoples = (PeopleInSchoolList) object;
        List<PeopleInSchool> peopleInschool = peoples.peoples;

        System.out.println(peopleInschool);

        for (PeopleInSchool people: peopleInschool) {
            System.out.println(people.hashCode());
        }
    }
}
