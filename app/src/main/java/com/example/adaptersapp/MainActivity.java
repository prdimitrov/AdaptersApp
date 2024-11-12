package com.example.adaptersapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //1. AdapterView : ListView
            listView = findViewById(R.id.listView);
            //2. Data Source
            String[] countries =
                    {"Bulgaria",
                    "Turkey",
                    "Macedonia",
                    "Serbia",
                    "Greece",
                    "Germany",
                    "Netherlands",
                    "Russia",
                    "Japan",
                    "Mongolia",
                    "France",
                    "Italy",
                    "Moldova",
                    "Ukraine",
                    "Romania"};
            //3. Adapter - acts as a bridge between the data source and the adapter view!
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    countries);

            listView.setAdapter(adapter);
            return insets;
        });
    }
}