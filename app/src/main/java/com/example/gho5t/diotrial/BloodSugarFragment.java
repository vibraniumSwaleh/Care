package com.example.gho5t.diotrial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BloodSugarFragment extends Fragment {
    View bloodSugarView;
    public BloodSugarFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        bloodSugarView =  inflater.inflate(R.layout.fragment_blood_sugar, container, false);

        //Sugar level submit button
        Button sugarLevelSubmitButton = (Button) bloodSugarView.findViewById(R.id.sugar_level_submit_buttom);

        sugarLevelSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast sugarLevelSubmitToast = Toast.makeText(getContext(), "Records submitted successfully!", Toast.LENGTH_LONG);
                sugarLevelSubmitToast.show();
            }
        });
        return bloodSugarView;
    }

}
