// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nccst/IdeaProjects/garminEdu/conf/routes
// @DATE:Mon Sep 16 15:15:42 CST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
