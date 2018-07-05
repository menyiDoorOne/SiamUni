package android.siamuni.siamuni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdmissionActivity extends AppCompatActivity {

    /*这是一次Git尝试*/

    ListView myListView;
    List<String> itemString=new ArrayList<String>();
    List <Object> itemImage=new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        ArrayList<HashMap<String, Object>> listItem =new ArrayList<HashMap<String, Object>>();
        myListView = (ListView) findViewById(R.id.listView_admission);

        HashMap <String, Object> itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_WhenToApply_itemtitle));
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_Academic_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_Profeciency_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_AdmissionProcedure_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_ApplyFromAbroad_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_ApplicationRequirements_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.admission_VisaSupport_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);


        SimpleAdapter mySimpleAdapter = new SimpleAdapter(this,listItem,R.layout.admissionitemlayout, new String[] {  "itemString" ,"itemImage2"},
                new int[] { R.id.textView_admissionItem,R.id.imageView_admissionItem2 });

        myListView.setAdapter(mySimpleAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                Intent one=null;
                switch (arg2){
                    case 0:one=new Intent(AdmissionActivity.this,Admission_WhenToApplyActivity.class);
                        break;
                    case 1:one=new Intent(AdmissionActivity.this,Admission_AcademicQualificationsActivity.class);
                        break;
                    case 2:one=new Intent(AdmissionActivity.this,Admisson_EnglishProfeciencyActivity.class);
                        break;
                    case 3:one=new Intent(AdmissionActivity.this,Admission_AdmissionProcedureActivity.class);
                        break;
                    case 4:one=new Intent(AdmissionActivity.this,Admission_ApplyFromAbroadActivity.class);
                        break;
                    case 5:one=new Intent(AdmissionActivity.this,Admission_ApplicationRequirementsActivity.class);
                        break;
                    case 6:one=new Intent(AdmissionActivity.this,Admission_VisaSupportActivity.class);
                        break;
                }
                startActivity(one);
            }
        });
    }
}
