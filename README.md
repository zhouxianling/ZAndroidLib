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
                compile 'com.github.zhouxianling:ZAndroidLib:v1.2'
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
   
 
 ## LTitleBarView通用标题
 
 ### 1. 效果
 
 ![ScreenShot](./img/title.png) 
 
 ### 2. xml使用
        <com.zxl.zlibrary.view.LTitleBarView
                android:id="@+id/titleBar2"
                android:layout_width="match_parent"
                android:layout_height="48dp"
                android:layout_marginTop="10dp"
                android:background="@color/text_gray"
                app:leftText="返回"
                app:leftTextVisibility="true"
                app:rightIconVisibility="true"
                app:rightText="设置"
                app:rightTextVisibility="true"
                app:title="通用标题" />
 
 ### e. 属性
        <declare-styleable name="LTitleBarView">
                <attr name="title" format="string" />
                <attr name="titleColor" format="color" />
                <attr name="titleSize" format="dimension" />
                <attr name="titleVisibility" format="boolean" />
                <attr name="leftText" format="string" />
                <attr name="leftTextColor" format="color" />
                <attr name="leftTextSize" format="dimension" />
                <attr name="leftTextVisibility" format="boolean" />
                <attr name="rightText" format="string" />
                <attr name="rightTextColor" format="color" />
                <attr name="rightTextSize" format="dimension" />
                <attr name="rightTextVisibility" format="boolean" />
                <attr name="leftIcon" format="reference" />
                <attr name="leftIconVisibility" format="boolean" />
                <attr name="rightIcon" format="reference" />
                <attr name="rightIconVisibility" format="boolean" />
            </declare-styleable>
  
  ## LStatusView页面状态
  
  ### 1. 效果
  ![ScreenShot](./img/status.gif)
 
  ### 2. xml使用
           <com.zxl.zlibrary.view.statusview.LStatusView
                android:id="@+id/statusView"
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                   
  ### 3. 属性
           <declare-styleable name="LStatusView">
                  <!-- 错误提示图标 -->
                  <attr name="errorImg" format="reference" />
                  <!-- 错误提示文字 -->
                  <attr name="errorText" format="string" />
                  <!-- 空数据提示图标 -->
                  <attr name="emptyImg" format="reference" />
                  <!-- 空数据提示文字 -->
                  <attr name="emptyText" format="string" />
                  <!-- 加载提示文字 -->
                  <attr name="loadingText" format="string" />
              </declare-styleable>
   
### 4. 方法

  ![ScreenShot](./img/status_1.png)
