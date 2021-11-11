package JPAwithHibernate.LabBook.Lab1;
import org.junit.Test;

import akshay.jpa.hibernate.labs.Library;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        LibraryTest classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}