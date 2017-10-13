# ZAndroidLib
android开发库，里面将会包含常用的View，常用的工具类等等


## 库引入
先在 build.gradle(Project:XXXX) 的 repositories 添加

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  然后在 build.gradle(Module:app) 的 dependencies 添加
  
      dependencies {
	        compile 'com.github.zhouxianling:ZAndroidLib:v1.0'
	}
  
  
