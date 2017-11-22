
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.gretawang.tp.springdemo.springinaction.chapter02.CDPlayerConfig;
import space.gretawang.tp.springdemo.springinaction.chapter02.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        assert(compactDisc != null);
    }
}
