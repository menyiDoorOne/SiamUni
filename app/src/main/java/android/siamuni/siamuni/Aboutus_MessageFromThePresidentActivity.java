package android.siamuni.siamuni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Aboutus_MessageFromThePresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus_message_from_the_president);
        ImageView imageView=(ImageView)findViewById(R.id.imageView_aboutUs_messageFromThePresident);
        imageView.setImageResource(R.drawable.president);
    }
}
