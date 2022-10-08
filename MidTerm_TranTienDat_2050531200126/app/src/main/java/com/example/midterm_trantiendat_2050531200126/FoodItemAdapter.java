package com.example.midterm_trantiendat_2050531200126;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodItemAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private TextView num;
    private ImageView plusNumber;
    private List<foodItem> foodItemList;

    public FoodItemAdapter(Context context, int layout, List<foodItem> foodItemList) {
        this.context = context;
        this.layout = layout;
        this.foodItemList = foodItemList;
    }

    @Override
    public int getCount() {
        return foodItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgFood, imgPlus, imgMinus;
        TextView txtTitle, txtCount, txtFeeCount, txtTotalCount;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder = new ViewHolder();
            // anh xa view
            holder.txtTitle = (TextView) view.findViewById(R.id.titleCart);
            holder.txtCount = (TextView) view.findViewById(R.id.numberItem);
            holder.txtFeeCount = (TextView) view.findViewById(R.id.feeItem);
            holder.txtTotalCount = (TextView) view.findViewById(R.id.totalItem);
            holder.imgFood = (ImageView) view.findViewById(R.id.img);
            holder.imgPlus = (ImageView) view.findViewById(R.id.plusCartBtn);
            holder.imgMinus = (ImageView) view.findViewById(R.id.minusCartBtn);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri
        foodItem foodList= foodItemList.get(i);

        holder.imgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodList.setNumber(foodList.getNumber() + 1);
                notifyDataSetChanged();
            }
        });
        holder.imgMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodList.setNumber(foodList.getNumber() - 1);
                notifyDataSetChanged();
            }
        });

        holder.txtTitle.setText(foodList.getTitleFood());
        holder.txtCount.setText(String.valueOf(foodList.getNumber()));
        holder.txtFeeCount.setText(String.valueOf(foodList.getFeeCount()));
        holder.txtTotalCount.setText(String.valueOf(Math.round((foodList.getNumber())*(foodList.getFeeCount()))));
        holder.imgFood.setImageResource(foodList.getImg());
        holder.imgPlus.setImageResource(foodList.getPlusBtn());
        holder.imgMinus.setImageResource(foodList.getMinusBtn());

        return view;
    }


}
