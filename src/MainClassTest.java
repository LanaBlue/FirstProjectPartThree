import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        Assert.assertTrue("В методе нет искомого слова - hello", (getClassString().contains("Hello")) || (getClassString().contains("hello")));
    }

}
