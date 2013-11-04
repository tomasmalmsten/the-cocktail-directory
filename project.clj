(defproject the-cocktail-directory "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU General Public Licens"
            :url "http://www.gnu.org/licenses/gpl.txt"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot the-cocktail-directory.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
