package rekkisoft.trongvu.com.retrofitdemo.data.mode.remoto;

import java.util.List;

import rekkisoft.trongvu.com.retrofitdemo.data.mode.SOAnswersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {
    @GET("answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswersResponse>> getAnswers(@Query("tagged") String tags);
}

