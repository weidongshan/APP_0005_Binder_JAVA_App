(1) AIDL
1. 把 IHelloService.aidl 放入 frameworks/base/core/java/android/os
2. 修改 frameworks/base/Android.mk  添加一行
         core/java/android/os/IVibratorService.aidl \
+        core/java/android/os/IHelloService.aidl \

3. mmm frameworks/base

4. 它会生成: ./out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/src/core/java/android/os/IHelloService.java
