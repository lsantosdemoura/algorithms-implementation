(ns classic-algorithms.sieve-of-eratosthenes)

(declare ask-number)
(declare check-number)

(defn not-multiple-or-different?
  "Checks if numbers are different or one is a multiple of the other."
  [multiple number]
  (if (not= multiple number)
    (not= (mod multiple number) 0)
    true))

(defn calculate-sieve
  "Calculates the sieve through a recursion."
  [limit-number start-number position integers-list]
  (if (<= start-number limit-number)
    (do
      (->>
        integers-list
        (filter (fn
                  [multiple]
                  (not-multiple-or-different? multiple start-number)))
        (recur limit-number (nth integers-list position) (inc position))))
    (println integers-list)))

(defn check-number
  "Checks a number, if it's all right calls a function to calculate the sieve."
  [limit-number]
  (if (<= limit-number 0)
    (do
      (println limit-number "is less than or equal to 0, enter another number please:")
      (ask-number))
    (do
      ; incrementing 1 to limit-number so the list can include it
      (let [integers-until-limit (range 2 limit-number)
            biggest-number-to-be-checked (int (Math/floor (Math/sqrt limit-number)))
            first-number-to-be-searched 2
            first-numbers-position 1]
            (calculate-sieve biggest-number-to-be-checked first-number-to-be-searched
                           first-numbers-position integers-until-limit)))))

(defn ask-number
  "Asks for the user to enter a number and calls a function to check it."
  []
  (println "Enter a number bigger than 0:")
  (let [entered-number (Long/valueOf (read-line))]
    (check-number entered-number)))

(defn -main
  [& args]
  (ask-number))
