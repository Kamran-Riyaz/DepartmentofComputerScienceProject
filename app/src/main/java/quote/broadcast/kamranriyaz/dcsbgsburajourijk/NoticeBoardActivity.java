package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class NoticeBoardActivity extends AppCompatActivity {

    WebView webViewNoticeBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_notice_board);


        webViewNoticeBoard = findViewById(R.id.webViewNoticeBoardId); // Adding web view to time table activity
        webViewNoticeBoard.getSettings().setBuiltInZoomControls(true); // Adding zoom control


            webViewNoticeBoard.loadUrl("https://dcsbgsbujk.wordpress.com/"); //loading image from url into web view

        //webViewTimeTable.reload();

        //calling action bar/back navigation
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

    public void btnReload(View view) {


        //reload
        NoticeBoardActivity.this.webViewNoticeBoard.loadUrl("https://dcsbgsbujk.wordpress.com");

        /*webViewNoticeBoard.loadUrl("https://dcsbgsbujk.wordpress.com");*/

        Toast.makeText(this,"Reloaded",Toast.LENGTH_SHORT).show();


    }







  /*  public void btnRefresh(View view) { // Reloading image again into web view
        NoticeBoardActivity.this.webViewTimeTable.loadUrl("http://dcsbgsbu.000webhostapp.com/timetable.png");

        Toast.makeText(this,"Refreshed",Toast.LENGTH_SHORT).show();
    }

    public void btnDownload(View view) { // Image downloading through browser intent
        Intent downloadIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://dcsbgsbu.000webhostapp.com/timetable.png"));
        startActivity(downloadIntent)

    }*/
}
