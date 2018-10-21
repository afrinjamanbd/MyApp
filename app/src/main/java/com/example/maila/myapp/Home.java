package com.example.maila.myapp;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    View homeview;
    ViewPager viewPager;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    private int[] tabIcons = {
            R.drawable.ic_frag_req,
            R.drawable.ic_frag_list,
            R.drawable.ic_frag_loc};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeview= inflater.inflate(R.layout.home,container,false);

        tabLayout = (TabLayout) homeview.findViewById(R.id.tabs);
        appBarLayout = (AppBarLayout) homeview.findViewById(R.id.AppBarLayout);
        viewPager = (ViewPager) homeview.findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());

        adapter.AddFragment(new Tab1(),"Requests");
        adapter.AddFragment(new Tab2(),"Item List");
        adapter.AddFragment(new Tab3(),"Location");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons(); //for icon
        return homeview;
    }

    //for icon
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter{

        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> FragmentlistTitles = new ArrayList<>();

        public ViewPagerAdapter (FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return FragmentlistTitles.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return FragmentlistTitles.get(position);
        }

        public void AddFragment (Fragment fragment,String Title){

            fragmentList.add(fragment);
            FragmentlistTitles.add(Title);
        }
    }
}
