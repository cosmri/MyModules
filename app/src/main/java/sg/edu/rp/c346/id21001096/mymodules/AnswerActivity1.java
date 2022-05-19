package sg.edu.rp.c346.id21001096.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView code;
    TextView name;
    TextView year;
    TextView semester;
    TextView credit;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        code = findViewById(R.id.code);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        semester = findViewById(R.id.semester);
        credit = findViewById(R.id.credit);
        venue = findViewById(R.id.venue);


        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'C');
        int number = intentReceived.getIntExtra("number", 346);
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int acadyear = intentReceived.getIntExtra("Academic Year", 2022);
        int sem =  intentReceived.getIntExtra("Semester", 1);
        int cred = intentReceived.getIntExtra("ModuleCredit", 4);
        char Class = intentReceived.getCharExtra("Letter1", 'W');
        int Class2 = intentReceived.getIntExtra("Number", 66);
        char Class3 = intentReceived.getCharExtra("Letter2",'M' );

        code.setText("Module Code: " + value + number);
        name.setText("Module Name: " + moduleName);
        year.setText("Academic Year: " + acadyear);
        semester.setText("Semester: " + sem);
        credit.setText("Module Credit: " + cred);
        venue.setText("Venue: " + Class + Class2 + Class3);






    }
}