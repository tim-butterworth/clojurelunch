(ns diamond.core
  (:require [clojure.string :refer [join]]))

(defn make-line [n]
  (join ""
        (concat
         (range 1 (inc n))
         (reverse (range 1 n)))))

(defn make-half-diamond [n]
  (if (= 1 n)
    ["1"]
    (conj (make-half-diamond (dec n)) (make-line n))))

(defn make-diamond [n]
  (join (make-half-diamond n)))
