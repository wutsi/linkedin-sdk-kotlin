package com.wutsi.linkedin.dto

import kotlin.Long
import kotlin.String

public data class StoreSecretRequest(
  public val siteId: Long = 0,
  public val userId: Long = 0,
  public val linkedinId: String = "",
  public val accessToken: String = "",
  public val accessTokenSecret: String = ""
)
