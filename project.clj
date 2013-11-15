(defproject the-cocktail-directory "0.1.0-SNAPSHOT"
  :description "The online fine mixed drink directory"
  :url "http://www.tomasmalmsten.com/cocktails"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [cheshire "5.2.0"]
                 [ring/ring-json "0.2.0"]
                 [clojurewerkz/neocons "2.0.0-beta3"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler the-cocktail-directory.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})

