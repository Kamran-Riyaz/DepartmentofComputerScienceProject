package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class SyllabusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_syllabus);

        //calling action bar
        ActionBar actionBar = getSupportActionBar();

        //display action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        Toast.makeText(this,"Loading...",Toast.LENGTH_LONG).show();
        WebView slybWebView = findViewById(R.id.slybwebViewid);
        slybWebView.loadUrl("http://www.bgsbu.ac.in/depcs/dcssylbs.aspx");
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
}
