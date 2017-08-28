package com.baoyz.recyclerviewdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Fragment extends android.support.v4.app.Fragment{
	
	    @SuppressLint("NewApi")
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        View view = inflater.inflate(R.layout.fragment, container, false);
	        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_vertical);
	    

	        // 创建数据集
	        /*
	        String[] dataset = new String[20];
	        for (int i = 0; i < 20; i++){
	            dataset[i] = "position：" + i;
	        }
	        */
	        // 创建Adapter，并指定数据集
	        MyAdapter adapter = new MyAdapter();
	        // 设置Adapter
	        recyclerView.setAdapter(adapter);
	        
	        return view;
	        
	    }
	    
	    public void initVertical(){
	        

	        
	    }

}
