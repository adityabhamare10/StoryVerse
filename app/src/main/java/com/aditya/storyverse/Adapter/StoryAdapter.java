package com.aditya.storyverse.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.storyverse.Model.StoryModel;
import com.aditya.storyverse.R;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder>{


    ArrayList<StoryModel> list;
    Context context;

    public StoryAdapter(ArrayList<StoryModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_story_design, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        StoryModel model = list.get(position);
        holder.storyImg.setImageResource(model.getStory());
        holder.profilePic.setImageResource(model.getProfilePic());
        holder.storyType.setBackgroundResource(model.getStoryType());
        holder.nameOfUser.setText(model.getNameOfUser());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView storyImg, profilePic;
        View storyType;
        TextView nameOfUser;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            storyImg = itemView.findViewById(R.id.story);
            profilePic = itemView.findViewById(R.id.profilePic);
            storyType = itemView.findViewById(R.id.storyType);
            nameOfUser = itemView.findViewById(R.id.nameOfUser);

        }
    }

}
