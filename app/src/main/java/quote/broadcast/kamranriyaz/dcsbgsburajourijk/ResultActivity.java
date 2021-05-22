package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class ResultActivity extends AppCompatActivity {
    WebView webViewResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result);

        //webViewResults = findViewById(R.id.webViewResultsId); // Adding web view to time table activity
        //webViewResults.loadUrl("http://www.bgsbu.ac.in/results"); //loading image from url into web view
    }



        //webViewTimeTable.getSettings().setBuiltInZoomControls(true); // Adding zoom control

        //
/*
    public void WebRclick(View view) {
        Intent WR = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bgsbu.ac.in/results"));
        startActivity(WR);
    }

    public void ViewResultClick(View view) {
        Intent VR = new Intent(this, ViewResultActivity.class);
        startActivity(VR);
    }*/
}
