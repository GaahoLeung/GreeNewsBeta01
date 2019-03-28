package cn.edu.cqu.greenewsbeta01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragCardList extends Fragment {
    public View onCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_card_list, container, false);
        RecyclerView cardListRecyclerView = (RecyclerView) view.findViewById(R.id.swipe_refresh);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        cardListRecyclerView.setLayoutManager(layoutManager);
        //HomePageCardAdapter adapter=new HomePageCardAdapter(getCards());
       // cardListRecyclerView.setAdapter(adapter);
        return view;
    }

//    private List<HomePageCard> getCards(){
//        List<HomePageCard> cardList=new ArrayList<>();
//        for(int i = 1; i <= 20; i++) {
//            HomePageCard news = new HomePageCard();
//            news.setTitle("This is news title " + i);
////            news.setContent(getRandomLengthContent("This is news content " + i + ". "));
//            cardList.add(news);
//        }
//        return cardList;
//    }
}
