/**
 * Created by Pein on 2016/8/3.
 */
package android.siamuni.siamuni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AboutusActivity extends AppCompatActivity implements View.OnClickListener {

    ListView myListView;
    List <String> itemString=new ArrayList<String>();
    List <Object> itemImage=new ArrayList<Object>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        ArrayList<HashMap<String, Object>> listItem =new ArrayList<HashMap<String, Object>>();
        myListView = (ListView) findViewById(R.id.listView_aboutUs);

        HashMap <String, Object> itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_HistoryofSiamUniversity_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_MessagefromthePresident_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_MissionVision_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_Strategies_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_InternationalCollebotations_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_StudentConductPolicy_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_GradingSystem_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_HonorSystem_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_InternationalStudentCenter_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_EnglishLanguageCenter_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_InternshipCareerplacement_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString",getApplication().getString(R.string.aboutus_InetrnationalAccrediation_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        SimpleAdapter mySimpleAdapter = new SimpleAdapter(this,listItem,R.layout.aboutusitemlayout, new String[] { "itemImage1", "itemString" ,"itemImage2"},
                new int[] { R.id.imageView_aboutUsItem1, R.id.textView_aboutUsItem,R.id.imageView_aboutUsItem2 });

        myListView.setAdapter(mySimpleAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                Intent one=null;
                switch (arg2){
                    case 0:one=new Intent(AboutusActivity.this,Aboutus_HistoryActivity.class);
                        break;
                    case 1:one=new Intent(AboutusActivity.this,Aboutus_MessageFromThePresidentActivity.class);
                        break;
                    case 2:one=new Intent(AboutusActivity.this,Aboutus_MissionAndVisionActivity.class);
                        break;
                    case 3:one=new Intent(AboutusActivity.this,Aboutus_StrategiesActivity.class);
                        break;
                    case 4:one=new Intent(AboutusActivity.this,Aboutus_InternationalColleborationsActivity.class);
                        break;
                    case 5:one=new Intent(AboutusActivity.this,Aboutus_SdudentConductPolicyActivity.class);
                        break;
                    case 6:one=new Intent(AboutusActivity.this,Aboutus_GradingSystemActivity.class);
                        break;
                    case 7:one=new Intent(AboutusActivity.this,Aboutus_HonorSystemActivity.class);
                        break;
                    case 8:one=new Intent(AboutusActivity.this,Aboutus_InternationalSdudentCenterActivity.class);
                        break;
                    case 9:one=new Intent(AboutusActivity.this,Aboutus_EnglishLanguageCenterActivity.class);
                        break;
                    case 10:one=new Intent(AboutusActivity.this,Aboutus_InternshipAndCareerPlacementActivity.class);
                        break;
                    case 11:one=new Intent(AboutusActivity.this,Aboutus_InternationalAccrediationActivity.class);
                        break;
                }
                startActivity(one);
            }
        });

    }
    public void onClick(View v) {

    }
}
