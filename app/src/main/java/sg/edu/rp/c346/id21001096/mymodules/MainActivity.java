package sg.edu.rp.c346.id21001096.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView android;
    TextView ipad;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android = findViewById(R.id.android);
        ipad = findViewById(R.id.ipad);
        btnback = findViewById(R.id.btnback);

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("value", 'C');
                intent.putExtra("number", 346);
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Class", 66);
                intent.putExtra("letter1", "W");
                intent.putExtra("letter2", "M");
                startActivity(intent);
            }
        });

        ipad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("value2", 'C');
                intent.putExtra("number2", 349);
                intent.putExtra("ModuleName2", "iPad Programming");
                intent.putExtra("AcademicYear2", 2022);
                intent.putExtra("Semester2", 1);
                intent.putExtra("ModuleCredit2", 4);
                intent.putExtra("Number2", 66);
                intent.putExtra("letter12", "E");
                intent.putExtra("letter22", "E");
                startActivity(intent);
            }
        });


    }
}