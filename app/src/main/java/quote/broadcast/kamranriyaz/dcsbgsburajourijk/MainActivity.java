package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //calling action bar / back navigation button
        ActionBar actionBar = getSupportActionBar();

        //display action bar / back navigation button
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
                  MenuInflater myMenuInflater = getMenuInflater();
              myMenuInflater.inflate(R.menu.menu_items, menu);
          return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case android.R.id.home: {
                this.finish();
            }
                return true;

            case R.id.AboutItem:
            {
                Intent aboutIntent = new Intent(this,AboutActivity.class);
                startActivity(aboutIntent);
            }
            return true;

            case R.id.FeedbackItem:
            {
                         Intent feedbackIntent = new Intent(Intent.ACTION_SENDTO);
                   feedbackIntent.setData(Uri.parse("mailto:<kamranriyaz2@gmail.com>,\"Nawab Dar\" <nawabdar5@gmail.com>"));
                startActivity(feedbackIntent);
            }
            return true;

            /*case R.id.LogoutItem:
            {
                Intent logout = new Intent(this,LoginActivity.class);
                startActivity(logout);
            }
            return true;*/

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void btnNoticeBoard(View view) {
               Intent noticeBoardIntent = new Intent(this, NoticeBoardActivity.class);
            startActivity(noticeBoardIntent);
        Toast.makeText(this,"Loading Notice Board...",Toast.LENGTH_SHORT).show();
    }

    public void btnSyllabus(View view) {
              Intent syllabusIntent = new Intent(this,SyllabusActivity.class);
        startActivity(syllabusIntent);
    }

    public void btnContact(View view) {
               Intent contactIntent = new Intent(Intent.ACTION_SENDTO);
            contactIntent.setData(Uri.parse("mailto:dcs.bgsbu.jk@gmail.com"));
        startActivity(contactIntent);
    }

    public void btnLearningRes(View view) {
              Intent learningResIntent = new Intent(this,LearningResActivity.class);
        startActivity(learningResIntent);

    }

    public void btnResult(View view) {
        //Intent resultIntent = new Intent(this,ResultActivity.class);
        //startActivity(resultIntent);
               Intent universityWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bgsbu.ac.in/results"));
        startActivity(universityWebsite);
    }

   // Google classroom button click
    public void btnGoogleClassroom(View view) {
        //Intent assignmentIntent = new Intent(this, AssignmentActivity.class);
       // startActivity(assignmentIntent);
              Intent googleClassroom = new Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/u/0/h"));
        startActivity(googleClassroom);
    }
}
