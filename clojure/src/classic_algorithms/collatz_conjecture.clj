(ns classic-algorithms.collatz-conjecture)

(declare calculate-collatz)
(declare ask-number)

(defn calculate-collatz
  [number count]
  (if (<= number 0)
    (do
      (println number "is less than or equal to 0, enter another number please:")
      (ask-number))
    (do
      (if (not= number 1)
        (do
          (if (= (mod number 2) 0)
            (recur (quot number 2) (+ count 1))
            (recur (+ (* number 3) 1) (+ count 1))))
        (println (+ count 1))))))

(defn ask-number
  []
  (println "Enter a number bigger than 0:")
  (let [entered-number (Long/valueOf (read-line))]
    (calculate-collatz entered-number 0)))

(defn -main
  [& args]
  (ask-number))
