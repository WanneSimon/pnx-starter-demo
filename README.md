# StarterDemo
 wannukkit-springboot-starter 的一个使用demo，推荐使用 demo 搭建你自己的项目。

*****已更换成 wannukkit-springboot 搭建。原 pom.xml 更名为 pom-origin.xml *****



### 使用

​	在你使用之前，需要安装 wannukkit-spring-boot-starter 到你本地仓库，因为还没上传。

​	mvn clean package

​	cd target/thin/root

​	java -Dthin.root=. -jar  StarterDemo-1.0-SNAPSHOT.jar


### 注意
  1. （重要）日志文件配置，自行配置。所有的日志输出已经被修改， server.log 不会再保存任何信息。另外，颜色代码也不会生效。
  2. （非常重要）pom 文件，需要特别注意与项目相关的地方。顶部 - groupId、artifactId，底部 - mainClass 。
  3. （可选）启动类继承 NukkitApplicationLauncher 类。
  4. （不重要）日志的使用，可以参考主类 StarterDemo 类的用法。不过更推荐你使用 nukkit 的日志。
  5. （重要）非常不推荐在 nukkit 启动完成前获取 nukkit 内部的对象（不会真有人这么干吧）。
  6. （重要）不要在 power shell 中运行启动命令（java -Dthin.root=. -jar  StarterDemo-1.0-SNAPSHOT.jar）。
  7. （重要）必须设置 nukkit.spring.enable，否则无法启动
