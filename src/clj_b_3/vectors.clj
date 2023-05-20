(ns clj-b-3.vectors)

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


;; Vector operations

;;; keeps duplicates

(conj v :a)

(conj v {:a :b})

;;; count

(count v)

;;; equality

(= [1 2 3] '(1 2 3)) ;; sequences are equal

(= [1 2 3] [3 2 1]) ;; order matters

(= [1 2 3] [ 1 2 (+ 1 2)])

;;; subvectors

(subvec v 0 2)

(peek v)

(pop v)

;;; you can call a vector as a function

([ 1 2 3] 2) ;; behaves like nth
