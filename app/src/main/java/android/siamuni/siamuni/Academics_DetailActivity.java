package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Academics_DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics_detail);

        final int stringsid=getIntent().getIntExtra("stringsid",R.string.academics_detaildefultstring);
        TextView textView=(TextView)findViewById(R.id.textView_academicsDetail);

        textView.setText(getApplication().getString(stringsid));
    }
}
