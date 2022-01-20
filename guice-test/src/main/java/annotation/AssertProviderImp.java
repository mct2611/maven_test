package annotation;

import java.lang.annotation.Annotation;

public class AssertProviderImp implements AssertProvider{
    private Provider value;

    public AssertProviderImp(Provider value) {
        this.value = value;
    }

    //形成一个值对象 值相同就表示一个对象 重写hashCode()方法、
    @Override
    public int hashCode() {
        return (127 * "value".hashCode()) ^ value.hashCode();  //源代码参考写法
    }

    @Override
    public String toString() {
        return "AssertProviderImp{" +
                "value=" + value +
                '}';
    }

    @Override
    public Provider value() {
        return this.value;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return AssertProvider.class;
    }
}
