package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AssignmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_assignment);
    }

    public void LPclick(View view) {
        Intent LP = new Intent(this,LabPracticalActivity.class);
        startActivity(LP);
    }

    public void SAclick(View view) {
        //Intent SA = new Intent(this,SemAssignmentActivity.class);
        //startActivity(SA);
        Intent googleClassroom = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/u/0/h"));
        startActivity(googleClassroom);
    }
}
