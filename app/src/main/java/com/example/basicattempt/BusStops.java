package com.example.basicattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusStops extends AppCompatActivity {

    List<String> groupList;
    List<String> childList;
    Map<String,List<String>> hours;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stops);
        createGroupList();
        createCollection();
        expandableListView = findViewById(R.id.hours);
        expandableListAdapter = new MyExpandableListAdapter(this,groupList, hours);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int lastExpandedPosition = -1;
            @Override
            public void onGroupExpand(int i) {
                if(lastExpandedPosition != -1 && i != lastExpandedPosition)
                    expandableListView.collapseGroup(lastExpandedPosition);
                lastExpandedPosition = i;
            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                return true;
            }
        });
    }

    private void createCollection() {
        String[] daily = {"00.00", "01.30","02.00"};
        String[] saturday = {"10.00", "11.30","02.10"};
        String[] sunday = {"05.00", "01.30","02.50"};
        hours = new HashMap<String, List<String>>();
        for(String group : groupList){
            if(group.equals("Hafta İçi"))
                loadchild(daily);
            else if(group.equals("Cumartesi"))
                loadchild(saturday);
            else
                loadchild(sunday);
            hours.put(group,childList);
        }
    }

    private void loadchild(String[] day) {
        childList = new ArrayList<>();
        childList.addAll(Arrays.asList(day));
    }

    private void createGroupList() {
        groupList = new ArrayList<>();
        groupList.add("Hafta İçi");
        groupList.add("Cumartesi");
        groupList.add("Pazar");
    }
}