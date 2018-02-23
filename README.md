![image](https://github.com/tgithubc/BottomTabLayout/blob/master/splash/1.jpg)

BottomTabLayout is a Simple,elegant bottom tab indicator layout.

## Usage
Add to your layout xml-file:

```xml
    <com.tgithubc.view.lib.BottomTabLayout
        android:id="@+id/tab_layout"
        android:layout_width="match_parent"
        android:layout_height="55dp"
        android:layout_alignParentBottom="true"
        />
```
you can also add other attribute in XML:


Attribute | Value
------------ | -------------
bottom_tab_item_text_size | text size
bottom_tab_item_text_selected_color | selected text color
bottom_tab_item_text_normal_color | normal text color
bottom_tab_item_icon_size | icon size
bottom_tab_item_message_bkg_color | message background color
bottom_tab_item_message_text_size | message text size
bottom_tab_item_message_tip_text_color | message text color
bottom_tab_item_red_dot_size | red dot size
bottom_tab_item_red_dot_size | red dot size
bottom_tab_center_view | center view layout id
bottom_tab_center_view_width | center view layout width



Call the methods in java code:
```java
        mBottomTabLayout = view.findViewById(R.id.tab_layout);
        mBottomTabLayout.createAdapter()
                .addTab(newItem("微信", R.drawable.home_normal, R.drawable.home_selected))
                .addTab(newItem("通讯录", R.drawable.category_normal, R.drawable.category_selected))
                .addTab(newItem("发现", R.drawable.service_normal, R.drawable.service_selected))
                .addTab(newItem("我", R.drawable.mine_normal, R.drawable.mine_selected))
                .creat();
```

Add TabSelectedListener:
```java
 mBottomTabLayout.addOnTabSelectedListener(
                new OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(int position, int prePosition) {
                    
                    }

                    @Override
                    public void onTabReselected(int position) {
                    
                    }

                    @Override
                    public void onCenterViewClicked() {
                    
                    }
                });
```

Set Message or RedDot:
```java
        mBottomTabLayout.setRedDot(index);
        mBottomTabLayout.setMessage(index, messageCount);
       
```


## License

    The MIT License (MIT)

    Copyright (c) 2017 tgithubc

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
