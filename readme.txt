(1) AIDL
1. 把 IHelloService.aidl, IGoodbyeService.aidl 放入 frameworks/base/core/java/android/os
2. 修改 frameworks/base/Android.mk  添加一行
         core/java/android/os/IVibratorService.aidl \
+        core/java/android/os/IHelloService.aidl \
+        core/java/android/os/IGoodbyeService.aidl \

3. mmm frameworks/base

4. 它会生成: 
./out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/src/core/java/android/os/IHelloService.java
./out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/src/core/java/android/os/IGoodbyeService.java

(2) 编译:
把程序放到 /work/android-5.0.2/frameworks/testing/APP_0005_Binder_JAVA_App
执行:

cd /work/android-5.0.2
. setenv
lunch // 选择单板

mmm frameworks/testing/APP_0005_Binder_JAVA_App
它会生成 TestServer.jar, TestClient.jar

复制文件到NFS目录
cp /work/android-5.0.2/out/target/product/tiny4412/system/framework/Test*.jar /work/nfs_root/android_fs/

(3) 测试:
logcat TestServer:* TestClient:* HelloService:* *:S &
CLASSPATH=/mnt/android_fs/TestServer.jar app_process / TestServer &
CLASSPATH=/mnt/android_fs/TestClient.jar app_process / TestClient hello
CLASSPATH=/mnt/android_fs/TestClient.jar app_process / TestClient hello 100ask.taobao.com
CLASSPATH=/mnt/android_fs/TestClient.jar app_process / TestClient goodbye
CLASSPATH=/mnt/android_fs/TestClient.jar app_process / TestClient goodbye weidongshan

