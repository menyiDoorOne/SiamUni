package android.siamuni.siamuni;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * 傅夕芮张晶完成按钮布局
 */
public class InfoFragment extends Fragment {

    public InfoFragment() {

    }

    public static InfoFragment newInstance() {
        InfoFragment fragment = new InfoFragment();
        return fragment;
    }

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;




    //viewpager
    private ViewPager view_pager;
    private LinearLayout ll_dotGroup;
    private TextView newsTitle;
    private int imgResIds[] = new int[]{R.drawable.p1, R.drawable.p2,
            R.drawable.p3, R.drawable.p4, R.drawable.p5};

    //存储5张图片
    private String textview[]=new String[]{"图片一","图片二"
            ,"图片三","图片四","图片五"};
    //存储5个目录
    private int curIndex = 0;
    //用来记录当前滚动的位置
    PicsAdapter picsAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void onActivityCreated(Bundle savedInstanceState) {

        b1 = getView().findViewById(R.id.btn1);
        b2 = getView().findViewById(R.id.btn2);
        b3 = getView().findViewById(R.id.btn3);
        b4 = getView().findViewById(R.id.btn4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), NewsActivity.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), SocialMediaActivity.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), CalenderActivity.class);
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), ContactUsActivity.class);
                startActivity(i4);
            }
        });


        super.onActivityCreated(savedInstanceState);
        setViewPager();
        View v = getView().findViewById(R.id.relay);//找到你要设透明背景的layout 的id
        v.getBackground().setAlpha(100);//0~255透明度值 ，0为完全透明，255为不透明

    }

    private void setViewPager() {
        newsTitle = getView().findViewById(R.id.picTitle);
        view_pager =  getView().findViewById(R.id.view_pager);
        ll_dotGroup = getView().findViewById(R.id.dotgroup);

        picsAdapter = new PicsAdapter(); // 创建适配器
        picsAdapter.setData(imgResIds);
        view_pager.setAdapter(picsAdapter); // 设置适配器

        view_pager.setOnPageChangeListener((ViewPager.OnPageChangeListener)
                new MyPageChangeListener()); //设置页面切换监听器
        initPoints(imgResIds.length); // 初始化图片小圆点
        startAutoScroll(); // 开启自动播放
    }
    // 初始化图片轮播的小圆点和目录
    private void initPoints(int count) {
        for (int i = 0; i < count; i++) {

            ImageView iv = new ImageView(getActivity());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    20, 20);
            params.setMargins(0, 0, 20, 0);
            iv.setLayoutParams(params);

            iv.setImageResource(R.drawable.dot1);

            ll_dotGroup.addView(iv);

        }
        ((ImageView) ll_dotGroup.getChildAt(curIndex))
                .setImageResource(R.drawable.dot2);

        newsTitle.setText(textview[curIndex]);
    }

    // 自动播放
    private void startAutoScroll() {
        ScheduledExecutorService scheduledExecutorService = Executors
                .newSingleThreadScheduledExecutor();
        // 每隔4秒钟切换一张图片
        scheduledExecutorService.scheduleWithFixedDelay(new ViewPagerTask(), 5,
                4, TimeUnit.SECONDS);
    }


    // 切换图片任务
    private class ViewPagerTask implements Runnable {
        @Override
        public void run() {

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    int count = picsAdapter.getCount();
                    view_pager.setCurrentItem((curIndex + 1) % count);
                }
            });
        }
    }


    // 定义ViewPager控件页面切换监听器
    class MyPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int position, float positionOffset,
                                   int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            ImageView imageView1 = (ImageView) ll_dotGroup.getChildAt(position);
            ImageView imageView2 = (ImageView) ll_dotGroup.getChildAt(curIndex);
            if (imageView1 != null) {
                imageView1.setImageResource(R.drawable.dot2);
            }
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.dot1);
            }
            curIndex = position;
            newsTitle.setText(textview[curIndex]);

        }


        boolean b = false;

        @Override
        public void onPageScrollStateChanged(int state) {
            //这段代码可不加，主要功能是实现切换到末尾后返回到第一张
            switch (state) {
                case 1:// 手势滑动
                    b = false;
                    break;
                case 2:// 界面切换中
                    b = true;
                    break;
                case 0:// 滑动结束，即切换完毕或者加载完毕
                    // 当前为最后一张，此时从右向左滑，则切换到第一张
                    if (view_pager.getCurrentItem() == view_pager.getAdapter()
                            .getCount() - 1 && !b) {
                        view_pager.setCurrentItem(0);
                    }
                    // 当前为第一张，此时从左向右滑，则切换到最后一张
                    else if (view_pager.getCurrentItem() == 0 && !b) {
                        view_pager.setCurrentItem(view_pager.getAdapter()
                                .getCount() - 1);
                    }
                    break;

                default:
                    break;
            }
        }
    }

    // 定义ViewPager控件适配器
    class PicsAdapter extends PagerAdapter {

        private List<ImageView> views = new ArrayList<ImageView>();


        public int getCount() {
            if (views == null) {
                return 0;
            }
            return views.size();
        }

        public void setData(int[] imgResIds) {
            for (int i = 0; i < imgResIds.length; i++) {
                ImageView iv = new ImageView(getActivity());
                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);
                iv.setLayoutParams(params);
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                //设置ImageView的属性

                iv.setImageResource(imgResIds[i]);
                views.add(iv);
            }
        }

        public Object getItem(int position) {
            if (position < getCount())
                return views.get(position);
            return null;
        }


        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }


        public void destroyItem(View container, int position, Object object) {

            if (position < views.size())
                ((ViewPager) container).removeView(views.get(position));
        }


        public int getItemPosition(Object object) {
            return views.indexOf(object);
        }


        public Object instantiateItem(View container, int position) {
            if (position < views.size()) {
                final ImageView imageView = views.get(position);
                ((ViewPager) container).addView(imageView);
                return views.get(position);
            }
            return null;
        }

    }
}



