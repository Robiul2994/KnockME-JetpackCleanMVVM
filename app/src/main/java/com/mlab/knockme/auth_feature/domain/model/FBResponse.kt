package com.mlab.knockme.auth_feature.domain.model

import com.facebook.AccessToken

data class FBResponse(val accessToken: AccessToken,
                      var fbId:String="",
                      var fbLink:String="",
                      var pic:String="")
