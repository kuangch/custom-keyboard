package com.dilusense.customkeyboardsimple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.dilusense.customkeyboard.BaseKeyboard;
import com.dilusense.customkeyboard.KeyboardIP;
import com.dilusense.customkeyboard.KeyboardIdentity;
import com.dilusense.customkeyboard.KeyboardNumber;
import com.dilusense.customkeyboard.KeyboardUtils;
import com.dilusense.customkeyboard.utils.IPUtils;
import com.dilusense.customkeyboard.utils.IdentityUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.et_1)
    EditText et_1;

    @Bind(R.id.et_2)
    EditText et_2;

    @Bind(R.id.et_3)
    EditText et_3;

    @Bind(R.id.et_4)
    EditText et_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        KeyboardIdentity keyboardIdentity = new KeyboardIdentity(this);
        KeyboardUtils.bindEditTextEvent(keyboardIdentity, et_1);
        KeyboardIP keyboardIP = new KeyboardIP(this);
        KeyboardUtils.bindEditTextEvent(keyboardIP, et_2);
        KeyboardNumber keyboardNumber = new KeyboardNumber(this);
        KeyboardUtils.bindEditTextEvent(keyboardNumber, et_3);
        KeyboardNumber keyboardNumberRandom = new KeyboardNumber(this, true, false);
        KeyboardUtils.bindEditTextEvent(keyboardNumberRandom, et_4);


        keyboardIdentity.setOnOkClick(new BaseKeyboard.OnOkClick() {
            @Override
            public void onOkClick() {
                IdentityUtils identityUtils = new IdentityUtils();
                if (!identityUtils.isValidatedAllIdcard(et_1.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "输入的身份证号不合法", Toast.LENGTH_SHORT).show();
                }
            }
        });
        keyboardIP.setOnOkClick(new BaseKeyboard.OnOkClick() {
            @Override
            public void onOkClick() {
                if (!IPUtils.isValidatedIPPort(et_2.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "输入的IP不合法", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
