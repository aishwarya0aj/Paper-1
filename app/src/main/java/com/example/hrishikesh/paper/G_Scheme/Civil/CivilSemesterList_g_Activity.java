package com.example.hrishikesh.paper.G_Scheme.Civil;

import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hrishikesh.paper.R;

public class CivilSemesterList_g_Activity extends AppCompatActivity {

    CardView sem1, sem2, sem3, sem4, sem5, sem6;
    TextView selectsemester, civil_sem1, civil_sem2, civil_sem3, civil_sem4, civil_sem5,civil_sem6;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Civil G Scheme ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_semester_list_g_);
        initialize();
        setFont();
        clickListener();
    }

    public void initialize()
    {
        //need to change id --> 'civil' from 'comp' in xml file
        sem1 = (CardView)findViewById(R.id.comp_sem1);
        sem2 = (CardView)findViewById(R.id.comp_sem2);
        sem3 = (CardView)findViewById(R.id.comp_sem3);
        sem4 = (CardView)findViewById(R.id.comp_sem4);
        sem5 = (CardView)findViewById(R.id.comp_sem5);
        sem6 = (CardView)findViewById(R.id.comp_sem6);

        selectsemester = (TextView)findViewById(R.id.tv_civil_select_semester);
        civil_sem1 = (TextView)findViewById(R.id.tv_civil_sem1);
        civil_sem2 = (TextView)findViewById(R.id.tv_civil_sem2);
        civil_sem3 = (TextView)findViewById(R.id.tv_civil_sem3);
        civil_sem4 = (TextView)findViewById(R.id.tv_civil_sem4);
        civil_sem5 = (TextView)findViewById(R.id.tv_civil_sem5);
        civil_sem6 = (TextView)findViewById(R.id.tv_civil_sem6);
    }

    public void setFont()
    {
        Typeface face1 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        selectsemester.setTypeface(face1);
        Typeface face2 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem1.setTypeface(face2);
        Typeface face3 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem2.setTypeface(face3);
        Typeface face4 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem3.setTypeface(face4);
        Typeface face5 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem4.setTypeface(face5);
        Typeface face6 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem5.setTypeface(face6);
        Typeface face7 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        civil_sem6.setTypeface(face7);
    }

    public void clickListener()
    {
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://knowhj.000webhostapp.com/Papers/Semester1.zip");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);

                Toast.makeText(CivilSemesterList_g_Activity.this, "Downloading....", Toast.LENGTH_SHORT).show();

            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://knowhj.000webhostapp.com/Papers/Semester2.zip");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
                Toast.makeText(CivilSemesterList_g_Activity.this, "Downloading....", Toast.LENGTH_SHORT).show();

            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CivilSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CivilSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CivilSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CivilSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
