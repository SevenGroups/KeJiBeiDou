package com.bw.com.keji;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bw.com.keji.Keji.Kejiquan;
import com.bw.com.keji.Tongxin.Tongxinlu;
import com.bw.com.keji.Wode.Wd;
import com.bw.com.keji.ZIxun.Zixun;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {
    private BottomTabBar mb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mb=(BottomTabBar)findViewById(R.id.bottom_tab_bar);
         mb.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.DKGRAY)
                .addTabItem("咨询",R.drawable.shouye1, Zixun.class)
                .addTabItem("科技圈",R.drawable.daishouhuo, Kejiquan.class)
                .addTabItem("通讯录",R.drawable.faxian1, Tongxinlu.class)
                .addTabItem("我的 ",R.drawable.wode1, Wd.class)
                .isShowDivider(true);

    }
}
