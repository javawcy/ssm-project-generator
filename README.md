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
