package com.aliya.refresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    Context context;
    List<Product> data;
    public ProductAdapter(Context context, List<Product> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_note,parent,false);
        return new ProductViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product Product = data.get(position);

//        holder.itemimg.setImageResource(Product.getImg());
        holder.title.setText(Product.getName());
        holder.barcode.setText(Product.getBarcode());
        if(Product.getHasExpiry()=="1"){
            holder.expire.setText("is Expired");
        }else{
            holder.expire.setText("Doesn't Expire");
        }
        holder.price.setText(Product.getPrice() + " $");
        holder.limit.setText(Product.getMax_qty_in_room());
        Picasso.get().load("https://haccp.parc-hotel.lu/Pantry/img/items/" + Product.getPicture()).into(holder.itemimg);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
}
