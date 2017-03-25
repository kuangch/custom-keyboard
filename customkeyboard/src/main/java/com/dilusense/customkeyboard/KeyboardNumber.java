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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 自定义键盘
 * Created by kuangch on 17/3/10.
 */
public class KeyboardNumber extends BaseKeyboard{

    public KeyboardNumber(Activity activity) {
        this(activity, false, false);
    }

    public KeyboardNumber(Activity activity, boolean ifRandom, boolean isWidthDecimal) {

        int layoutResId;
        if(isWidthDecimal)
            layoutResId = R.xml.keyboard_number_with_decimal;
        else
            layoutResId = R.xml.keyboard_number;

        init(activity,layoutResId,ifRandom);
    }
}