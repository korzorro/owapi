(ns owapi.core
  (:import [org.jsoup Jsoup]))

(def base-url "https://playoverwatch.com/en-us/career/")

(defn build-url
  "btag is in the format {username}-{id}"
  [base-url platform region btag]
  (str base-url platform "/" region "/" btag))

(defn download-official-html
  [url]
  (.get (Jsoup/connect url)))

(defn format-html
  [html]
  (Jsoup/parse html))
