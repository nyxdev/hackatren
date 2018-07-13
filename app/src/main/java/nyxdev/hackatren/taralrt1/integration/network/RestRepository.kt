package nyxdev.hackatren.taralrt1.integration.network

import io.reactivex.Observable
import nyxdev.hackatren.taralrt1.global.scope.Gson
import okhttp3.ResponseBody

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RestRepository {
    @FormUrlEncoded
    @POST("CommuterAccounts_SaveRecord")
    fun createAccountRequest(
            @Field("_IsEdit") editMode: String="false",
            @Field("_strInputs") data: String,
            @Field("_strLicenseKey") license: String="NYXSOFT2018"
            ): Observable<ResponseBody>
}
