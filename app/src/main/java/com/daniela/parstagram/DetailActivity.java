package com.daniela.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import org.parceler.Parcels;

import java.util.Date;

public class DetailActivity extends AppCompatActivity {
    Post post;
    TextView tvUser;
    TextView tvRelativeTime;
    TextView tvProfileNameDescription;
    TextView tvDescription;
    ImageView ivImage;
    ImageView ivProfilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Get elements
        tvUser = findViewById(R.id.tvUser);
        tvRelativeTime = findViewById(R.id.tvRelativeTime);
        tvDescription = findViewById(R.id.tvDescription);
        tvProfileNameDescription = findViewById(R.id.tvProfileNameDescription);
        ivImage = findViewById(R.id.ivImage);
        ivProfilePic = findViewById(R.id.ivProfilePic);

        //Set elements
        Post post = (Post) Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));
        tvUser.setText(post.getUser().getUsername());
        tvProfileNameDescription.setText(post.getUser().getUsername());
        tvDescription.setText(post.getDescription());
        Glide.with(this).load(post.getImage().getUrl()).into(ivImage);
        Date createdAt = post.getCreatedAt();
        tvRelativeTime.setText(Post.calculateTimeAgo(createdAt));
        ParseFile image = post.getImage();
        if (image != null) {
            Glide.with(DetailActivity.this).load(image.getUrl()).into(ivImage);
        }
        ParseFile profile = post.getUser().getParseFile("profilepicture");
        if (profile != null) {
            Glide.with(DetailActivity.this).load(profile.getUrl()).circleCrop().into(ivProfilePic);
        }
    }
}