package com.wutsi.linkedin

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-linkedin-test.herokuapp.com"),
  PRODUCTION("https://wutsi-linkedin-prod.herokuapp.com"),
  ;
}
