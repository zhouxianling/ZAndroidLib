# ZAndroidLib
android开发库，里面将会包含常用的View，常用的工具类等等


## 库引入
1. 先在 build.gradle(Project:XXXX) 的 repositories 添加

        allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
  
 2. 然后在 build.gradle(Module:app) 的 dependencies 添加
  
          dependencies {
                compile 'com.github.zhouxianling:ZAndroidLib:v1.0'
        }
  
  ## 介绍
  ### 在使用之前你必须先初始化
  
       
        public class App extends Application {
            @Override
            public void onCreate() {
                super.onCreate();
                //使用工具类必须先初始化
                LTool.init(this);
        
            }
        }
   
   ### 自定义View介绍
   1. LTitleBarView通用标题
     
  
   
   