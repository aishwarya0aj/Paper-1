package com.example.hrishikesh.paper.G_Scheme.Computer;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hrishikesh.paper.R;

public class CompSemesterList_g_Activity extends AppCompatActivity {

    CardView sem1, sem2, sem3, sem4, sem5, sem6;
    TextView selectsemester, comp_sem1, comp_sem2, comp_sem3, comp_sem4, comp_sem5,comp_sem6;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Comp G Scheme ");
        setContentView(R.layout.activity_comp_semester_list_g_);

        initialization();
        setFont();
        clickListners();


    }

    public void initialization()
    {
        sem1 = (CardView)findViewById(R.id.comp_sem1);
        sem2 = (CardView)findViewById(R.id.comp_sem2);
        sem3 = (CardView)findViewById(R.id.comp_sem3);
        sem4 = (CardView)findViewById(R.id.comp_sem4);
        sem5 = (CardView)findViewById(R.id.comp_sem5);
        sem6 = (CardView)findViewById(R.id.comp_sem6);

        selectsemester = (TextView)findViewById(R.id.tv_comp_select_semester);
        comp_sem1 = (TextView)findViewById(R.id.tv_comp_sem1);
        comp_sem2 = (TextView)findViewById(R.id.tv_comp_sem2);
        comp_sem3 = (TextView)findViewById(R.id.tv_comp_sem3);
        comp_sem4 = (TextView)findViewById(R.id.tv_comp_sem4);
        comp_sem5 = (TextView)findViewById(R.id.tv_comp_sem5);
        comp_sem6 = (TextView)findViewById(R.id.tv_comp_sem6);
    }

    public void setFont()
    {
        Typeface face1 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        selectsemester.setTypeface(face1);
        Typeface face2 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem1.setTypeface(face2);
        Typeface face3 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem2.setTypeface(face3);
        Typeface face4 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem3.setTypeface(face4);
        Typeface face5 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem4.setTypeface(face5);
        Typeface face6 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem5.setTypeface(face6);
        Typeface face7 = Typeface.createFromAsset(getAssets(),"fonts/CenturyGothic.ttf");
        comp_sem6.setTypeface(face7);
    }

    public void clickListners()
    {
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://knowhj.000webhostapp.com/Papers/Semester1.zip");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
                Toast.makeText(CompSemesterList_g_Activity.this, "Downloading....", Toast.LENGTH_SHORT).show();

            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder a_builder = new AlertDialog.Builder(CompSemesterList_g_Activity.this);
                a_builder.setMessage("This will download a zip file which will contain all papers." +
                                    " Are you sure want to continue?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("http://knowhj.000webhostapp.com/Papers/Semester2.zip");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                        Toast.makeText(CompSemesterList_g_Activity.this, "Downloading....", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = a_builder.create();
                alertDialog.setTitle("Alert!!");
                alertDialog.show();
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CompSemesterList_g_Activity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
