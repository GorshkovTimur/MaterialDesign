package com.timmyg.instaclient.fragments_for_tabActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.timmyg.instaclient.R;

public class Fragment3 extends Fragment {

    public Fragment3() {

    }

    public static Fragment3 newInstance(Bundle bundle){
        Fragment3 fr = new Fragment3();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs",args);
        fr.setArguments(args);
        return fr;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_2, container, false);
    }
}
