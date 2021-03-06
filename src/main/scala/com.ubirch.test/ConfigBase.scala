package com.ubirch.test

import com.typesafe.config.{Config, ConfigFactory}

trait ConfigBase {

  def conf: Config = ConfigBase.conf

  val serverPort: Int = conf.getInt("server.port")
  val serverBaseUrl: String = conf.getString("server.baseUrl")
  val appVersion: String = conf.getString("app.version")
  val swaggerPath: String = conf.getString("server.swaggerPath")
  val scalatraEnv: String = conf.getString("server.scalatra.environment")
}

object ConfigBase {
  val conf: Config = ConfigFactory.load()
}
