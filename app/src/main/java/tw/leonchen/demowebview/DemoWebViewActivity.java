package tw.leonchen.demowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DemoWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_demo_web_view);
        WebView webView = new WebView(DemoWebViewActivity.this);
        webView.loadUrl("http://tw.yahoo.com");
        setContentView(webView);
    }
}
