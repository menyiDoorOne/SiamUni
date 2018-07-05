package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Aboutus_HonorSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus_honor_system);
        WebView myWebView = (WebView) findViewById(R.id.webView3);
        myWebView.loadUrl("http://www.siam.edu/");
    }
}
