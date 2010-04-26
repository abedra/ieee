(ns ieee.core
  (:use [compojure.http servlet routes])
  (:use compojure.html
        ieee.pages.layout)
  (:import com.google.appengine.api.users.UserServiceFactory)
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn index
  [request]
  (render "Hello"))

(defroutes webservice
  (GET "/" index)
  (ANY "*" [404 "Not Found"]))

(defservice webservice)
