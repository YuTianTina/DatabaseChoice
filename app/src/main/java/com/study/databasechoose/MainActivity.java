package com.study.databasechoose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button;
    private TextView textView;

    private DbOperation dbOperation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.text_view);

        dbOperation = new DbOperation();

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        dbOperation.addUser(new User(editText.getText().toString(), 17));
        textView.setText(getShow());
        editText.setText("");
    }

    private String getShow(){
        StringBuilder sb = new StringBuilder();
        for (User user :
                dbOperation.queryUser()) {
            sb.append(user.getUserName())
                    .append("\n");
        }
        return sb.toString();
    }
}
