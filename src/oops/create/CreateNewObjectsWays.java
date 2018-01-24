package oops.create;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateNewObjectsWays {

    public static void main(String[] args) {

        //1
        Test test1 = new Test();

        //2
        try {
            Class<?> aClass = Class.forName("oops.create.Test");
            try {
                Test test2 = (Test) aClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //3
        try {
            Test test3 = (Test) test1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Constructor<Test> declaredConstructor = null;
        try {
            declaredConstructor = Test.class.getDeclaredConstructor();
            try {
                Test test4 = declaredConstructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}


class Test implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}