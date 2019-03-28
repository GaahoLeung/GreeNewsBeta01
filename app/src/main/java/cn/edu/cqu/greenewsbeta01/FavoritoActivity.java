package cn.edu.cqu.greenewsbeta01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FavoritoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorito);
    }
    public void onClickBack(View v){
        Intent intent =new Intent(FavoritoActivity.this,DrawerHomeActivity.class);
        startActivity(intent);
        finish();
    }
}
