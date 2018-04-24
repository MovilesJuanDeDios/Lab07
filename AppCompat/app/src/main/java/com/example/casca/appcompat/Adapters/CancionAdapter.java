package com.example.casca.appcompat.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.casca.appcompat.Activity.Canciones;
import com.example.casca.appcompat.Activity.Video;
import com.example.casca.appcompat.Model.Cancion;
import com.example.casca.appcompat.R;

import java.util.List;


public class CancionAdapter extends RecyclerView.Adapter<CancionAdapter.CancionViewHolder> {

    private Context ctx;
    private List<Cancion> cancionList;

    public CancionAdapter(Context ctx, List<Cancion> cancionList) {
        this.ctx = ctx;
        this.cancionList = cancionList;
    }

    @NonNull
    @Override
    public CancionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.content_cancion, null);
        CancionViewHolder holder = new CancionViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CancionViewHolder holder,final int position) {
        final Cancion cancion = cancionList.get(position);
        holder.title.setText(cancion.toString());
        holder.album.setText(cancion.getAlbum());
        holder.imageView.setImageDrawable(ctx.getResources().getDrawable(cancion.getImage()));

        holder.imgPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentf = new Intent(ctx, Video.class);
                intentf.putExtra("video", Integer.toString(cancion.getDir()) );
                ctx.startActivity(intentf);
            }
        });

    }

    @Override
    public int getItemCount() {
        return cancionList.size();
    }

    class CancionViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title, album;
        ImageButton imgPlay;

        public CancionViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.titulo);
            album = itemView.findViewById(R.id.album);
            imageView = itemView.findViewById(R.id.imagen);
            imgPlay = itemView.findViewById(R.id.play);
        }
    }
}
