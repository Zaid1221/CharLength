package com.example.zaidjavaid.charlength;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    // private TextView sentence;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.sentence);
        // sentence=(TextView) findViewById(R.id.numCharsLabel);
        output = (TextView) findViewById(R.id.number);
        TextChangeHandler handler = new TextChangeHandler();
        editText.addTextChangedListener(handler);
        //updateSentenceSize();
    }

    public void updateSentenceSize()
    {
        //int size;
        //String input1= editText.getText().toString();
        //size=input1.length();
        //output.setText(size);
        output.setText(Integer.toString(editText.getText().length()));
    }

    private class TextChangeHandler implements TextWatcher {
        public void afterTextChanged(Editable s)
        {
            updateSentenceSize();
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count)
        {

        }
    }
}