package cn.edu.cqu.greenewsbeta01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PostsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
    }
    public void onClickBack(View v){
        Intent intent =new Intent(PostsActivity.this,DrawerHomeActivity.class);
        startActivity(intent);
        finish();
    }
}
