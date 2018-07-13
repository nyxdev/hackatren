package nyxdev.hackatren.taralrt1.global.model.obj.reward

import nyxdev.hackatren.taralrt1.global.util.RewardListType

data class Reward (
        var type :Int =RewardListType.TITLE,
        var history: History? = null
)
