(ns the-cocktail-directory.handler
  (:use compojure.core)
  (:use ring.util.response)
  (:require [compojure.handler :as handler]
            [ring.middleware.json :as middleware]
            [clojurewerkz.neocons.rest]
            [compojure.route :as route]))

(defn save-ingredient [ingredient-data]
  ingredient-data)

(defn new-ingredient [body]
  (println body)
  (response (save-ingredient body)))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (PUT "/ingredients" {body :body} (new-ingredient body))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-body)
      (middleware/wrap-json-response)))
