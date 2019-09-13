package com.teknar.teknarscrum;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                ToDoFragment toDoFragment =new ToDoFragment();
                return toDoFragment;

            case 1:

                DoingFragment doingFragment= new DoingFragment();
                return  doingFragment;

            case 2:

                DoneFragment  doneFragment =new DoneFragment();
                return  doneFragment;

            default:
                return null;
        }




    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "YAPILACAK";

            case 1:
                return "YAPILIYOR";

            case  2:

                return "YAPILDI";

            default:

                return null;

        }



    }
}
