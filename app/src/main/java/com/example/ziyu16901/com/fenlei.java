package com.example.ziyu16901.com;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.TextView;


public class fenlei extends Fragment {


    private View mFenleiView;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mFenleiView = inflater.inflate(R.layout.fragment_fenlei, container, false);
        return mFenleiView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRecyclerView = (RecyclerView) mFenleiView.findViewById(R.id.fl);
//
        //使用线性布局LinearLayoutManger
        LinearLayoutManager manager = new LinearLayoutManager(mRecyclerView.getContext());
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);


  //      mRecyclerView.setAdapter(new FenleiAdapter(getActivity()));

        //创建adapter给recycleview填充内容
        mRecyclerView.setAdapter(new RecyclerView.Adapter() {


            //创建自定义类
            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView tv;

                //绑定子对象视图,关联TextView和ViewHolder
                public ViewHolder(TextView itemView) {
                    super(itemView);

                    tv=itemView;
                }
                //返回TextView
                public TextView getTv() {
                    return tv;
                }
            }

            @Override
            //创建ViewHoulder类
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                //创建ViewHoulder
                return new ViewHolder(new TextView(parent.getContext()));
            }

            @Override
            //给ViewHoulder赋值           ViewHolder                           索引确定子对象条数
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                 ViewHolder vh = (ViewHolder) holder;
//                vh.getTv().setText("item"+position);
                vh.getTv().setText(data[position]);
            }

            @Override
            //获取RecycleView子对象数量
            public int getItemCount() {
//                return 10;
                return data.length;}

              //定义数组
            private String[] data = new String[]{"文学艺术","体育休闲","社会实践","理论研究","技能培养","学术科技"};

        });






    }
}

