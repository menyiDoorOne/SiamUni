package android.siamuni.siamuni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Pein on 2016/8/3.
 */
public class NewsActivity  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        WebView myWebView = (WebView) findViewById(R.id.webView_news);
        myWebView.loadUrl("http://www.inter.siam.edu/");
    }
}
