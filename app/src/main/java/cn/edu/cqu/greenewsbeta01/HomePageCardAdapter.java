package cn.edu.cqu.greenewsbeta01;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class HomePageCardAdapter extends RecyclerView.Adapter<HomePageCardAdapter.ViewHolder> {
    private List<HomePageCard> cardList;
    private Context mContext;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder( View v )
        {
            super(v);
            cardView=(CardView) v;
            mTextView = (TextView) v.findViewById(R.id.title);
            mImageView = (ImageView) v.findViewById(R.id.pic);
        }
    }

    public HomePageCardAdapter(List<HomePageCard> cardlist){
        //this.mContext=mContext;
        this.cardList=cardlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(mContext==null) {
            mContext = viewGroup.getContext();
        }
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
//        //设置点击事件
//        final ViewHolder holder = new ViewHolder(v);
//        v.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                HomePageCard homePageCard=cardList.get(holder.getAdapterPosition());
//                Intent intent =new Intent(mContext,ArticleActivity.class);
//                mContext.startActivity(intent);
//
//            }
//        });
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        HomePageCard c=cardList.get(i);
        viewHolder.mTextView.setText(c.getArcticle_title());
        Glide.with(mContext).load(c.getPic_id()).into(viewHolder.mImageView);

    }

    @Override
    public int getItemCount() {
        return cardList==null ? 0 :cardList.size();
    }


    private List<HomePageCard> getCards(){
        List<HomePageCard> cardList=new ArrayList<>();
        for(int i = 1; i <= 20; i++) {
            HomePageCard news = new HomePageCard("title",0);
            news.setTitle("This is news title " + i);
            news.setPic_id(R.drawable.water);
            cardList.add(news);
        }
        return cardList;
    }










}
