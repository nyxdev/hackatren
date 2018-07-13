/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.registration

import nyxdev.hackatren.taralrt1.integration.dao.table.AccountEntity

class RegistrationImpl(
        private val viewMethod: HasRegistrationContract.ViewMethod
) : HasRegistrationContract.Presenter {
    override fun createAccount(accountEntity: AccountEntity) {
        viewMethod.showLoadingDialog()
        try {
            //todo check to database
            //if exist viewMethod.showErrorDialog("Email is already used!")
            //if exist viewMethod.showErrorDialog("Card is already used!")
            //else save to database
            viewMethod.dismissLoadingDialog()
            viewMethod.showSuccessDialog()
        }catch (e:Exception){
            e.printStackTrace()
            viewMethod.dismissLoadingDialog()
            viewMethod.showErrorDialog("Could not create account. Try again!")
        }
    }
}