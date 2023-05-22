package sg.edu.rp.c346.id22011587.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC206;
    TextView tvC203;
    TextView tvC218;
    TextView tvC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textView1);
        tvC206 = findViewById(R.id.textView2);
        tvC203 = findViewById(R.id.textView3);
        tvC218 = findViewById(R.id.textView4);
        tvC235 = findViewById(R.id.textView5);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Mobile App Development");
                intent.putExtra("Academic Year", 2023);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E63A");
                startActivity(intent);

            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("Module Code", "C206");
                intent2.putExtra("Module Name", "Software Development Process");
                intent2.putExtra("Academic Year", 2023);
                intent2.putExtra("Semester", 1);
                intent2.putExtra("Module Credit", 4);
                intent2.putExtra("Venue", "W64N");
                startActivity(intent2);

            }
        });
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent3 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent3.putExtra("Module Code", "C203");
                intent3.putExtra("Module Name", "Web Application Development in php");
                intent3.putExtra("Academic Year", 2023);
                intent3.putExtra("Semester", 1);
                intent3.putExtra("Module Credit", 4);
                intent3.putExtra("Venue", "W64N");
                startActivity(intent3);

            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent4 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent4.putExtra("Module Code", "C218");
                intent4.putExtra("Module Name", "UI/UX Design for Apps");
                intent4.putExtra("Academic Year", 2023);
                intent4.putExtra("Semester", 1);
                intent4.putExtra("Module Credit", 4);
                intent4.putExtra("Venue", "W64N");
                startActivity(intent4);

            }
        });
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent5 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent5.putExtra("Module Code", "C235");
                intent5.putExtra("Module Name", "IT Security and Management");
                intent5.putExtra("Academic Year", 2023);
                intent5.putExtra("Semester", 1);
                intent5.putExtra("Module Credit", 4);
                intent5.putExtra("Venue", "W64N");
                startActivity(intent5);

            }
        });
    }
}