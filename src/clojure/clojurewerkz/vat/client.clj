(ns clojurewerkz.vat.client
  (:require [clj-http.client :as http]
            [cheshire.core :as json]))

(defn get-vat-data
  ""
  [^String api-key ^String country-iso-code]
  (let [url "https://vatapi.com/v1/vat-rates"
        data (json/decode (:body (http/get url {:apikey api-key})))]
    ))

(defn ^:private get-eu-countries-iso-codes
  "Returns the list of the EU countries ISO codes"
  []
  ["BE" ; Kingdom of Belgium
   "BG" ; Republic of Bulgaria
   "CZ" ; Czech Republic
   "DK" ; Kingdom of Denmark
   "DE" ; Federal Republic of Germany
   "EE" ; Republic of Estonia
   "IE" ; Ireland
   "EL" ; Hellenic Republic
   "ES" ; Kingdom of Spain
   "FR" ; French Republic
   "HR" ; Republic of Croatia
   "IT" ; Italian Republic
   "CY" ; Republic of Cyprus
   "LV" ; Republic of Latvia
   "LT" ; Republic of Lithuania
   "LU" ; Grand Duchy of Luxembourg
   "HU" ; Hungary
   "MT" ; Republic of Malta
   "NL" ; Kingdom of the Netherlands
   "AT" ; Republic of Austria
   "PL" ; Republic of Poland
   "PT" ; Portuguese Republic
   "RO" ; Romania
   "SI" ; Republic of Slovenia
   "SK" ; Slovak Republic
   "FI" ; Republic of Finland
   "SE" ; Kingdom of Sweden
   "UK" ; United Kingdom of Great Britain and Northern Ireland
   ])

(defn in-eu?
  "Check if country is in EU"
  [^String country-iso-code]
  (contains (get-eu-countries-iso-codes) country-iso-code))
