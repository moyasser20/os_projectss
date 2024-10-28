import org.junit.Before;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;


public class CLITest {
    private  CLI cli;

    @BeforeEach
    public void setUp()
    {
        cli = new CLI();
    }

    @Test
    public void testPwd()
    {
        assertEquals(System.getProperty("user.dir"), cli.pwd());
    }

}
