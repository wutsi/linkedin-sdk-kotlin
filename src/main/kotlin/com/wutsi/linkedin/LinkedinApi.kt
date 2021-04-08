package com.wutsi.linkedin

import com.wutsi.linkedin.dto.StoreSecretRequest
import com.wutsi.linkedin.dto.StoreSecretResponse
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.Unit

public interface LinkedinApi {
  @RequestLine("GET /v1/linkedin/share")
  public fun share(@Param("story-id") storyId: Long): Unit

  @RequestLine("POST /v1/linkedin/secrets")
  public fun storeSecret(request: StoreSecretRequest): StoreSecretResponse

  @RequestLine("DELETE /v1/linkedin/secrets/{id}")
  public fun revokeSecret(@Param("id") id: Long): Unit
}
