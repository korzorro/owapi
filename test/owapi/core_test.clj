(ns owapi.core-test
  (:require [clojure.test :refer :all]
            [owapi.core :refer :all]))

(def test-url (build-url base-url "pc" "us" "korzorro-1409"))

(deftest test-build-url
  (is (= test-url
         "https://playoverwatch.com/en-us/career/pc/us/user-1234")))

(deftest test-download-official-html
  (download-official-html test-url))
