package com.app.retrofitdata;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.retrofitdata.Adapter.userAdapter;
import com.app.retrofitdata.Model.userModel;
import com.app.retrofitdata.Instance.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<userModel> alluserList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recy_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RetrofitInstance.getInstance().apiInterface.getUser().enqueue(new Callback<List<userModel>>() {
            @Override
            public void onResponse(Call<List<userModel>> call, Response<List<userModel>> response) {
                alluserList = response.body();
                recyclerView.setAdapter(new userAdapter(MainActivity.this, alluserList));

                 /*
                for(int i=0;i<alluserList.size();i++){
                    Log.e("api", "onResponse: all data  "+alluserList.get(i).getTitle().toString());

                }
                 */
            }

            @Override
            public void onFailure(Call<List<userModel>> call, Throwable throwable) {
                Log.e("api", "onFailure: error " + throwable.getMessage());
                Log.e("api", "onFailure: error " + throwable.getLocalizedMessage());
            }
        });
    }
}
