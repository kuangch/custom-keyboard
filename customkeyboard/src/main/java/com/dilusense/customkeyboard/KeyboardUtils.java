package com.dilusense.customkeyboard;

import android.view.View;
import android.widget.EditText;

/**
 * Created by kuangch on 2017/3/23.
 */
public class KeyboardUtils {

    public static void bindEditTextEvent(final BaseKeyboard customKeyboard, final EditText editText){
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    customKeyboard.attachTo(editText);
                }
            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (customKeyboard.isAttached) customKeyboard.showKeyboard();
                else customKeyboard.attachTo(editText);
            }
        });
    }
}
