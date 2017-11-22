### 2.3 通过java代码装配Bean
有些时候是没有办法直接在类上添加@Component注解的,比如说你使用的是第三方提供的库,这个时候就不能使用

spring的自动装配功能了.需要通过java 代码装配Bean

显示装配Bean有两种方式,一种是XML,另外一种是Java config