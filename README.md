# StarterDemo

### 环境
`JDK17+` `SpringBoot 2.7`

### 使用

在你使用之前，需要安装 [pnx-spring-boot-starter](https://github.com/WanneSimon) 到你本地仓库，因为还没上传。

```shell
mvn clean package

cd target

java -jar  pnx-starter-demo-1.0-SNAPSHOT.jar
```

### 注意
  1. （重要）日志文件配置(`log4j2-spring.xml`)，根据需要自行配置。所有的日志输出已经被修改， server.log 不会再保存任何信息。此外， `nukkit` 的颜色代码也不会生效。
  2. （可选）启动类继承 `NukkitApplicationLauncher` 类。
  3. （重要）请勿在 `nukkit` 启动完成前获取 `nukkit` 内部的对象（不会真有人这么干吧）。
