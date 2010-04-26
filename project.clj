(defproject risk "1.0.0-SNAPSHOT"
  :description "risk ananlysis application"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [compojure-gae "0.3.3"]]
  :compile-path "war/WEB-INF/classes"
  :library-path "war/WEB-INF/lib"
  :namespaces [ieee.core
               ieee.user
               ieee.pages.layout])
