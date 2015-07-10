(ns clojurewerkz.vat.client-test
  (:require [clojurewerkz.vat.client :as vc]
            #+clj [clojure.test :refer :all]
            #+cljs [cemerick.cljs.test :as t])
  #+cljs (:require-macros [cemerick.cljs.test :refer (is are deftest testing)]))


(deftest test-eu-membership
  (are [code result] (is (= (vc/in-eu? code) result))
       "DE" true
       "UK" true
       "LT" true
       "DK" true
       "CZ" true
       "NO" false
       "RU" false))
