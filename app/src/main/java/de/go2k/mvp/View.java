package de.go2k.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class View extends Activity {

    private Presenter presenter;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        initComponents();
        initEvents();
    }

    private void initEvents() {
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                presenter.doSum();
            }
        });
    }

    private void initComponents() {
        presenter = new Presenter(this);
        textView = findViewById(R.id.textView);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
    }

    public String getET1Text() {
        return editText1.getText().toString();
    }

    public String getET2Text() {
        return editText2.getText().toString();
    }

    public String getTVText() {
        return editText1.getText().toString();
    }

    public void setET1Text(String text) {
        editText1.setText(text);
    }

    public void setET2Text(String text) {
        editText2.setText(text);
    }

    public void setTVText(String text) {
        textView.setText(text);
    }
}
