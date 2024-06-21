package com.app.retrofitdata.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.retrofitdata.MainActivity;
import com.app.retrofitdata.Model.userModel;
import com.app.retrofitdata.R;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userHolder> {
    MainActivity mainActivity;
    List<userModel> alluserList;

    public userAdapter(MainActivity mainActivity, List<userModel> alluserList) {
        this.mainActivity = mainActivity;
        this.alluserList = alluserList;
    }

    @NonNull
    @Override
    public userAdapter.userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item_user, parent, false);
        return new userHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userAdapter.userHolder holder, int position) {
        holder.textView.setText(alluserList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return alluserList.size();
    }

    public class userHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public userHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
