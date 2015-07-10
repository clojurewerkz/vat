(ns clojurewerkz.vat.client)

(def eu-member-iso-codes
  "List of the EU member ISO codes"
  ;; taken from http://publications.europa.eu/code/pdf/370000en.htm
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
