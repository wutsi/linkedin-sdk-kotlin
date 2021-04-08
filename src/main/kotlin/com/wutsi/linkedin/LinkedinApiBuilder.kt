package com.wutsi.linkedin

import com.fasterxml.jackson.databind.ObjectMapper
import feign.Feign
import feign.jackson.JacksonDecoder
import feign.jackson.JacksonEncoder
import feign.okhttp.OkHttpClient
import feign.slf4j.Slf4jLogger

class LinkedinApiBuilder {
  fun build(env: Environment, mapper: ObjectMapper): LinkedinApi {
    return Feign.builder()
      .client(OkHttpClient())
      .encoder(JacksonEncoder(mapper))
      .decoder(JacksonDecoder(mapper))
      .logger(Slf4jLogger())
      .target(LinkedinApi::class.java, env.url)
  }
}
