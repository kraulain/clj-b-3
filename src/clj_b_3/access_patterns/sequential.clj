(ns clj-b-3.access-patterns.sequential)

;; Arbitrary stable patterns (order is maintained)

;;; List

(def utensils (list :knife :spoon :fork))

(seq utensils) ;; order is maintained

(conj utensils :spatula) ;; new items gets added to front


