package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;


public class SportsActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;


    ImageView iv1;
    ImageView iv2;
    ImageView iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);



        iv1=(ImageView)findViewById(R.id.imageViewSports1);
        iv2=(ImageView)findViewById(R.id.imageViewSports2);
        iv3=(ImageView)findViewById(R.id.imageViewSports3);
    }
}
