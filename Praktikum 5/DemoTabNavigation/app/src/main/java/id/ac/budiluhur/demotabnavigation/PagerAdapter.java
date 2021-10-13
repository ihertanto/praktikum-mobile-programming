package id.ac.budiluhur.demotabnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentActivity fragment, int NumOfTabs) {
        super(fragment);
        mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new TabTopStories();
            case 1: return new TabTechNews();
            case 2: return new TabCooking();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return mNumOfTabs;
    }
}
