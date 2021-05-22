package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class LearningResActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_learning_res);
        //calling action bar
        ActionBar actionBar = getSupportActionBar();

        //display action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case android.R.id.home: {
                this.finish();
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnTutorialsPoint(View view) {
        Intent tutorialsPointIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/computer_science_tutorials.htm"));
        startActivity(tutorialsPointIntent);
    }

    public void btnGeeksForGeeks(View view) {
        Intent geeksForGeeksIntent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/articles-on-computer-science-subjects-gq/"));
        startActivity(geeksForGeeksIntent);
    }

    public void btnJavaTpoint(View view) {
        Intent javaTpointIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"));
        startActivity(javaTpointIntent);
    }

    public void btnSwayam(View view) {
        Intent swayamIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://swayam.gov.in/explorer?category=COMP_SCI_ENGG"));
        startActivity(swayamIntent);
    }


    public void btnNptel(View view) {
        Intent neptelIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nptel.ac.in/course.html"));
        startActivity(neptelIntent);
    }

    public void btnSoloLearn(View view) {
        Intent soloLearnIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sololearn.com/Courses/"));
        startActivity(soloLearnIntent);
    }

    public void btnMySirG(View view) {
        Intent mySirGintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mysirg.com/"));
        startActivity(mySirGintent);
    }
}
