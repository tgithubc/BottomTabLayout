package com.tgithubc.view.lib;

import android.view.View;

public interface OnTabSelectedListener {

    void onTabSelected(int position, int prePosition);

    void onTabReselected(int position);

    void onCenterViewClicked(View centerView);
}