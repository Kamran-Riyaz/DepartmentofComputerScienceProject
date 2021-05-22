package quote.broadcast.kamranriyaz.dcsbgsburajourijk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class ViewResultActivity extends AppCompatActivity {
 WebView vrWW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_result);
        Toast.makeText(this,"Loading...",Toast.LENGTH_LONG).show();

        vrWW = findViewById(R.id.ViewResultWw); // Adding web view to time table activity

        vrWW.getSettings().setBuiltInZoomControls(true); // Adding zoom control
        vrWW.getSettings().setDisplayZoomControls(false);

        vrWW.loadUrl("https://dcsbgsbu.000webhostapp.com/result.html"); //loading image from url into web view


    }

    public void RfClick(View view) {
        ViewResultActivity.this.vrWW.loadUrl("https://dcsbgsbu.000webhostapp.com/result.html");

        Toast.makeText(this,"Refreshed",Toast.LENGTH_SHORT).show();
    }

    public void DL1click(View view) {
        Intent downloadIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/oddsem.jpg"));
        startActivity(downloadIntent);

    }

    public void DL2click(View view) {
        Intent downloadIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dcsbgsbu.000webhostapp.com/evensem.jpg"));
        startActivity(downloadIntent);
    }
}
