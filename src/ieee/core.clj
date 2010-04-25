(ns ieee.core
  (:use compojure.http
        compojure.html)
  (:gen-class :extends javax.servlet.http.HttpServlet))

(defn index
  [request]
  (html
   (doctype :html4)
   [:head (include-css "/stylesheets/screen.css")]
   [:body "Hello"]))

(defroutes webservice
  (GET "/" index)
  (ANY "*" [404 "Not Found"]))

(defservice webservice)
