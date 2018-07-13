/**
 * @author github.com/jamesdeperio
 * @version codepocket template builder v1.0
 */
package nyxdev.hackatren.taralrt1.integration.network

import android.content.Context
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import jdp.pocketlib.service.RetrofitManager
import nyxdev.hackatren.taralrt1.global.scope.Gson
import nyxdev.hackatren.taralrt1.global.scope.Xml
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkService(
        context: Context
) : RetrofitManager(context) {
    val rssRepository = create(RSSRepository::class.java)  as RSSRepository
    val etaRepository = create(GoogleETARepository::class.java)  as GoogleETARepository
    override fun initConverterFactory(): Converter.Factory {
        val tikXml= TikXml.Builder().exceptionOnUnreadXml(false).build()
        return MultipleConverterFactory.Builder()
                .add(Xml::class.java, TikXmlConverterFactory.create(tikXml))
                .add(Gson::class.java, GsonConverterFactory.create())
                .build()
    }
    override fun initRxAdapterFactory(): CallAdapter.Factory = RxJava2CallAdapterFactory.create()
    override fun initCacheSize(): Int = 10
    override fun initBaseURL(): String = "http://192.168.3.202:82/"
    override fun isDebugMode(): Boolean = true //todo
}