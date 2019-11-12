package com.example.englishlearning.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.englishlearning.R;
import com.example.englishlearning.SentanceFragment;
import com.example.englishlearning.WordsFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    private Object Fragment;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

//    public SectionsPagerAdapter(LearnEnglishActivity context, androidx.fragment.app.FragmentManager supportFragmentManager) {
//        super(context, supportFragmentManager);
//    }

    @Override
    public androidx.fragment.app.Fragment getItem(int position) {

        Fragment fragment= null;
        switch (position){
            case 0:
                fragment = new WordsFragment();
                break;
            case 1:
                fragment=new SentanceFragment();
                break;

        }

        return (androidx.fragment.app.Fragment) Fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}