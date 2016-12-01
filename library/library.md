## 一. 模块作用
负责提供各种工具和管理第三方库，现在的开发一般离不开第三方库（当然可以自己实现，但是不要重复造轮子不是吗？），
这里建议在统一的地方管理（那就是建一个单独的 module），尽量保证和 Presentation 层分开。

## 二. 规范建议
1. 项目中确实需要（这不是废话吗？用不着，我要它干嘛？呵呵，建议不要为了解决一个小小的问题导入一个大而全的库）
2. 使用的人要多（大家都在用的一般更新会比较快，出现问题解决方案也多）
3. 效率和体量的权衡（如果效率没有太大影响的情况下，我一般建议选择体量小点的，如，Gson vs Jackson，Gson 胜出；还是 65K 的问题）
4. 使用第三方库尽量二次封装
```
1. 为什么要二次封装？
为了方便更换，说得稍微专业点为了降低耦合。
有很多原因可能需要你替换项目中的第三方库，这时候如果你是经过二次封装的，那么很简单，只需要在封装类中修改一下就可以了，完全不需要去全局检索代码。

2. 那该怎么封装呢？
一般的，如果是一些第三方的工具类，都会提供一些静态方法，那么这个就简单了，直接写一个工具类，提供类似的静态方法即可（就是用静态工厂模式）。
如下代码所示，这是对系统 Log 的简单封装：
```

## 常用库建议
### 1. 基本库
1. android基本库：recyclerview,cardview,support-annotations,percent(百分比布局库com.android.support:percent:...)
2. Rxjava,RxAndroid
3. timber 日志， me:https://github.com/haodynasty/logger
4. fresco 图片加载
5. retrofit2 网络加载 okhttp3
6. butterknife 最好注解（非反射实现）
7. auto-value 自动生成代码(model类自动getter,setter,序列号,builder等)
8. EventBus(otto) 观察者解耦

### 2. 监控库（性能，调试，错误等）
1. crashlytics 错误收集
2. stetho chrome调试跟踪
3. LeakCanary 内存泄露监控

### 3. 测试用
1. robolectric 测试框架
2. hamcrest
3. crittercism
4. espresso

### 4. 扩展库



