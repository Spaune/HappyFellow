package evacorporationlol.happyfellow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnStart = (Button)findViewById(R.id.btnStart);
        Button btnRate = (Button)findViewById(R.id.btnRate);
        Button btnExit = (Button)findViewById(R.id.btnExit);

        btnStart.setOnClickListener(this);
        btnRate.setOnClickListener(this);
        btnExit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.btnStart;
                intent = new Intent("com.evacorporation.intent.action.start");
                startActivity(intent);
                break;
            case R.id.btnRate;
                intent = new Intent("com.evacorporation.inetent.action.rate");
                startActivity(intent);
                break;
            case R.id.btnExit;
                intent = new Intent("com.evacorporation.intent.action.start");
                startActivity(intent);
                break;
        }
    }
}
