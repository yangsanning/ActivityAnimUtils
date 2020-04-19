# ActivityAnimUtils
[![](https://jitpack.io/v/yangsanning/ActivityAnimUtils.svg)](https://jitpack.io/#yangsanning/ActivityAnimUtils)
[![API](https://img.shields.io/badge/API-19%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=19)

## 效果预览

| card        | diagonal    | fade       | in and out  |
| ----------- | ----------- | ---------- | ---------- |
| <img src="images/card.gif"/> | <img src="images/diagonal.gif"/> | <img src="images/fade.gif"/>|<img src="images/in_and_out.gif"/> |
| shrink      | slide down | slide left  | slide right |
| <img src="images/shrink.gif"/> | <img src="images/slide_down.gif"/>| <img src="images/slide_left.gif"/> | <img src="images/slide_right.gif"/> |
| slide up   | spin        | split       | swipe left |
| <img src="images/slide_up.gif"/>| <img src="images/spin.gif"/> | <img src="images/split.gif"/> | <img src="images/swipe_left.gif"/>|
| swipe left  | windmill    | zoom       |
| <img src="images/spin.gif"/> | <img src="images/split.gif"/> | <img src="images/swipe_left.gif"/>|


## 主要文件
| 名字             | 摘要           |
| ---------------- | -------------- |
| [ActivityAnimUtils] | Avtivity动画工具类  |


### 添加方法

#### 1. 添加仓库

在项目的 `build.gradle` 文件中配置仓库地址。

```android
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

#### 2. 添加项目依赖

在需要添加依赖的 Module 下添加以下信息，使用方式和普通的远程仓库一样。

```android
implementation 'com.github.yangsanning:ActivityAnimUtils:1.0.0'
```

[ActivityAnimUtils]:https://github.com/yangsanning/ActivityAnimUtils/blob/master/ActivityAnim/src/main/java/ysn/com/utils/activityanim/ActivityAnimUtils.java
