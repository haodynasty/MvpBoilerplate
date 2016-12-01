package com.blakequ.daggermyexample.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blakequ.daggermyexample.R;
import com.blakequ.daggermyexample.bean.BeanData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RibotsAdapter extends RecyclerView.Adapter<RibotsAdapter.RibotViewHolder> {

    private List<BeanData> mRibots;

    @Inject
    public RibotsAdapter() {
        mRibots = new ArrayList<>();
    }

    public void setRibots(List<BeanData> ribots) {
        mRibots = ribots;
    }

    @Override
    public RibotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_ribot, parent, false);
        return new RibotViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RibotViewHolder holder, int position) {
        BeanData ribot = mRibots.get(position);
        holder.hexColorView.setBackgroundColor(Color.parseColor(ribot.getHexColor()));
        holder.nameTextView.setText(ribot.getName());
        holder.emailTextView.setText(ribot.getEmail());
    }

    @Override
    public int getItemCount() {
        return mRibots.size();
    }

    class RibotViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.view_hex_color)
        View hexColorView;
        @BindView(R.id.text_name)
        TextView nameTextView;
        @BindView(R.id.text_email)
        TextView emailTextView;

        public RibotViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
