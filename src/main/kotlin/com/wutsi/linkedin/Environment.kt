package com.wutsi.linkedin

enum class Environment(public val url: String) {
  SANDBOX("https://wutsi-linkedin-test.herokuapp.com"),
  PRODUCTION("https://wutsi-linkedin-prod.herokuapp.com")
}
