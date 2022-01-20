package annotation;

public class AssertProviders {
    public static AssertProvider assertProvider(Provider value) {
        return new AssertProviderImp(value);
    }
}
