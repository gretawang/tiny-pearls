
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import space.gretawang.tp.springdemo.springinaction.chapter02.autoconfig.CDPlayerConfig;
import space.gretawang.tp.springdemo.springinaction.chapter02.autoconfig.CompactDisc;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

    /**
     * @Autowired自动装配注解
     * 为声明自动装配合适的类, 自动装配就是spring满足bean依赖的一种方式
     *
     * 这个注解可以放在成员变量, setter方法以及构造方法上.实际上setter方法没有任何特殊之处,
     * @AutoWired这个注解可以放在任何方法上
     *
     * 如果只有一个bean满足匹配需求的话,spring就会把这个bean装配起来.
     * 如果没有合适的bean,spring就会报错,你可以加一个把required设置成false来避免异常
     * @Autowired(required = false)
     *
     * 如果有多个可以装配的bean的话,spring也会报出异常,让你选择应该装配哪个bean
     * @AutoWried是Spring特有的注解,在java中还有一个可以替代的注解叫@Inject,功能相似,只有很小的区别
     *
     */
    @Autowired(required = false)
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull() {
        assert(compactDisc != null);
    }
}
