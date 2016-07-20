package com.gree.hwb.viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
	ViewPager viewPager;
	PagerTabStrip pagerTabStrip;
	View view1,view2,view3;
	List<View> viewsList = new ArrayList<>();
	List<String> titleList = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//关联viewPager控件
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		pagerTabStrip = (PagerTabStrip) findViewById(R.id.pts);

		//为PagerTabStrip设置属性
//		pagerTabStrip.setBackgroundColor(Color.WHITE);
		pagerTabStrip.setTextColor(Color.GRAY);
//		pagerTabStrip.setTabIndicatorColor(0xffffff);
//		pagerTabStrip.setDrawFullUnderline(f
//				pagerTabStrip.setTabIndicatorColor(Color.GREEN);alse);

		//获取布局填充器
		LayoutInflater layoutInflater = getLayoutInflater();
		//动态绑定view
		view1 = layoutInflater.inflate(R.layout.layout1,null);
		view2 = layoutInflater.inflate(R.layout.layout2,null);
		view3 = layoutInflater.inflate(R.layout.layout3,null);
		//将需要显示的view加入集合中
		viewsList.add(view1);
		viewsList.add(view2);
		viewsList.add(view3);
		//将要显示的标题添加到集合中
		titleList.add("pager1");
		titleList.add("pager2");
		titleList.add("pager3");
		viewPager.setAdapter(new MyPagerAdapter(viewsList,titleList));
	}
}


















