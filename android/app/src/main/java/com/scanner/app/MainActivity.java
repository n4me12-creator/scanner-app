package com.scanner.app;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // اجعل خلفية نافذة Activity شفافة
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // اجعل WebView شفافًا حتى تظهر الكاميرا خلفه
        WebView webView = getBridge().getWebView();
        if (webView != null) {
            webView.setBackgroundColor(Color.TRANSPARENT);
            webView.setBackground(new ColorDrawable(Color.TRANSPARENT));
        }
    }
}
