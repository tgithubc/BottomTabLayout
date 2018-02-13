package com.tgithubc.view.lib;

public interface OnTabSelectedListener {

    void onTabSelected(int position, int prePosition);

    void onTabReselected(int position);

    void onCenterViewClicked();
}