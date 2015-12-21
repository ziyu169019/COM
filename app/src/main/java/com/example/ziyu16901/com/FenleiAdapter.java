package com.example.ziyu16901.com;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 16901 on 2015/12/20.
 */
class FenleiAdapter extends RecyclerView.Adapter {


    //创建自定义类
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        //绑定子对象视图,关联TextView和ViewHolder
        public ViewHolder(TextView itemView) {
            super(itemView);

            tv = itemView;
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
        return data.length;
    }

    //定义数组
    private String[] data = new String[]{"文学艺术", "体育休闲", "社会实践", "理论研究", "技能培养", "学术科技"};

}
