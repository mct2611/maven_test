package juice_test.test02;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import juice_test.test02.ISingleton;

public class GuiceExampleModule implements Module {

    private ISingleton m_singleton;

    public GuiceExampleModule(ISingleton m_singleton) {
        this.m_singleton = m_singleton;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(ISingleton.class).toInstance(m_singleton);
    }
}
