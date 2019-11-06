(ns classic-algorithms.bubble-sort)

(defn bubble-sort
  [list-to-be-sorted current-position next-position]
  (if (> (nth list-to-be-sorted current-position) (nth list-to-be-sorted next-position))
    ))

(defn ask-numbers
  []
  (println "Enter the number of elements you want in your list:")
  (let [list-length (Long/valueOf (read-line))
       (println "Now enter the maximum possible number in your list:")
       list-limit (Long/valueOf (read-line))
       unordered-list (take list-length (repeatedly #(rand-int list-limit)))
       (println "This is your list\n" unordered-list)
       sorted-list (bubble-sort unordered-list 0 1)
       (println "And this is your sorted list\n" sorted-list)]))


(defn -main
  [& args]
  (ask-numbers))
