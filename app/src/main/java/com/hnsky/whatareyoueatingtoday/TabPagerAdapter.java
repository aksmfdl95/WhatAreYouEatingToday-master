package com.hnsky.whatareyoueatingtoday;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {

      switch (position){
          case 0:
              return new TabFragment1();
          case 1:
              return new TabFragment2();
          case 2:
              return new TabFragment3();

              default:
                  return null;
      }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
