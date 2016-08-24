# Copyright 2008 The Android Open Source Project
#
LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := HelloService.java IHelloService.java GoodbyeService.java IGoodbyeService.java TestServer.java
LOCAL_MODULE := TestServer
include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := HelloService.java IHelloService.java GoodbyeService.java IGoodbyeService.java TestClient.java
LOCAL_MODULE := TestClient
include $(BUILD_JAVA_LIBRARY)

