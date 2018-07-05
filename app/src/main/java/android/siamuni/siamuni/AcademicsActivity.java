package android.siamuni.siamuni;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class AcademicsActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;

    private List<String> group_list;

    private List<String> item_lt1;

    private List<String> item_lt2;

    private List<String> item_lt3;

    private List<String> item_lt4;

    private List<List<String>> item_list;

    private List<List<Integer>> item_list2;

    private List<List<Integer>> gr_list2;

    private MyExpandableListViewAdapter adapter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);


        group_list=new ArrayList<String>();
        group_list.add(getApplication().getString(R.string.academics_bachelors_grouptitle));
        group_list.add(getApplication().getString(R.string.academics_masters_grouptitle));
        group_list.add(getApplication().getString(R.string.academics_doctor_grouptitle));
        group_list.add(getApplication().getString(R.string.academics_thaiprograms_grouptitle));

        item_lt1 =new ArrayList<String>();
        item_lt1.add(getApplication().getString(R.string.academics_0_0_itemtitle));
        item_lt1.add(getApplication().getString(R.string.academics_0_1_itemtitle));
        item_lt1.add(getApplication().getString(R.string.academics_0_2_itemtitle));

        item_lt2 =new ArrayList<String>();
        item_lt2.add(getApplication().getString(R.string.academics_1_0_itemtitle));
        item_lt2.add(getApplication().getString(R.string.academics_1_1_itemtitle));
        item_lt2.add(getApplication().getString(R.string.academics_1_2_itemtitle));

        item_lt3 =new ArrayList<String>();
        item_lt3.add(getApplication().getString(R.string.academics_2_0_itemtitle));

        item_lt4 =new ArrayList<String>();
        item_lt4.add(getApplication().getString(R.string.academics_3_0_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_1_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_2_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_3_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_4_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_5_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_6_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_7_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_8_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_9_itemtitle));
        item_lt4.add(getApplication().getString(R.string.academics_3_10_itemtitle));

        item_list=new ArrayList<List<String>>();
        item_list.add(item_lt1);
        item_list.add(item_lt2);
        item_list.add(item_lt3);
        item_list.add(item_lt4);

        List<Integer> tmp_list=new ArrayList<Integer>();
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);
        tmp_list.add(R.drawable.aboutus2);

        item_list2 = new ArrayList<List<Integer>>();
        item_list2.add(tmp_list);
        item_list2.add(tmp_list);
        item_list2.add(tmp_list);
        item_list2.add(tmp_list);

        List<Integer> gr_list=new ArrayList<Integer>();
        gr_list.add(R.drawable.academicgroupimg1);
        gr_list.add(R.drawable.academicgroupimg1);
        gr_list.add(R.drawable.academicgroupimg1);
        gr_list.add(R.drawable.academicgroupimg1);

        gr_list2 =new ArrayList<List<Integer>>();
        gr_list2.add(gr_list);
        gr_list2.add(gr_list);
        gr_list2.add(gr_list);
        gr_list2.add(gr_list);

        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        expandableListView.setGroupIndicator(null);

        // 监听组点击
        expandableListView.setOnGroupClickListener(new OnGroupClickListener()
        {
            @SuppressLint("NewApi")
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id)
            {
                if (item_list.get(groupPosition).isEmpty())
                {
                    return true;
                }
                return false;
            }
        });

        // 监听每个分组里子控件的点击事件
        expandableListView.setOnChildClickListener(new OnChildClickListener()
        {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id)
            {

                //Toast.makeText(AcademicsActivity.this, "group=" + groupPosition + "---child=" + childPosition + "---" + item_list.get(groupPosition).get(childPosition), Toast.LENGTH_SHORT).show();

                Intent one=null;

                switch(groupPosition){
                    case 0: switch (childPosition){
                        case 0: one=new Intent(AcademicsActivity.this,Academics_BBAActivity.class);
                            break;
                        case 1: one=new Intent(AcademicsActivity.this,Academics_BHTActivity.class);
                            break;
                        case 2: one=new Intent(AcademicsActivity.this,ZhonghuaActivity.class);
                    }
                        break;
                    case 1: switch (childPosition){
                        case 0: one=new Intent(AcademicsActivity.this,Academics_MBAActivity.class);
                            break;
                        case 1: one=new Intent(AcademicsActivity.this,Academics_MHRPSActivity.class);
                            break;
                        case 2: one=new Intent(AcademicsActivity.this,ZhonghuaActivity.class);
                            break;
                    }
                        break;
                    case 2: switch (childPosition){
                        case 0: one=new Intent(AcademicsActivity.this,Academics_DITActivity.class);
                            break;
                    }
                        break;
                    case 3: switch (childPosition){
                        case 0:
                           one = new Intent();
                            one.putExtra("val",0);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            AcademicsActivity.this.startActivity(intent);
                            break;
                        case 1:
                           one = new Intent();
                            one.putExtra("val", 1);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                           // AcademicsActivity.this.startActivity(intent);
                            break;
                        case 2:
                           one = new Intent();
                            one.putExtra("val", 2);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 3:
                           one = new Intent();
                            one.putExtra("val", 3);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 4:
                           one = new Intent();
                            one.putExtra("val", 4);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 5:
                           one = new Intent();
                            one.putExtra("val", 5);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                           // AcademicsActivity.this.startActivity(intent);
                            break;
                        case 6:
                           one = new Intent();
                            one.putExtra("val", 6);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 7:
                           one = new Intent();
                            one.putExtra("val", 7);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                            //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 8:
                           one = new Intent();
                            one.putExtra("val",8);
                           one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                           // AcademicsActivity.this.startActivity(intent);
                            break;
                        case 9:
                            
                            one.putExtra("val",9);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                           //AcademicsActivity.this.startActivity(intent);
                            break;
                        case 10:
                           one = new Intent();
                            one.putExtra("val", 10);
                            one.setClass(AcademicsActivity.this,ThaiProgramsActivity.class);
                           // AcademicsActivity.this.startActivity(intent);
                            break;

                    }
                        break;
            }
                startActivity(one);

                return false;
            }
        });

        adapter = new MyExpandableListViewAdapter(this);

        expandableListView.setAdapter(adapter);
    }
    // 用过ListView的人一定很熟悉，只不过这里是BaseExpandableListAdapter
    class MyExpandableListViewAdapter extends BaseExpandableListAdapter
    {

        private Context context;

        public MyExpandableListViewAdapter(Context context)
        {
            this.context = context;
        }

        /**
         *
         * 获取组的个数
         *
         * @return
         * @see android.widget.ExpandableListAdapter#getGroupCount()
         */
        @Override
        public int getGroupCount()
        {
            return group_list.size();
        }

        /**
         *
         * 获取指定组中的子元素个数
         *
         * @param groupPosition
         * @return
         * @see android.widget.ExpandableListAdapter#getChildrenCount(int)
         */
        @Override
        public int getChildrenCount(int groupPosition)
        {
            return item_list.get(groupPosition).size();
        }

        /**
         *
         * 获取指定组中的数据
         *
         * @param groupPosition
         * @return
         * @see android.widget.ExpandableListAdapter#getGroup(int)
         */
        @Override
        public Object getGroup(int groupPosition)
        {
            return group_list.get(groupPosition);
        }

        /**
         *
         * 获取指定组中的指定子元素数据。
         *
         * @param groupPosition
         * @param childPosition
         * @return
         * @see android.widget.ExpandableListAdapter#getChild(int, int)
         */
        @Override
        public Object getChild(int groupPosition, int childPosition)
        {
            return item_list.get(groupPosition).get(childPosition);
        }

        /**
         *
         * 获取指定组的ID，这个组ID必须是唯一的
         *
         * @param groupPosition
         * @return
         * @see android.widget.ExpandableListAdapter#getGroupId(int)
         */
        @Override
        public long getGroupId(int groupPosition)
        {
            return groupPosition;
        }

        /**
         *
         * 获取指定组中的指定子元素ID
         *
         * @param groupPosition
         * @param childPosition
         * @return
         * @see android.widget.ExpandableListAdapter#getChildId(int, int)
         */
        @Override
        public long getChildId(int groupPosition, int childPosition)
        {
            return childPosition;
        }

        /**
         *
         * 组和子元素是否持有稳定的ID,也就是底层数据的改变不会影响到它们。
         *
         * @return
         * @see android.widget.ExpandableListAdapter#hasStableIds()
         */
        @Override
        public boolean hasStableIds()
        {
            return true;
        }

        /**
         *
         * 获取显示指定组的视图对象
         *
         * @param groupPosition 组位置
         * @param isExpanded 该组是展开状态还是伸缩状态
         * @param convertView 重用已有的视图对象
         * @param parent 返回的视图对象始终依附于的视图组
         * @return
         * @see android.widget.ExpandableListAdapter#getGroupView(int, boolean, View,
         *      ViewGroup)
         */
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
        {
            GroupHolder groupHolder = null;
            if (convertView == null)
            {
                convertView = LayoutInflater.from(context).inflate(R.layout.academics_expendlist_group, null);
                groupHolder = new GroupHolder();
                groupHolder.txt = (TextView)convertView.findViewById(R.id.textView_academicsExpendlistGroup1);
                groupHolder.img = (ImageView)convertView.findViewById(R.id.imageView_academicsExpendlistGroup);
                convertView.setTag(groupHolder);
            }
            else
            {
                groupHolder = (GroupHolder)convertView.getTag();
            }

            if (!isExpanded)
            {
                groupHolder.img.setBackgroundResource(R.drawable.academicgroupimg1);
            }
            else
            {
                groupHolder.img.setBackgroundResource(R.drawable.academicgroupimg2);
            }

            groupHolder.txt.setText(group_list.get(groupPosition));
            return convertView;
        }

        /**
         *
         * 获取一个视图对象，显示指定组中的指定子元素数据。
         *
         * @param groupPosition 组位置
         * @param childPosition 子元素位置
         * @param isLastChild 子元素是否处于组中的最后一个
         * @param convertView 重用已有的视图(View)对象
         * @param parent 返回的视图(View)对象始终依附于的视图组
         * @return
         * @see android.widget.ExpandableListAdapter#getChildView(int, int, boolean, View,
         *      ViewGroup)
         */
        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
        {
            ItemHolder itemHolder = null;
            if (convertView == null)
            {
                convertView = LayoutInflater.from(context).inflate(R.layout.academics_expendlist_item, null);
                itemHolder = new ItemHolder();
                itemHolder.txt = (TextView)convertView.findViewById(R.id.textView_academicsExpendlistItem);
                itemHolder.img = (ImageView)convertView.findViewById(R.id.imageView_academicsExpendlistItem);
                convertView.setTag(itemHolder);
            }
            else
            {
                itemHolder = (ItemHolder)convertView.getTag();
            }
            itemHolder.txt.setText(item_list.get(groupPosition).get(childPosition));
            itemHolder.img.setBackgroundResource(item_list2.get(groupPosition).get(childPosition));
            return convertView;
        }

        /**
         *
         * 是否选中指定位置上的子元素。
         *
         * @param groupPosition
         * @param childPosition
         * @return
         * @see android.widget.ExpandableListAdapter#isChildSelectable(int, int)
         */
        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition)
        {
            return true;
        }

    }

    class GroupHolder
    {
        public TextView txt;

        public ImageView img;
    }

    class ItemHolder
    {
        public ImageView img;

        public TextView txt;
    }


}
