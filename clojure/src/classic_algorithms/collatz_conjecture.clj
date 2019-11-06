(ns classic-algorithms.collatz-conjecture)

(declare check-number)
(declare ask-number)

(defn calculate-collatz
  "Calculates the conjecture and returns the number of iterations were needed to get to 1."
  [number count]
  (if (not= number 1)
    (do
      (if (= (mod number 2) 0)
        (recur (quot number 2) (+ count 1))
        (recur (+ (* number 3) 1) (+ count 1))))
    (println (+ count 1))))

(defn check-number
  "Checks a number, if it's all right calls a function to calculate the conjecture."
  [number]
  (if (<= number 0)
    (do
      (println number "is less than or equal to 0, enter another number please:")
      (ask-number))
    (calculate-collatz number 0)))

(defn ask-number
  "Asks for the user to enter a number and calls a function to check it."
  []
  (println "Enter a number bigger than 0:")
  (let [entered-number (Long/valueOf (read-line))]
    (check-number entered-number)))

(defn -main
  [& args]
  (ask-number))
