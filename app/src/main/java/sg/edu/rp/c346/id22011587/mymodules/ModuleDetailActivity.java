package sg.edu.rp.c346.id22011587.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleDetails = findViewById(R.id.moduleDetails);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("Module Code");
        String moduleName = intentReceived.getStringExtra("Module Name");
        int moduleYear = intentReceived.getIntExtra("Year", 2023);
        int moduleSemester = intentReceived.getIntExtra("Semester", 1);
        int moduleCredit = intentReceived.getIntExtra("Credit", 4);
        String moduleVenue = intentReceived.getStringExtra("Venue");

        tvModuleDetails.setText("Module Code: " + moduleCode + "\n" +
                "Module Name: " + moduleName + "\n" +
                "Academic Year: " + moduleYear + "\n" +
                "Semester: " + moduleSemester + "\n" +
                "Module Credit: " + moduleCredit + "\n" +
                "Venue: " + moduleVenue);
    }
}