package com.zain.penemuanumatislam.adapter;

import android.app.DownloadManager;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.zain.penemuanumatislam.R;
import com.zain.penemuanumatislam.model.Penemuan;

import org.w3c.dom.Text;

import java.util.ArrayList;

import javax.crypto.CipherOutputStream;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ListPenemuanAdapter extends RecyclerView.Adapter<ListPenemuanAdapter.ListViewHolder> {
    private ArrayList<Penemuan> listPenemuan;

    public ListPenemuanAdapter(ArrayList<Penemuan> list){
        this.listPenemuan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_penemuan, viewGroup, false);
        return new ListViewHolder(view);
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Penemuan penemuan = listPenemuan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(penemuan.getPhotoPenemuan())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(penemuan.getNamapenemuan());
        holder.tvDetail.setText(penemuan.getDetailpenemuan());

        holder.itemView.setOnClickListener(new View.OnClickListener(){

                                               @Override
                                               public void onClick(View v) {
                                                   onItemClickCallback.onItemClicked(listPenemuan.get(holder.getAdapterPosition()));
                                               }
                                           });

    }

    @Override
    public int getItemCount() {
        return listPenemuan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }

    }
    public interface OnItemClickCallback{
        void onItemClicked(Penemuan data);
    }
}
