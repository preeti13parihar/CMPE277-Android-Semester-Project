package com.cmpe277.newsflash.api;

import com.cmpe277.newsflash.models.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {


    @GET("v2/top-headlines")
    Call<NewsResponse> getBreakingNews(
            @Query("country") String country,
            @Query("page") int pageNumber,
            @Query("apiKey") String apiKey);

    @GET("v2/everything")
    Call<NewsResponse> searchForNews(
            @Query("q") String searchQuery,
            @Query("page") int pageNumber,
            @Query("apiKey") String apiKey);

}
