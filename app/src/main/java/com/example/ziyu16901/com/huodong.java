package com.example.ziyu16901.com;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class huodong extends Fragment {

    private View mhuodongView;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mhuodongView = inflater.inflate(R.layout.fragment_fenlei, container, false);
        return mhuodongView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView = (RecyclerView) mhuodongView.findViewById(R.id.fl);
//
        //使用线性布局LinearLayoutManger
        LinearLayoutManager manager = new LinearLayoutManager(mRecyclerView.getContext());
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);


        //      mRecyclerView.setAdapter(new FenleiAdapter(getActivity()));

        //创建adapter给recycleview填充内容
        mRecyclerView.setAdapter(new HuodongAdapter());






    }

}
