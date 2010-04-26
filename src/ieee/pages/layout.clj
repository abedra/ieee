(ns ieee.pages.layout
  (:use compojure.html
        ieee.user))

(defn render
  "The base layout for all pages"
  [body]
  (html
   (doctype :html4)
   [:head (include-css "/stylesheets/screen.css" "/stylesheets/style.css")]
   [:body
    [:div {:class "container"}
     [:div {:id "header" :class "span-24"}
      [:div {:id "header-text" :class "span-16"}
       "IEEE Internet Computing Magazine GAE Example"]
      [:div {:id "login" :class "span-8 last"}] (login-box)]
     [:div {:id "content" :class "span-24"} body]]]))