package com.example.inchtometerjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.inchtometerjava.R;

public class MainActivity extends AppCompatActivity {

    EditText inchInput;
    Button convertButton;
    TextView meterOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inchInput = findViewById(R.id.inchInput);
        convertButton = findViewById(R.id.convertButton);
        meterOutput = findViewById(R.id.meterOutput);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double inches = Double.parseDouble(inchInput.getText().toString());
                    double meters = inches * 0.0254;
                    meterOutput.setText(inches + " inches is equal to " + meters + " meters");
                } catch (NumberFormatException e) {
                    meterOutput.setText("Please enter a valid number for inches");
                }
            }
        });
    }
}
