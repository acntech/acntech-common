package no.acntech.common.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testExceptionUsingNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);

        ExceptionTester.testException(null);
    }

    @Test
    public void testExceptionsUsingNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);

        ExceptionTester.testExceptions(null);
    }

    @Test
    public void testExceptions() throws Exception {
        ExceptionTester.testExceptions(TestException.class);
    }

    @Test
    public void testClassloaderNullException() throws Exception {
        ExceptionTester.testExceptionWithArgs(ClassloaderNullException.class, Thread.currentThread());
    }

    @Test
    public void testNoSuchConstructorException() throws Exception {
        ExceptionTester.testExceptionWithArgs(NoSuchConstructorException.class, this.getClass());
    }
}
