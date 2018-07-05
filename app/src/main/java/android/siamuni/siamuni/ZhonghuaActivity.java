package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ZhonghuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhonghua);

        WebView myWebView = (WebView) findViewById(R.id.webView2);
        myWebView.loadUrl("http://www.siamsino.com/");
    }
}
