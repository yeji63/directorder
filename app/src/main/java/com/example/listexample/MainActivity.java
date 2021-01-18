package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    listAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Data> list = new ArrayList<>();
        list.add(new Data(0,"제목1", "내용내용"));
        list.add(new Data(0,"제목2", "내용내용"));
        list.add(new Data(0,"제목3", "내용내용"));
        list.add(new Data(1,"제목4", "내용내용"));
        list.add(new Data(1,"제목5", "내용내용"));

        listView = findViewById(R.id.listview);
        adapter = new listAdapter(list);

        listView.setAdapter(adapter);
    }

    class listAdapter extends BaseAdapter{
        List<Data> lists;

        public listAdapter(List<Data> lists) {
            this.lists = lists;
        }

        @Override
        public int getCount() {
            return lists.size();
        }

        @Override
        public Object getItem(int i) {
            return lists.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = view;
            if(v==null){
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = inflater.inflate(R.layout.list_card, null);
            }

            TextView tvTitle = v.findViewById(R.id.tv_title);
            TextView tvContent = v.findViewById(R.id.tv_content);

            Data data = lists.get(i);

            tvTitle.setText(data.getTitle());
            tvContent.setText(data.getContent());

            if(data.getCategory()==0){
                tvTitle.setBackgroundColor(Color.WHITE);
            }else{
                tvTitle.setBackgroundColor(Color.LTGRAY);
            }

            return v;
        }
    }
}