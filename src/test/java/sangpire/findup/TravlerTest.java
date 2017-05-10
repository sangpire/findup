package sangpire.findup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TravlerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void lookupDir() throws Exception {
        File rootDir = new File("D:\\");
        Travler travler = new Travler();
        travler.visit(rootDir);
    }

}