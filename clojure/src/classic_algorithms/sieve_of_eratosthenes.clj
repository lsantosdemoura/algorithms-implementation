(ns classic-algorithms.sieve-of-erathostenes)

(defn not-multiple?
  [multiple number]
  (if (not= multiple number)
    (not= (mod multiple number) 0)
    true))

(defn non-multiples
  [limit-number start-number integers-list]
  (println start-number)
  (if (not= start-number limit-number)
    (do
      (->>
        integers-list
        (filter (fn
                  [multiple]
                  (not-multiple? multiple start-number)))
        (recur limit-number (first integers-list))))
    integers-list))

(defn calculate-sieve
  [limit-number]
  (if (<= limit-number 0)
    (do
      (println limit-number "is less than or equal to 0, enter another number please:")
      (ask-number))
    (do
      (let [integers-until-limit (range 2 limit-number)
            biggest-number-to-be-checked (int (Math/floor (Math/sqrt limit-number)))]
            (non-multiples biggest-number-to-be-checked 2 integers-until-limit)))))

(defn ask-number
  []
  (println "Enter a number bigger than 0:")
  (let [entered-number (Long/valueOf (read-line))]
    (calculate-sieve entered-number)))

(defn -main
  [& args]
  (ask-number))
