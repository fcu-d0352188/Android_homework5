package com.example.huei_lian.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Huei-Lian on 2017/6/9.
 */

public class owen_adapter {
    Context context;
    List<Owenitem> items;
    public owen_adapter(View.OnClickListener context, List<Owenitem> items)
    {
        this.context=context;
        this.items=items;
    }

    private class View_holder
    {
        ImageView hostimg;
        ImageView guestimg;
        TextView hostname;
        TextView guestname;
        TextView hostscore;
        TextView guestscore;
    }
    @NonNull
    @Override
    public View getView(int position , View convertview, ViewGroup parent)
    {
        View_holder holder=new View_holder();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertview==null)
        {
            convertview=inflater.inflate(R.layout.owen,null);
            holder=new View_holder();
            holder.hostimg=(ImageView)convertview.findViewById(R.id.imageView);
            holder.guestimg=(ImageView)convertview.findViewById(R.id.imageView2);
            holder.hostname=(TextView)convertview.findViewById(R.id.textView);
            holder.guestname=(TextView)convertview.findViewById(R.id.textView3);
            holder.hostscore=(TextView)convertview.findViewById(R.id.textView2);
            holder.guestscore=(TextView)convertview.findViewById(R.id.textView4);
            convertview.setTag(holder);
        }
        else
        {
            holder=(View_holder)convertview.getTag();
        }
        Owenitem owenitems = (Owenitem)getItem(position);
        holder.hostimg.setImageResource(owenitems.getHost_img_id());
        holder.guestimg.setImageResource(owenitems.getGuest_img_id());
        holder.hostname.setText(owenitems.getHost_name());
        holder.guestname.setText(owenitems.getGuest_name());
        holder.hostscore.setText(owenitems.getHost_score());
        holder.guestscore.setText(owenitems.getGuest_score());
        return convertview;
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position){return items.get(position);}
    @Override
    public long getItemId(int position){return items.indexOf(getItem(position));}
}
