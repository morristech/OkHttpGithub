package com.codingblocks.okhttpgithub;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by harshitdwivedi on 10/03/18.
 */

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.MyHolder> {
    ArrayList<GithubUser> githubUsers;
    Context c;

    public JavaAdapter(ArrayList<GithubUser> githubUsers) {
        this.githubUsers = githubUsers;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        c = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        GithubUser githubUser = githubUsers.get(position);
        holder.userName.setText(githubUser.getName());
        holder.userUrl.setText(githubUser.getProfileUrl());
        holder.userScore.setText(githubUser.getScore());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(c,NewActivity.class);
//                c.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return githubUsers.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView userName, userUrl, userScore;
        View itemView;

        public MyHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            userName = itemView.findViewById(R.id.userLogin);
            userUrl = itemView.findViewById(R.id.userUrl);
            userScore = itemView.findViewById(R.id.userScore);
        }
    }
}
