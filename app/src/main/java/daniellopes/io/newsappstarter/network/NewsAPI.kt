package daniellopes.io.newsappstarter.network

import daniellopes.io.newsappstarter.model.NewsResponse
import daniellopes.io.newsappstarter.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("/v2/top-headlines")
    suspend fun getBreakNews(
        @Query("country")
        countryCode: String = "br",
        @Query("page")
        pageNumber: Int =1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int =1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ): Response<NewsResponse>
}