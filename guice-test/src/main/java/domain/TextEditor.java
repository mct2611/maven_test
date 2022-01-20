package domain;

import annotation.AssertProvider;
import annotation.Provider;
import annotation.UseJUnit;
import com.google.inject.Inject;
import contract.Assertor;
import contract.SampleProvider;
import contract.SpellChecker;

import javax.inject.Named;

import static annotation.Provider.JUnit;

public class  TextEditor {
    @Inject
    private SpellChecker spellChecker;
    private Assertor assertor;

//    @Inject
//    public TextEditor(
//            SpellChecker spellChecker,
            //通过注解 指名调用的是JUnit实现类
//            @UseJUnit Assertor assertor)
//            @Named("TestNG") Assertor assertor)
//            @AssertProvider(JUnit) Assertor assertor,
//            SampleProvider sampleProvider)
//    {
//        this.spellChecker = spellChecker;
//        this.assertor = assertor;
////        sampleProvider.someAction();
//    }

    public void makeSpellChectker() {
        spellChecker.checkSpelling();
//        assertor.equal(1,1);
    }
}
