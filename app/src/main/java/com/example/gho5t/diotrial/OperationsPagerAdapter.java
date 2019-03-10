package com.example.gho5t.diotrial;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class OperationsPagerAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    public OperationsPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new BloodSugarFragment();
        }else if (position == 1){
            return new MealsFragment();
        }else if (position == 2){
            return new ChatFragment();
        }else if (position == 3){
            return new InformationFragment();
        } return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sugar_levels);
        }else if (position == 1){
            return mContext.getString(R.string.meals);
        }else if (position == 2){
            return mContext.getString(R.string.chats);
        }else if (position == 3){
            return mContext.getString(R.string.information);
        }return null;
    }
}
