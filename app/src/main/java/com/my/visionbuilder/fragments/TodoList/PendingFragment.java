package com.my.visionbuilder.fragments.TodoList;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.GoalsAdapters.GoalsAdapter;
import com.my.visionbuilder.adapters.TodoListAdapters.TodoListAdapter;
import com.my.visionbuilder.models.Goal;
import com.my.visionbuilder.models.TodoList;

import java.util.ArrayList;

public class PendingFragment extends Fragment {

    RecyclerView todoList_Recyclerview;
    ArrayList<TodoList> list;
    TodoListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pending, container, false);
        todoList_Recyclerview = (RecyclerView) view.findViewById(R.id.todoList_Recyclerview);
        todoList_Recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        todoList_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<TodoList>();
        adapter = new TodoListAdapter(getActivity(), list);
        todoList_Recyclerview.setAdapter(adapter);
        loadTodoList();
        return view;
    }
    public void loadTodoList() {
        TodoList todoList = new TodoList(1, "going to gym", "24 Jan 2020", "03:49AM", "PENDING");
        list.add(todoList);
        adapter.notifyDataSetChanged();
    }
}