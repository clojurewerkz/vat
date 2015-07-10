(ns clojurewerkz.vat.client-test
  (:require [clojure.test :refer :all]
            [clojurewerkz.vat.client :as vc]))


(deftest test-eu-membership
  (are [code result] (is (= (vc/in-eu? code) result))
       "DE" true
       "UK" true
       "LT" true
       "DK" true
       "CZ" true
       "NO" false
       "RU" false))
