(ns netrunner-analysis.core
  (:require [netrunner-analysis.cards :as cards]))

(defn total-strength-cost [breaker ice]
  (let [strength-dif (max 0 (- (:str ice) (:str breaker)))
        pumps (int (Math/ceil (/ strength-dif (:pump-inc breaker))))]
    (* pumps (:pump-cost breaker))))

(defn total-break-cost [breaker ice]
  (let [breaks (int (Math/ceil (/ (:subs ice) (:break-count breaker))))]
    (* breaks (:break-cost breaker))))

(defn cost [breaker ice]
  (+ (total-strength-cost breaker ice)
     (total-break-cost breaker ice)))

(defn result [breaker ice]
  {:breaker (:name breaker)
   :ice (:name ice)
   :cost (cost breaker ice)})

(defn result-to-string [result]
  (str "It costs " (:cost result) " credits for " (:breaker result) " to break " (:ice result)))

(def combinations (for [breaker cards/breakers
                        ice cards/ices
                        :when (or (= (:type breaker) "all")
                                  (= (:type breaker) (:type ice)))]
                    (result breaker ice)))

(defn sort-by-cost [results]
  (sort #(< (:cost %1) (:cost %2)) results))

(println "Result:")
(doall (->> combinations
            sort-by-cost
            (map result-to-string)
            (map println)))

