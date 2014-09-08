package ua.yandex.shad.iousage;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class MainTest {

    @Rule
    public TextFromStandardInputStream systemInMock
            = TextFromStandardInputStream.emptyStandardInputStream();
    @Rule
    public StandardOutputStreamLog systemOutMock = new StandardOutputStreamLog();

    @Test
    public void testReadWriteFromToStdInOut() throws Exception {
        systemInMock.provideText("1 2 3 4");
        Main.main(null);
        assertThat(systemOutMock.getLog(), is("10\n"));
    }
    
    @Test
    public void testMain() throws Exception {
        systemInMock.provideText("1 2 3 4");
        Main.main(null);
        assertThat(systemOutMock.getLog(), is("10\n"));
    }
}
