package com.fadhifatah.demosimpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextPreview;
    EditText mTextInput;
    ImageButton mSendInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextPreview = findViewById(R.id.text_preview);
        mTextInput = findViewById(R.id.text_input);
        mSendInput = findViewById(R.id.send_input);

        mSendInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = mTextPreview.getText().toString();
                String inputText = mTextInput.getText().toString();

                mTextPreview.setText(currentText + "\n\n" + inputText);
                mTextInput.setText("");
            }
        });

    }
}
