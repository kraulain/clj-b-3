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
