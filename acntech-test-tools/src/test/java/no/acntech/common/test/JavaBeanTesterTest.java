package no.acntech.common.test;

import no.acntech.common.test.objects.ObjectType;
import org.junit.Test;

import java.beans.IntrospectionException;

public class JavaBeanTesterTest {

    @Test
    public void testUsingTestBean() throws IntrospectionException {
        JavaBeanTester.testClasses(ObjectType.class);
    }

    @Test
    public void testUsingTestBeanWithSkipParams() throws IntrospectionException {
        JavaBeanTester.testClass(ObjectType.class, "str", "int", "obj");
    }
}
