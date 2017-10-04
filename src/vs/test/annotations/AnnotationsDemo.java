package vs.test.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationsDemo {

    public static void main(String[] args) {
        Class<MyTestCase> myTestCaseClass = MyTestCase.class;

        Annotation[] annotations = myTestCaseClass.getAnnotations();

        Method[] declaredMethods = myTestCaseClass.getDeclaredMethods();

        System.out.println();
    }
}
