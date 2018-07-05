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

public class Academics_BHTActivity extends AppCompatActivity {

    ListView myListView;
    List<String> itemString=new ArrayList<String>();
    List <Object> itemImage=new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics_bht);

        ArrayList<HashMap<String, Object>> listItem =new ArrayList<HashMap<String, Object>>();
        myListView = (ListView) findViewById(R.id.listView_academicsBHT);

        HashMap <String, Object> itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_1_itemtitle));
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_2_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_3_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_4_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_6_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_7_itemtitle) );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemString",getApplication().getString(R.string.academics_bba_8_itemtitle) );
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
                    case 0:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_1_string);
                        break;
                    case 1:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_2_string);
                        break;
                    case 2:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_3_string);
                        break;
                    case 3:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_4_string);
                        break;
                    case 4:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_5_string);
                        break;
                    case 5:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_6_string);
                        break;
                    case 6:one=new Intent(Academics_BHTActivity.this,Academics_DetailActivity.class);
                        one.putExtra("stringsid",R.string.academics_bht_7_string);
                        break;
                }
                startActivity(one);
            }
        });
    }
}
