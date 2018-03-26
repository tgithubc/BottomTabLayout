package com.tgithubc.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tgithubc.view.lib.BottomTabItemView;
import com.tgithubc.view.lib.BottomTabLayout;
import com.tgithubc.view.lib.OnTabSelectedListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "BottomTabLayout";

    private BottomTabLayout mBottomTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomTabLayout = (BottomTabLayout) findViewById(R.id.tab_layout);
        mBottomTabLayout.createAdapter()
                .addTab(newTab("我的", R.mipmap.home_normal, R.mipmap.home_selected))
                .addTab(newTab("精选", R.mipmap.mine_normal, R.mipmap.mine_selected))
                .addTab(newTab("排行", R.mipmap.service_normal, R.mipmap.service_selected))
                .addTab(newTab("设置", R.mipmap.category_normal, R.mipmap.category_selected))
                .build();
        mBottomTabLayout.setRedDot(3);
        mBottomTabLayout.setSelected(1);
        mBottomTabLayout.setMessage(0, 8);
        mBottomTabLayout.addOnTabSelectedListener(

                new OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(int position, int prePosition) {
                        Log.d(TAG, "onTabSelected  position: " + position
                                + ",prePosition: " + prePosition
                                + ",message: " + mBottomTabLayout.getTabByIndex(position).getUnReadMessage()
                        );
                    }

                    @Override
                    public void onTabReselected(int position) {
                        Log.d(TAG, "onTabReselected:" + position);
                    }

                    @Override
                    public void onCenterViewClicked(View centerView) {
                        Log.d(TAG, "onCenterViewClicked");
                    }
                });
    }

    private BottomTabItemView newTab(String text, int normalDrawable, int checkedDrawable) {
        BottomTabItemView itemView = new BottomTabItemView(this);
        itemView.initialize(text, normalDrawable, checkedDrawable);
        return itemView;
    }
}
