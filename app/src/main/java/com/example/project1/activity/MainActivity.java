package com.example.project1.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.R;
import com.example.project1.adapters.CustomAdapter;
import com.example.project1.models.Member;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        refreshAdapter(prepareMemberList());

    }

    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recycler_view);
    }

    void refreshAdapter(ArrayList<Member> members) {
        CustomAdapter customAdapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(customAdapter);
    }

    ArrayList<Member> prepareMemberList() {
        ArrayList<Member> members = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            members.add(new Member("Muhammadrizo" + i, "Nurullaxo'jayev" + i));
        }
        return members;
    }

}