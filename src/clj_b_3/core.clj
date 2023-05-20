(ns clj-b-3.core)

;; vectors evaluation
[ 1 2 3 (* 2 2)]

;; using vector function to create
(vector 1 2 3 4)

;;vectors a heterogenous
[ 1 :a "word" \c]

;; using vec function
(vec '(1 2 3 4))

(vec (list 1 2 3 4))

(vec {:a 1, :b 2})

;; access patterns

;;; order
(conj [1 2 3 4] :a)

(seq [1 2 3 4])

;;; random access

(def v [:a :b :c :d :e :f :g])

(get v 3 :blurg)

(get v 31 :blurg)

(nth v 3)

;; (nth v -1)


