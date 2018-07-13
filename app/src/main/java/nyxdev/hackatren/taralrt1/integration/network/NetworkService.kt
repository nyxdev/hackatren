/**
 * @author github.com/jamesdeperio
 * @version codepocket template builder v1.0
 */
package nyxdev.hackatren.taralrt1.integration.network

import android.content.Context
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import jdp.pocketlib.service.RetrofitManager
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class NetworkService(
        context: Context
) : RetrofitManager(context) {
    val rssRepository = create(RSSRepository::class.java)  as RSSRepository
    override fun initConverterFactory(): Converter.Factory {
        val tikXml=TikXml.Builder().exceptionOnUnreadXml(false).build()
        return TikXmlConverterFactory.create(tikXml)
    }
    override fun initRxAdapterFactory(): CallAdapter.Factory = RxJava2CallAdapterFactory.create()
    override fun initCacheSize(): Int = 10
    override fun initBaseURL(): String = "http://192.168.3.202:82/"
    override fun isDebugMode(): Boolean = true //todo
}