/**
 * @version codepocket template builder v1.0
 * @author github.com/jamesdeperio
 **/
package nyxdev.hackatren.taralrt1.appmodule.crowdvolume

import android.content.Context
import android.support.v4.app.Fragment

class CrowdVolumeViewImpl(
        private val fragment: Fragment,
        private val view: CrowdVolumeView
) : HasCrowdVolumeContract.ViewMethod