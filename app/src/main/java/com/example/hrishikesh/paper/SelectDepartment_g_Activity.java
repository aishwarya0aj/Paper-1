package com.example.hrishikesh.paper;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.example.hrishikesh.paper.G_Scheme.Civil.CivilSemesterList_g_Activity;
import com.example.hrishikesh.paper.G_Scheme.Computer.CompSemesterList_g_Activity;
import com.example.hrishikesh.paper.G_Scheme.EnTc.EntcSemesterList_g_Activity;
import com.example.hrishikesh.paper.G_Scheme.IT.ITSemesterList_g_Activity;
import com.example.hrishikesh.paper.G_Scheme.Mechanical.MechSemesterList_g_Activity;

public class SelectDepartment_g_Activity extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4, cv5;
    TextView selectDepartment, comp, civil, mech, entc, it;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("G Scheme");
        setContentView(R.layout.activity_select_department_g_);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Scheme G Departments");
        setSupportActionBar(toolbar);*/

        cv1 = (CardView)findViewById(R.id.cv_comp);
        cv2 = (CardView)findViewById(R.id.cv_mech);
        cv3 = (CardView)findViewById(R.id.cv_civil);
        cv4 = (CardView)findViewById(R.id.cv_it);
        cv5 = (CardView)findViewById(R.id.cv_entc);

        selectDepartment = (TextView)findViewById(R.id.tv_select_department);
        comp = (TextView)findViewById(R.id.tv_comp);
        civil = (TextView)findViewById(R.id.tv_civil);
        mech = (TextView)findViewById(R.id.tv_mech);
        entc = (TextView)findViewById(R.id.tv_entc);
        it = (TextView)findViewById(R.id.tv_it);

        Typeface face1 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        selectDepartment.setTypeface(face1);
        Typeface face2 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp.setTypeface(face2);
        Typeface face3 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil.setTypeface(face3);
        Typeface face4 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        mech.setTypeface(face4);
        Typeface face5 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        entc.setTypeface(face5);
        Typeface face6 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        it.setTypeface(face6);


        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CompSemesterList_g_Activity.class);
                startActivity(i);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MechSemesterList_g_Activity.class);
                startActivity(i);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CivilSemesterList_g_Activity.class);
                startActivity(i);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EntcSemesterList_g_Activity.class);
                startActivity(i);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ITSemesterList_g_Activity.class);
                startActivity(i);
            }
        });
    }
}
