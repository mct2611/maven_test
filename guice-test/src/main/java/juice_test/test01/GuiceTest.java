package juice_test.test01;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = GuiceExampleModule.class)
public class GuiceTest {

    @Inject
    ISingleton m_singleton;

    @Test
    public void singletonShouldWork() {
        m_singleton.doSomething();
    }


}
