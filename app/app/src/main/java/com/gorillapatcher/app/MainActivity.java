package com.gorillapatcher.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.*;

public class MainActivity extends Activity {

    private final String VERIFY_CODE = "145679";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 80, 40, 40);

        TextView title = new TextView(this);
        title.setText("GORILLA PATCHER");
        title.setTextSize(28);
        title.setGravity(17);

        TextView info = new TextView(this);
        info.setText("Enter your 6-digit verification code");
        info.setGravity(17);

        EditText code = new EditText(this);
        code.setHint("000000");
        code.setInputType(2);
        code.setMaxLength(6);
        code.setGravity(17);

        Button verify = new Button(this);
        verify.setText("VERIFY");

        TextView message = new TextView(this);
        message.setGravity(17);

        verify.setOnClickListener(v -> {
            if (code.getText().toString().equals(VERIFY_CODE)) {
                message.setText("✓ Verified");
                message.setTextColor(Color.GREEN);
            } else {
                message.setText("Incorrect or expired code");
                message.setTextColor(Color.RED);
            }
        });

        layout.addView(title);
        layout.addView(info);
        layout.addView(code);
        layout.addView(verify);
        layout.addView(message);

        setContentView(layout);
    }
}
