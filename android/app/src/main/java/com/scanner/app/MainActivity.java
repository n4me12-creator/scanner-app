package com.scanner.app;

import android.graphics.Color;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // اجعل WebView شفافًا حتى تظهر الكاميرا خلفه
        getBridge().getWebView().setBackgroundColor(Color.TRANSPARENT);
    }
}
