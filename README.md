# Web-Project-Generator #

定义基础的web项目骨架，使用maven-archetype一键生成项目。

## 集成 ##

- spring-web
- spring-aop
- quartz
- mybatis-plus
- hutool
- lombok
- .....

## deps包 ##

deps是模版的父pom,集中了所有的集成依赖并添加了常用的开箱即用的封装类

- common包：待补充，目前是空包
- db包：待补充，只依赖了mysql驱动和mybatisPlus
- web包：包含大多数集成依赖。并添加了统一返回值封装类Res,VO&DTO&Req的基于Pojo的转化封装类。封装异常枚举类。


## 安装&使用 ##

### IDEA模版生成 ###

- clone本项目到本地
- 执行 maven clean install
- 打开IDEA-new projects-maven-from archetype
- 添加archetype 

    - groupId: com.lowdad.dev
    - artifactId: generator
    - version: 1.0-SNAPSHOT
    
- 下一步直接生成项目

### CLI生成 ###

- 执行 ./install.sh
- 按提示添加环境变量
- 在需要的目录下执行 lowg.sh
- 按需要填写package&projectName


### 使用 ###

- 启动server包中AppApplication
- 访问http://localhost:8080/print
- 使用生成db包resource目录下的sql生成测试库
- 访问http://localhost:8080/hello&http://localhost:8080/hellos获取数据库单条和分页效果
