(ns clj-b-3.hashmap)

;; Creating Hashmap

{}

{:a 1, :b 2}

;; keys must be unique

{:a 1, :a 2} ;;=> Error

(hash-map :a 1 :b 2 :c 3)

(hash-map :a 1 :b 2 :c );; error: odd num of args

(array-map :a 1 :b 2 :c 3)

(into {} [[:a 1] [:b 2] [:c 3]])

;; Operations

(def squares (into {} (for [k (range 10)]
                        [(keyword (str k)) (* k k)])))

(seq squares)
(keys squares)
(vals squares)

(merge  {:a 1 :b 2 :c 3} {:d 4, :e 5, :f 6})

(select-keys squares [:1 :8])

;; Access patterns

;;; Order is forgeten

(= {:a 1 :b 2} {:b 2 :a 1})

;;; duplicates are forgotten or replaced


(conj {:a 1} {:a 1})
(conj {:a 1} {:a 2})

;;; Accessed by key

(get squares :8)
(get {} :a)

;;; Associate key value pairs

(assoc {:a 0} :b 2 "greeting" "Hello")

;;; remove value by key

(dissoc squares :8)
(dissoc squares :8 :0 :1)

;;; count

(count squares)

;;; equality

(= (hash-map :a 0 :b 1) (array-map :a 0 :b 1))

;;; Containment

(contains? squares :1)

;;; representing enities

{:id 123
 :name "John doe"
 :email "jd@email.com"}

;;; function

(:a {:a 1 :b 2})

({1 :monday, 2 :tuesday} 2)


(map {1 :monday, 2 :tuesday} '(2 2 2 1 1 1))
