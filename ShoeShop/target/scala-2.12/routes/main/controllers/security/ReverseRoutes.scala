
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ShoeShop/conf/routes
// @DATE:Tue Mar 05 10:32:52 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:12
package controllers.security {

  // @LINE:12
  class ReverseLoginCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:14
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:12
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
