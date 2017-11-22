package space.gretawang.tp.springdemo.springinaction.chapter02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * spring 的组件扫描默认是不启动的,需要配置一下spring
 * 从而命令它去寻找带有@ComponentScan注解的类,并为其创建Bean
 * 如果没有其他配置的话,spring会默认扫描配置类所在的包
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
