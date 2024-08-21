package com.example.androidlab2;

import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final linkGenerator generator=new linkGenerator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickGenerate(View view){
        TextView downloadLink=findViewById(R.id.downloadLink);
        Spinner distro=findViewById(R.id.distro);
        String link=String.valueOf(distro.getSelectedItem());

        List<String>linkList=generator.getLinks(link);
        StringBuilder linksFormatted=new StringBuilder();
        for(String item:linkList){
            linksFormatted.append(item).append("\n\n\n");
        }
        downloadLink.setText(linksFormatted);
    }
}