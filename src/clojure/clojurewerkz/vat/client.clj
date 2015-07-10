(ns clojurewerkz.vat.client
  (:require [clj-http.client :as http]
            [cheshire.core :as json]))

#_ (defn get-vat-data
  ""
  [^String api-key ^String country-iso-code]
  (let [url "https://vatapi.com/v1/vat-rates"
        data (json/decode (:body (http/get url {:apikey api-key})))]
    ))

(def eu-member-iso-codes
  "List of the EU member ISO codes"
  #{"BE"
    "BG"
    "CZ"
    "DK"
    "DE"
    "EE"
    "IE"
    "EL"
    "ES"
    "FR"
    "HR"
    "IT"
    "CY"
    "LV"
    "LT"
    "LU"
    "HU"
    "MT"
    "NL"
    "AT"
    "PL"
    "PT"
    "RO"
    "SI"
    "SK"
    "FI"
    "SE"
    "UK"})

(defn in-eu?
  "Check if country is in EU"
  [^String iso-code]
  (not (not (eu-member-iso-codes iso-code))))
