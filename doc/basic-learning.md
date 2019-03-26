## 学习点

### 后台
 #### 1. 基础知识 :
在进行我们项目开发的之前需要掌握的一些后台开发所需的基础，在此基础上来使用相应的开发框架来进行业务逻辑的开发，能够达到较好的学习效果，所以大家针对于如下基础先做一个了解
* java 基础
  *  基本语法
  * 基本命令 java/javac
* java 常用工具包
  * java.util.*
  * Aapche commons 系列，其中有很多好用的封装(选看)
* maven 基础
  * pom.xml 写法，涉及到依赖配置，基础属性配置，编译打包配置等
  * mvn 常用命令
* RDBMS 基本
  * SQL 基本语法：mybatis 复杂查询照样得写 SQL
  * JDBC 基础知识： 顺便了解下 alibaba druid 数据库连接池
* web 与 http 基础知识
  * json
  * http
 #### 2. spring boot
spring 的使用要先了解 Spring 的设计思想，Spring 两大核心 IOC 和 AOP 要理解其基本概念，通过什么原理实现，达到了什么效果，项目中时怎么用的。了解什么是 Bean，Bean 的装配流程等。Spring boot 帮我们干了什么事情可以让他达到开箱即用的能力

* 常用注解
	* @Configuration
	* @Bean
	* @ComponentScan
	* @Component/@Repository/@Service
	* @Controller/@RestController
	* @RequestMapping
	* @Autowired/@Qualifier/@Resource
	* @Value
* 上手练习 https://start.spring.io/ 
  在 start.spring.io 上创建 demo 项目，熟悉项目结构，写简单的 API 尝试下
* Spring boot 操作 redis/mongo/mybatis 等学习
 #### 3. lombok
  IDEA 安装此插件，便于提高开发效率
 #### 4.swagger
  用于直接根据接口生成 API 操作服务，便于接口对接和接口测试
### 前端
  了解 iview-admin,vue-element-admin 里面有好多我们直接用的组件，包括 excle 上传，异步数据更新，多层级目录树等