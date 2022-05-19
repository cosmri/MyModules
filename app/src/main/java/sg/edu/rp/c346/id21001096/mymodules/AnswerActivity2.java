package sg.edu.rp.c346.id21001096.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView code2;
    TextView name2;
    TextView year2;
    TextView semester2;
    TextView credit2;
    TextView venue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        code2 = findViewById(R.id.code2);
        name2 = findViewById(R.id.name2);
        year2 = findViewById(R.id.year2);
        semester2 = findViewById(R.id.semester2);
        credit2 = findViewById(R.id.credit2);
        venue2 = findViewById(R.id.venue2);

        Intent intentReceived = getIntent();
        char value2 = intentReceived.getCharExtra("value2", 'C');
        int number2 = intentReceived.getIntExtra("number2", 349);
        String moduleName2 = intentReceived.getStringExtra("ModuleName2");
        int acadyear2 = intentReceived.getIntExtra("Academic Year2", 2022);
        int sem2 =  intentReceived.getIntExtra("Semester2", 1);
        int cred2 = intentReceived.getIntExtra("ModuleCredit2", 4);
        char ClassE = intentReceived.getCharExtra("Letter12", 'E');
        int Class62 = intentReceived.getIntExtra("Number2", 62);
        char ClassE2 = intentReceived.getCharExtra("Letter22",'E' );

        code2.setText("Module Code: " + value2 + number2);
        name2.setText("Module Name: " + moduleName2);
        year2.setText("Academic Year: " + acadyear2);
        semester2.setText("Semester: " + sem2);
        credit2.setText("Module Credit: " + cred2);
        venue2.setText("Venue: " + ClassE2 + Class62 + ClassE);
}}