package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        WebView myWebView = (WebView) findViewById(R.id.webView_library);
        myWebView.loadUrl("http://e-library.siam.edu/main/");
    }
}
