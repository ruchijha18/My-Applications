package ruchi.digipodium.basicjava;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int counter = 0;
    private TextView textCount;
    private EditText editStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCount = findViewById(R.id.btnCount);
        Button btnReset = findViewById(R.id.btnReset);
        Button btnGo = findViewById(R.id.btngo);
       editStart=findViewById(R.id.editStart);
        textCount = findViewById(R.id.textCount);
    }
    public void setStart(View v) {

        counter =Integer.parseInt(editStart.getText().toString());

    }

    public void increaseCount(View v){
        counter++;
        textCount.setText(String.valueOf(counter));
    }

    public void resetCount(View v){
        counter = 0;
        textCount.setText(String.valueOf(counter));
        EditText ediStart;
        editStart.setText(String.valueOf(0));
    }
}
