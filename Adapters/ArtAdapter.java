package com.prism.pickany247.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.prism.pickany247.R;
import com.prism.pickany247.Response.HomeResponse;
import com.prism.pickany247.Response.StationeryResponse;
import com.prism.pickany247.StationeryModule.ProductDetailsActivity;
import com.prism.pickany247.StationeryModule.StationeryHomeActivity;

import java.util.List;

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.MyViewHolder>{
    private Context mContext;
    private List<StationeryResponse.FilteredProductsBean> homeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView thumbnail;
        public TextView txtPrice,txtName;
        public LinearLayout linearLayout;


        public MyViewHolder(View view) {
            super(view);

            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            txtPrice = (TextView) view.findViewById(R.id.txtproductPrice);
            txtName = (TextView) view.findViewById(R.id.txtproductName);
            linearLayout=(LinearLayout)view.findViewById(R.id.parentLayout);


        }
    }

    public ArtAdapter(Context mContext, List<StationeryResponse.FilteredProductsBean> homekitchenList) {
        this.mContext = mContext;
        this.homeList = homekitchenList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.stationery_home_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final StationeryResponse.FilteredProductsBean home = homeList.get(position);

        // loading album cover using Glide library
        Glide.with(mContext).load(home.getImagePath()+home.getSingleImage()).into(holder.thumbnail);
        holder.txtName.setText(home.getProduct_name());
        holder.txtPrice.setText("\u20B9"+home.getUnit_price());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    Activity activity = (Activity) mContext;
                    Intent intent = new Intent(mContext, ProductDetailsActivity.class);
                    intent.putExtra("productId",home.getProduct_id());
                    intent.putExtra("productName",home.getProduct_name());
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                    // activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


            }
        });


    }


    @Override
    public int getItemCount() {
        return homeList.size();
    }



}
