package com.my.visionbuilder.activities.VisionPlatform.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.GoalsAdapters.GoalsAdapter;
import com.my.visionbuilder.adapters.VisionBuilder.UsersAdapter;
import com.my.visionbuilder.models.Goal;
import com.my.visionbuilder.models.User;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    RecyclerView users_Recyclerview;
    ArrayList<User> list;
    UsersAdapter adapter;
    RelativeLayout back_Sign;
    
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        users_Recyclerview = (RecyclerView) view.findViewById(R.id.users_Recyclerview);
        users_Recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        users_Recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<User>();
        adapter = new UsersAdapter(getActivity(), list);
        users_Recyclerview.setAdapter(adapter);
        loadUsers();
        back_Sign = view.findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }
    public void loadUsers() {
        User user = new User(1, ""+R.drawable.demo_user, "Callie Pearson");
        User user1 = new User(1, ""+R.drawable.demo_user, "Callie Pearson");
        User user2 = new User(1, ""+R.drawable.demo_user, "Callie Pearson");
        list.add(user);
        list.add(user1);
        list.add(user2);
        adapter.notifyDataSetChanged();
    }
}