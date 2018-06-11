package medaiverr.t.designcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String inner_text = "";

    public void number(View view) {
        Button button = (Button)view;
        String buttonText = button.getText().toString();
        if(inner_text.length() < 15) {
            display(buttonText);
        }
    }

    public void clear(View view) {
        inner_text = "";
        display("0");
        inner_text = "";
    }

    private void display(String number) {
        TextView innerTextView = (TextView) findViewById(R.id.inner);
        inner_text = inner_text + number;
        innerTextView.setText(inner_text);
    }
}
