import com.google.inject.Guice;
import com.google.inject.Injector;
import domain.TextEditor;
import implementation.SpellCheckerImp;

public class JuiceDemo {
    public static void main(String[] args) {
        //这里main方法就是简单的绑定接口和实现类
//        TextEditor textEditor = new TextEditor(new SpellCheckerImp());
        Injector injector = Guice.createInjector(new TextEditorModule());
        //把对象的创建都交给jnjector容器
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellChectker();


    }
}
