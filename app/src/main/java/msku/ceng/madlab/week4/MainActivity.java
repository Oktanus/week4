package msku.ceng.madlab.week4;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnGo;
    EditText txtAddress;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        btnGo =findViewById(R.id.btnGo);
        txtAddress = findViewById(R.id.txtAddress);
        webView =findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https//"+txtAddress.getText());
            }
        });
        if(getIntent() !=null && getIntent().getData() !=null){
            txtAddress.setText(getIntent().getData().toString());
            webView.loadUrl((getIntent().getData().toString()));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);Log.d("123", "onCreateOptionsMenu: ");
        return super.onCreateOptionsMenu(menu);


}
}


