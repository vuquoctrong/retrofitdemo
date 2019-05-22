package rekkisoft.trongvu.com.retrofitdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import rekkisoft.trongvu.com.retrofitdemo.data.mode.SOAnswersResponse;
import rekkisoft.trongvu.com.retrofitdemo.data.mode.remoto.SOService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private AnswersAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private SOService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mService = ApiUtils.getSOService();
        mRecyclerView = findViewById(R.id.rcView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);

        loadAnswers();
    }

    private void loadAnswers() {
        mService.getAnswers().enqueue(new Callback<SOAnswersResponse>() {
            @Override
            public void onResponse(Call<SOAnswersResponse> call, Response<SOAnswersResponse> response) {
                if (response.isSuccessful()) {
                    mAdapter = new AnswersAdapter(response.body().getItems(),MainActivity.this);
                    mRecyclerView.setAdapter(mAdapter);
                } else {
                    int statusCode = response.code();
                }
            }

            @Override
            public void onFailure(Call<SOAnswersResponse> call, Throwable t) {
                t.printStackTrace();
                Log.d("MainActivity", "error loading from API");
            }
        });
    }
}
