package com.dilusense.customkeyboard;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Build;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.lang.reflect.Method;

/**
 * 自定义键盘
 * Created by kuangch on 17/3/10.
 */
public class KeyboardIP extends BaseKeyboard{

    public KeyboardIP(Activity activity) {

        init(activity, R.xml.keyboard_ip_address);
    }
}