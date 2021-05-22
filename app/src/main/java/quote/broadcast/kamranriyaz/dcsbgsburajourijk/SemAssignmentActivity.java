package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SemAssignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_assignment);
    }


    public void SA1click(View view) {
        Intent s1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa1.txt"));
        startActivity(s1);

    }

    public void SA2click(View view) {
        Intent s2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa2.txt"));
        startActivity(s2);
    }

    public void SA3click(View view) {
        Intent s3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa3.txt"));
        startActivity(s3);
    }

    public void SA4click(View view) {
        Intent s4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa4.txt"));
        startActivity(s4);
    }

    public void SA5click(View view) {
        Intent s5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa5.txt"));
        startActivity(s5);
    }

    public void SA6click(View view) {
        Intent s6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/sa6.txt"));
        startActivity(s6);
    }




}
