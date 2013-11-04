(ns the-cocktail-directory.core-test
  (:require [clojure.test :refer :all]
            [the-cocktail-directory.core :refer :all]))

(deftest cocktail-test
  (testing "Create new Cocktail"
    (:martini cocktail)))
(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
