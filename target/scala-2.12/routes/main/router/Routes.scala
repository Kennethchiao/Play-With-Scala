// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nccst/IdeaProjects/garminEdu/conf/routes
// @DATE:Mon Sep 16 15:15:42 CST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_4: controllers.HomeController,
  // @LINE:9
  CountController_1: controllers.CountController,
  // @LINE:11
  AsyncController_3: controllers.AsyncController,
  // @LINE:14
  Assets_2: controllers.Assets,
  // @LINE:17
  ApiController_0: controllers.ApiController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_4: controllers.HomeController,
    // @LINE:9
    CountController_1: controllers.CountController,
    // @LINE:11
    AsyncController_3: controllers.AsyncController,
    // @LINE:14
    Assets_2: controllers.Assets,
    // @LINE:17
    ApiController_0: controllers.ApiController
  ) = this(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, ApiController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, ApiController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/home""", """controllers.ApiController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/home/""" + "$" + """id<[^/]+>""", """controllers.ApiController.read(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/home""", """controllers.ApiController.create"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/home/""" + "$" + """id<[^/]+>""", """controllers.ApiController.delete(id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/home/""" + "$" + """id<[^/]+>""", """controllers.ApiController.update(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ApiController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/home")))
  )
  private[this] lazy val controllers_ApiController_index4_invoker = createInvoker(
    ApiController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "index",
      Nil,
      "GET",
      this.prefix + """api/home""",
      """ Custmur page""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ApiController_read5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/home/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_read5_invoker = createInvoker(
    ApiController_0.read(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "read",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/home/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ApiController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/home")))
  )
  private[this] lazy val controllers_ApiController_create6_invoker = createInvoker(
    ApiController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "create",
      Nil,
      "POST",
      this.prefix + """api/home""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ApiController_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/home/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_delete7_invoker = createInvoker(
    ApiController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """api/home/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ApiController_update8_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/home/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_update8_invoker = createInvoker(
    ApiController_0.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "update",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """api/home/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:9
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:14
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_ApiController_index4_route(params@_) =>
      call { 
        controllers_ApiController_index4_invoker.call(ApiController_0.index)
      }
  
    // @LINE:18
    case controllers_ApiController_read5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ApiController_read5_invoker.call(ApiController_0.read(id))
      }
  
    // @LINE:19
    case controllers_ApiController_create6_route(params@_) =>
      call { 
        controllers_ApiController_create6_invoker.call(ApiController_0.create)
      }
  
    // @LINE:20
    case controllers_ApiController_delete7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ApiController_delete7_invoker.call(ApiController_0.delete(id))
      }
  
    // @LINE:21
    case controllers_ApiController_update8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ApiController_update8_invoker.call(ApiController_0.update(id))
      }
  }
}
