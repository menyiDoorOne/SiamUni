package android.siamuni.siamuni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ThaiProgramsActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_programs);
        Intent intent=getIntent();
        // 取其中的值
        int value = intent.getIntExtra("val",11);
        init(value);
    }
    private void init(int e){
        webView = (WebView) findViewById(R.id.webView);
        //WebView加载web资源
        switch (e){
            case 0:
                webView.loadUrl("http://www.interhotelsiamedu.net/");
                break;
            case 1:
                webView.loadUrl("http://www.ba.siam.edu/");
                break;

            case 2:
                webView.loadUrl("http://www.nitade.siam.edu/");
                break;
            case 3:
                webView.loadUrl("http://eng.siam.edu/");
                break;
            case 4:
                webView.loadUrl("http://www.siam.edu/siamedu_liberalarts/");
                break;
            case 5:
                webView.loadUrl("http://itschool.siam.edu/itschool/");
                break;
            case 6:
                webView.loadUrl("http://www.nursing.siam.edu/");
                break;
            case 7:
                webView.loadUrl("http://www.pharmacy.siam.edu/");
                break;
            case 8:
                webView.loadUrl("http://www.law.siam.edu/");
                break;
            case 9:
                webView.loadUrl("http://www.science.siam.edu/");
                break;
            case 10:
                webView.loadUrl("http://www.medsiamu.com/new2/");
                break;
            default:
                webView.loadUrl("http://www.siam.edu/");
                break;
            }

        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }
}
