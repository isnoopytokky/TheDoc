package com.project.thedoc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Pariwat on 10/3/2558.
 */
public class AppointmentDate extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.appointment_date, container, false);

        Button btn_yes_ad = (Button) rootview.findViewById(R.id.btn_yes_ap);
        Button btn_no_ad = (Button) rootview.findViewById(R.id.btn_no_ap);

        btn_yes_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment objFragment = null;
                switch (v.getId()) {
                    case R.id.btn_yes_ap:
                        objFragment = new AskResponse();
                        break;
                }
                // update the main content by replacing fragments
                FragmentManager fragmentManager =getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, objFragment)
                        .commit();
            }
        });

        btn_no_ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment objFragment = null;
                switch (v.getId()) {
                    case R.id.btn_no_ap:
                        objFragment = new AskResponse();
                        break;
                }
                // update the main content by replacing fragments
                FragmentManager fragmentManager =getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, objFragment)
                        .commit();
            }
        });

        return rootview;
    }

}
