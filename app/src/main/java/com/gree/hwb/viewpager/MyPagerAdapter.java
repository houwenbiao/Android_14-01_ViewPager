package com.gree.hwb.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class MyPagerAdapter extends PagerAdapter
{

	private List<View> viewsList;
	private List<String> titleList;
	public MyPagerAdapter(List<View> mviewsList,List<String> mtitleList)
	{
		this.viewsList = mviewsList;
		this.titleList = mtitleList;
	}
	//返回要滑动的View的个数
	@Override
	public int getCount()
	{
		return viewsList.size();
	}
	//从当前container中删除指定位置（position）的View
	@Override
	public void destroyItem(ViewGroup container, int position, Object object)
	{
		container.removeView(viewsList.get(position));
	}
	//做了两件事，第一：将当前视图添加到container中，第二：返回当前View
	@Override
	public Object instantiateItem(ViewGroup container, int position)
	{
		container.addView(viewsList.get(position));
		return viewsList.get(position);
	}

	@Override
	public boolean isViewFromObject(View view, Object object)
	{
		return view == object;//必须是view==object
	}

	//标题的获取，是重写适配器的getPageTitle(int)函数来获取的
	@Override
	public CharSequence getPageTitle(int position)
	{
		return titleList.get(position);
	}
}
