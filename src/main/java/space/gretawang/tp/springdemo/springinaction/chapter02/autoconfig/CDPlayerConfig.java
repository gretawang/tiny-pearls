package space.gretawang.tp.springdemo.springinaction.chapter02.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring 的组件扫描默认是不启动的,需要配置一下spring
 * 从而命令它去寻找带有@ComponentScan注解的类,并为其创建Bean
 * 如果没有其他配置的话,spring会默认扫描配置类所在的包
 *
 * 1. 如何配置扫描不同的包?
 * 在value属性中指定包名,下面的这两种方式都是可以的
 * @ComponentScan("testpackage")
 * @ComponentScan(basePackages = "testpackage")
 *
 * 2. 如何指定扫描多个包
 * @ComponentScan(basePackages = {"testPackage1", "testPackage2"})
 *
 * 3.另外一种指定的方式
 * 将其指定为包中包含的类或者接口,这种指定的方式的好处是类型安全,如果改了类名可以直接找到
 *
 * @ComponentScan(basePackageClasses = {CDPlayer.class, DVDPlayer.class})
 *
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
