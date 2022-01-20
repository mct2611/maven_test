import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.io.File;
import java.util.List;

public class XmlToBean {

//    @XmlElements ({@XmlElement(name = "student", type = StudentList.class)})

    public static Object xmlToBean(String xmlPath, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }

    public static void main(String[] args) throws JAXBException {
        String xmlPath = "testConfig.xml";
        Object object = XmlToBean.xmlToBean(xmlPath, StudentList.class);
        StudentList students = (StudentList) object;
        List<Student> studentList = students.getStudents();

        System.out.println(studentList);
    }
}
