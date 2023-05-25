package com.example.curd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<UserItem> userItemArrayList;

    public UserRecyclerAdapter(Context context, ArrayList<UserItem> userItemArrayList) {
        this.context = context;
        this.userItemArrayList = userItemArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.usert_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textName;
        TextView textEmail;
        TextView textCountry;
        Button buttonDelete;
        Button buttonUpdate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            textEmail = itemView.findViewById(R.id.textEmail);
            buttonDelete = itemView.findViewById(R.id.buttonDelete);
            buttonUpdate = itemView.findViewById(R.id.buttonUpdate);

        }
    }
}
