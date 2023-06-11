package com.example.imagefetcherfrominternet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_activirt);
        ImageView imageView = findViewById(R.id.imageView);
        String url = getIntent().getStringExtra("url");

        Picasso.get()
                .load(url)
                .error(R.drawable.errorimage)
                .into(imageView);

    }
}