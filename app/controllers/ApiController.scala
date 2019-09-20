package controllers

import javax.inject._
import play.api.mvc.{AbstractController, ControllerComponents}


@Singleton
class ApiController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def echo = TODO

  def index = TODO

  def create = TODO

  def read(id: String) = TODO

  def update(id: String) = TODO

  def delete(id: String) = TODO

}
