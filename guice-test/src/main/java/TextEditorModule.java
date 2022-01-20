import annotation.*;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import contract.Assertor;
import contract.SampleProvider;
import contract.SpellChecker;
import implementation.*;

import static annotation.Provider.JUnit;
import static annotation.Provider.TestNG;


public class  TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        //在configure方法里进行接口和实现类的绑定 配置绑定信息
        bind(SpellChecker.class).to(SpellCheckerImp.class);
//        bind(SpellCheckerImp.class).to(WinWordSpellCheckerImp.class);

        //多实现绑定 通过注解同时分别绑定 调用的地方使用@注解区分
//        bind(Assertor.class).annotatedWith(UseJUnit.class).to(JUnitAssertor.class);
//        bind(Assertor.class).annotatedWith(UseTestNG.class).to(TestNGAssertor.class);

        //第二种 通过@Named绑定  调用的地方用@Named("JUnit")绑定
//        bind(Assertor.class).annotatedWith(Names.named("JUnit")).to(JUnitAssertor.class);
//        bind(Assertor.class).annotatedWith(Names.named("TestNG")).to(TestNGAssertor.class);

        //第三种 通过自定义的注解和枚举 模仿Names.named方法
        bind(Assertor.class).annotatedWith(AssertProviders.assertProvider(JUnit)).to(JUnitAssertor.class);
        bind(Assertor.class).annotatedWith(AssertProviders.assertProvider(TestNG)).to(JUnitAssertor.class);

        //Provides Class 实现Provider(juice自带的)接口将方法移动到类中 在类中get方法重写实现 不在module中写 更美观
        bind(SampleProvider.class).toProvider(SampleClassProvider.class);

    }

//    @Provides
//    public SampleProvider provideSampleProvider() {
//        String dburl = "jdbc//emp";
//        String user = "user";
//        SampleProvider sampleProvider = new SampleProviderImp(dburl, user);
//        return  sampleProvider;
//    }
//
//    @Provides @DbAction
//    public SampleProvider provideSampleProvider(String dburl, String user) {
//        SampleProvider sampleProvider = new SampleProviderImp(dburl, user);
//        return  sampleProvider;
//    }
}
