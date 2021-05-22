package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LabPracticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lab_practical);
    }

    public void S1click(View view) {


        Intent s1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem1.txt"));
        startActivity(s1);


    }

    public void S2click(View view) {
        Intent s2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem2.txt"));
        startActivity(s2);
    }

    public void S3click(View view) {
        Intent s3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem3.txt"));
        startActivity(s3);
    }

    public void S4click(View view) {
        Intent s4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem4.txt"));
        startActivity(s4);
    }

    public void S5click(View view) {
        Intent s5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem5.txt"));
        startActivity(s5);
    }

    public void S6click(View view) {
        Intent s6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sem6.txt"));
        startActivity(s6);
    }





}


