package com.wutsi.linkedin.event

data class LinkedinSharedEventPayload(
  val linkedinShareId: Long = -1,
  val postId: Long? = null
)
