import com.google.inject.Provider;
import contract.SampleProvider;
import implementation.SampleProviderImp;

public class SampleClassProvider implements Provider<SampleProvider> {
    @Override
    public SampleProvider get() {
        String dburl = "jdbc//emp";
        String user = "user";
        SampleProvider sampleProvider = new SampleProviderImp(dburl, user);
        return  sampleProvider;
    }
}
