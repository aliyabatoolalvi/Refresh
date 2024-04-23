package com.aliya.refresh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


public class ProductViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView barcode;
    public TextView expire;
    public ImageView itemimg;

    public TextView limit;
    public TextView price;

    public ConstraintLayout post;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        title=itemView.findViewById(R.id.title);
        barcode =itemView.findViewById(R.id.barcode);
        itemimg= itemView.findViewById(R.id.itemimg);
        price=itemView.findViewById(R.id.price);
        post=itemView.findViewById(R.id.post);
        limit= itemView.findViewById(R.id.limit);
    }
}
