# Custom-Keyboard

android 自定义键盘

## 使用

引用
``` gradle
compile 'com.dilusense.android:customkeyboard:1.1'
```

布局文件引用键盘布局文件
``` java
<include
        layout="@layout/layout_keyboardview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"/>
```

创建键盘实例
``` java
KeyboardIdentity keyboardIdentity = new KeyboardIdentity(this);
```

绑定点击，焦点变化事件给EditText
``` java
KeyboardUtils.bindEditTextEvent(keyboardIdentity, editText);
```

## 效果
![image](https://github.com/kuangch/custom-keyboard/blob/master/screen.gif)
