package cn.edu.cqu.greenewsbeta01;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeActivity extends AppCompatActivity {

    private List<HomePageCard> cardList= new ArrayList<>();
    private HomePageCardAdapter adapter;
    private HomePageCard[] cards={new HomePageCard("Title1",R.drawable.water),
            new HomePageCard("Title2",R.drawable.water),new HomePageCard("Title3",R.drawable.water),new HomePageCard("Title4",R.drawable.water),new HomePageCard("Title5",R.drawable.water)};
    private SwipeRefreshLayout swipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        GenerateHomePageCardContent();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new HomePageCardAdapter(cardList);
        recyclerView.setAdapter(adapter);
        swipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.
                OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshCards();
            }});
    }

    private void GenerateHomePageCardContent() {
        cardList.clear();
        for(int i=0;i<5;i++){
            Random random = new Random();
            int index = random.nextInt(cards.length);
            cardList.add(cards[index]);
        }
    }
    private void refreshCards() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        GenerateHomePageCardContent();
                        adapter.notifyDataSetChanged();
                        swipeRefresh.setRefreshing(false);
                    }
                });
            }
        }).start();
    }

}
