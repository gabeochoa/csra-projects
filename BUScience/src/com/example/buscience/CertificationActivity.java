package com.example.buscience;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class CertificationActivity extends Activity
{
	WebView browser;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.certification_layout);
        
        browser=(WebView)findViewById(R.id.webViewCertification);
        browser.loadUrl("http://docs.google.com/spreadsheet/embeddedform?bc=transparent&amp;f=%2522Georgia%2522%252C%2Bserif&amp;formkey=dHpJbk1WWjljVFdJQzNBZ0FQTFpzNVE6MA&amp;hl=en&amp;htc=%2523666666&amp;lc=%2523135355&amp;pli=1&amp;tc=%2523565555&amp;ttl=0");
    }
}