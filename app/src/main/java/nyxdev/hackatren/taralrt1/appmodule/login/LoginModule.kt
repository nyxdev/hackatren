/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.login

import android.support.v4.app.Fragment
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import nyxdev.hackatren.taralrt1.R
import nyxdev.hackatren.taralrt1.global.scope.FragmentScope

@Module
object LoginModule {
    @FragmentScope
    @Provides
    @JvmStatic
    fun provideSubscription() = CompositeDisposable()

    @FragmentScope
    @Provides
    @JvmStatic
    fun provideComponent(controller: LoginController): LoginView {
        controller.rootView = controller.layoutInflater.inflate(R.layout.fragment_login, controller.container, false)
        return LoginView(
                view = controller.rootView!!,
                event = controller as HasLoginContract.Event,
                context= controller.context!!)
    }

    @FragmentScope
    @Provides
    @JvmStatic
    fun provideViewMethod(controller: LoginController, view: LoginView): HasLoginContract.ViewMethod = LoginViewImpl(fragment = controller as Fragment, view = view)

    @FragmentScope
    @Provides
    @JvmStatic
    fun providePresenter(viewMethod: HasLoginContract.ViewMethod): HasLoginContract.Presenter = LoginImpl(viewMethod)

}