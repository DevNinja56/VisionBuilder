package com.my.visionbuilder.activities.VisionPlatform.ui.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.adapters.Transportation.TransportationAdapter;
import com.my.visionbuilder.adapters.VisionBuilder.ChatUsersAdapter;
import com.my.visionbuilder.models.Transportation;
import com.my.visionbuilder.models.User;

import java.util.ArrayList;


public class ChatsFragment extends Fragment {

    RelativeLayout back_Sign;
    RecyclerView recyclerview;
    ArrayList<User> list;
    ChatUsersAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setNestedScrollingEnabled(false);
        list = new ArrayList<User>();
        adapter = new ChatUsersAdapter(getActivity(), list);
        recyclerview.setAdapter(adapter);
        loadData();
        back_Sign = view.findViewById(R.id.back_Sign);
        back_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }
    public void loadData() {
        User user = new User(1, "", "");
        User user1 = new User(1, "", "");
        User user2 = new User(1, "", "");
        list.add(user);
        list.add(user1);
        list.add(user2);
        adapter.notifyDataSetChanged();
    }
}