package com.example.gho5t.diotrial;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LogInPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public LogInPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new SignInFragment();
        } else if (position == 1){
            return new SignUpFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sign_in);
        } else {
            return mContext.getString(R.string.sign_up);
        }
    }
}
