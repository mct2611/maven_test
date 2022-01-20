package juice_test.test02;

import com.google.inject.Module;
import org.testng.IModuleFactory;
import org.testng.ITestContext;

public class ModuleFactory implements IModuleFactory {

    ISingleton m_singleton = new ISingleton();

    @Override
    public Module createModule(ITestContext context, Class<?> testClass) {
        return new GuiceExampleModule(m_singleton);
    }
}
