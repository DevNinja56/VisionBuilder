package com.my.visionbuilder.fragments.VisionBoard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.VisionBuilder.ChatUsersAdapter;
import com.my.visionbuilder.adapters.VisionBuilder.MyVisionBoardAdapter;
import com.my.visionbuilder.models.Post;
import com.my.visionbuilder.models.User;

import java.util.ArrayList;

public class MyVisionBoardFragment extends Fragment {

    RecyclerView recyclerview;
    ArrayList<Post> list;
    MyVisionBoardAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_vision_board, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(staggeredGridLayoutManager);
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<Post>();
        adapter = new MyVisionBoardAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        return view;
    }
    public void loadData() {
        Post post = new Post(1, "");
        Post post1 = new Post(1, "");
        Post post2 = new Post(1, "");
        list.add(post);
        list.add(post1);
        list.add(post2);
        adapter.notifyDataSetChanged();
    }
}