package com.daniela.parstagram;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.parse.ParseFile;

import org.parceler.Parcels;

import java.util.Date;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private Context context;
    private List<Post> posts;

    public PostsAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.bind(post);
    }

    // Clean all elements of the recycler
    public void clear() {
        posts.clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvUsername;
        private TextView tvDescription;
        private TextView tvProfileNameDescription;
        private TextView tvTimestamp;
        private ImageView ivProfilePic;
        private ImageView ivImage;
        private ImageButton btnLike;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tvUsername);
            ivImage = itemView.findViewById(R.id.ivImage);
            ivProfilePic = itemView.findViewById(R.id.ivProfilePic);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvProfileNameDescription = itemView.findViewById(R.id.tvProfileNameDescription);
            tvTimestamp = itemView.findViewById(R.id.tvTimestamp);
            itemView.setOnClickListener(this);
            btnLike = itemView.findViewById(R.id.btnLike);
        }



        @Override
        public void onClick(View v){
            Log.i("PostsAdapter", "click");
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Post post = posts.get(position);
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(Post.class.getSimpleName(), Parcels.wrap(post));
                context.startActivity(intent);
            }
        }
        public void bind(Post post) {
            // Bind the post data to the view elements
            tvDescription.setText(post.getDescription());
            tvUsername.setText(post.getUser().getUsername());
            tvProfileNameDescription.setText(post.getUser().getUsername());
            Date createdAt = post.getCreatedAt();
            tvTimestamp.setText(Post.calculateTimeAgo(createdAt));
            ParseFile image = post.getImage();
            if (image != null) {
                Glide.with(context).load(image.getUrl()).into(ivImage);
            }
            ParseFile profile = post.getUser().getParseFile("profilepicture");
            if (profile != null) {
                Glide.with(context).load(profile.getUrl()).circleCrop().into(ivProfilePic);
            }
        }

        // Add a list of items -- change to type used
        public void addAll(List<Post> list) {
            posts.addAll(list);
            notifyDataSetChanged();
        }
    }
}