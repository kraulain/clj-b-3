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


