package com.example.zoeoeh.ETuner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Zoe Wall on 21/03/2016.
 * Pager Adapter created to return correct fragment when clicked.
 */
public class PageAdapt extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PageAdapt(FragmentManager fragMan, int tabNums)
    {
        super(fragMan);
        this.numberOfTabs = tabNums;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                Recorder tab1 = new Recorder();
                return tab1;
            case 1:
                PlayTune tab2 = new PlayTune();
                return tab2;
            case 2:
                OpenGLClass tab3 = new OpenGLClass();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return numberOfTabs;
    }


}
