/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.login

import nyxdev.hackatren.taralrt1.integration.dao.table.AccountEntity

class LoginImpl(
        private val viewMethod: HasLoginContract.ViewMethod
) : HasLoginContract.Presenter {
    override fun loginAccount(accountEntity: AccountEntity) {
        try {
            viewMethod.dismissLoadingDialog()
            viewMethod.gotoHomeFragment()
        }catch (e:Exception){
            e.printStackTrace()
            viewMethod.dismissLoadingDialog()
            viewMethod.showErrorDialog("Wrong Credentials!")
        }
    }
}