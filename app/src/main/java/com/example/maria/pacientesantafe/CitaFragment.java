package com.example.maria.pacientesantafe;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maria on 11/05/2017.
 */

public class CitaFragment extends Fragment
{
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    myView = inflater.inflate(R.layout.main_activity, container, false);
        return myView;
    }
}
