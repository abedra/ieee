(ns ieee.user
  (:import com.google.appengine.api.users.UserServiceFactory))

(def user-service (atom nil))

(defn get-user-service
  "UserService for the current request."
  []
  (if @user-service
    @user-service
    (reset! user-service (UserServiceFactory/getUserService))))

(defn get-user
  "If the user is not logged in will return nil."
  []
  (.getCurrentUser (get-user-service)))

(defn get-login-url
  ([dest]
   (.createLoginURL (get-user-service) dest))
  ([dest auth-domain]
   (.createLoginURL (get-user-service) dest auth-domain)))

(defn get-logout-url
  ([dest]
   (.createLogoutURL (get-user-service) dest))
  ([dest auth-domain]
   (.createLogoutURL (get-user-service) dest auth-domain)))

(defn is-admin
  []
  (.isUserAdmin (get-user-service)))

(defn is-logged-in
  []
  (.isUserLoggedIn (get-user-service)))

(defn login-box
  []
  (if (is-logged-in)
    (do  [:span {:class "login-text"} (get-user) " - "
          [:a {:href (get-logout-url "/")} "sign out"]])
    [:span {:class "login-text"}
     [:a {:href (get-login-url "/")} "sign in"]]))