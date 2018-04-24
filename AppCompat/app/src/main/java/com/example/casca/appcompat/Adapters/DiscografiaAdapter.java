package com.example.casca.appcompat.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.casca.appcompat.Model.Cancion;
import com.example.casca.appcompat.Model.Disco;
import com.example.casca.appcompat.R;

import java.util.List;


public class DiscografiaAdapter extends RecyclerView.Adapter<DiscografiaAdapter.ProductViewHolder> {

    private Context ctx;
    private List<Disco> discoList;

    public DiscografiaAdapter(Context ctx, List<Disco> discoList) {
        this.ctx = ctx;
        this.discoList = discoList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.content_discografia, null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Disco disco = discoList.get(position);
        holder.title.setText(disco.getTitulo());
        holder.artista.setText(disco.getArtista());
        holder.anio.setText(Integer.toString(disco.getAnio()));
        holder.imageView.setImageDrawable(ctx.getResources().getDrawable(disco.getImage()));
    }

    @Override
    public int getItemCount() {
        return discoList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title, artista,anio;

        public ProductViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.album);
            artista = itemView.findViewById(R.id.artista);
            anio = itemView.findViewById(R.id.anio);
            imageView = itemView.findViewById(R.id.imagen);
        }
    }
}
