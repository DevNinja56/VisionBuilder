package com.my.visionbuilder.adapters.TodoListAdapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.TodoList.TaskDetailsActivity;
import com.my.visionbuilder.adapters.TodoListAdapters.TodoListAdapter;
import com.my.visionbuilder.models.TodoList;

import java.util.ArrayList;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.MyViewHolder>{
    Context context;
    ArrayList<TodoList> list;
    private TodoListAdapter.OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(TodoListAdapter.OnItemClickListener listener) {
        mListener = listener;
    }
    public TodoListAdapter(Context context, ArrayList<TodoList> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public TodoListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TodoListAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.todo_list_item, parent, false));
    }
    public void onBindViewHolder(@NonNull final TodoListAdapter.MyViewHolder holder, final int position) {
        holder.todolist_Title.setText(list.get(position).getTodoList_Title());
        holder.todolist_DateTime.setText(list.get(position).getTodoList_Date() + "  |  " + list.get(position).getTodoList_Time());
        holder.todo_ListItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TaskDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView todolist_Title, todolist_DateTime;
        RelativeLayout todo_ListItem;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            todolist_Title = itemView.findViewById(R.id.todolist_Title);
            todolist_DateTime = itemView.findViewById(R.id.todolist_DateTime);
            todo_ListItem = itemView.findViewById(R.id.todo_ListItem);
            todo_ListItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
