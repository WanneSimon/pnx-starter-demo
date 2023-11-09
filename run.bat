cd target
set JAVA17="C:\Program Files\Java\jdk-17\bin\java.exe"
%JAVA17%  --add-opens java.base/java.lang=ALL-UNNAMED ^
-cp ./libs/*;./pnx-starter-demo-2.0-SNAPSHOT-exec.jar ^
org.springframework.boot.loader.JarLauncher
@rem %JAVA17%  --add-opens java.base/java.lang=ALL-UNNAMED ^
@rem -cp ./libs/*;./libs-app/*;./powernukkitx.jar;./pnx-starter-demo-1.0-SNAPSHOT-exec.jar ^
@rem org.springframework.boot.loader.JarLauncher
PAUSE