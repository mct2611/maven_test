package juice_test.test02;

import com.google.inject.Inject;
import juice_test.test02.GuiceExampleModule;
import juice_test.test02.ISingleton;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(moduleFactory = ModuleFactory.class)
public class GuiceTest {

    @Inject
    ISingleton m_singleton;

    @Test
    public void singletonShouldWork() {
        m_singleton.doSomething();
    }


}
