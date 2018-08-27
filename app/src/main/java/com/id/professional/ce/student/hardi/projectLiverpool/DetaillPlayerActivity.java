package com.id.professional.ce.student.hardi.projectLiverpool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetaillPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Player playermasuk = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView club = (TextView)findViewById(R.id.tv_item_club);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView posisi = (TextView)findViewById(R.id.content_posisi);

        Glide.with(this).load(playermasuk.getPhoto()).override(350,550).into(gambar);
        name.setText(playermasuk.getName());
        club.setText(playermasuk.getClub());
        deskripsi.setText(playermasuk.getDeskripsi());
        lahir.setText(playermasuk.getLahir());
        posisi.setText(playermasuk.getPosisi());

        Log.i("photo", playermasuk.getPhoto());
        Log.i("deskripsi", playermasuk.getDeskripsi());
    }


}
