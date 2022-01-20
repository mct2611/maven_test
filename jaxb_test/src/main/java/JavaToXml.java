import test01.PeopleInSchool;
import test01.PeopleInSchoolList;
import test01.Student;
import test01.Teacher;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaToXml {

    public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        return writer.toString();
    }

    public static void main(String[] args) throws JAXBException, IOException {

        List<PeopleInSchool> peoples = new ArrayList<>();

        Student stu = new Student("zhangsan", 1);
        Teacher teacher = new Teacher("lilaoshi", 233);

        peoples.add(stu);
        peoples.add(teacher);

//        PeopleInSchoolList peopleList = new PeopleInSchoolList();
//        peopleList.setPeoples(peoples);
//        String str = beanToXml(peopleList, PeopleInSchoolList.class);

        //写到xml文件中
//        String xmlPath = "testConfig_peopleInSchool.xml";
//        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
//        bfw.write(str);
//        bfw.flush();
//        bfw.close();
    }
}
