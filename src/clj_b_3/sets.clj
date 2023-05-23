(ns clj-j-3.sets)

;; Createing sets

#{ 1 2 3}

(set '(1 2 3))

(into #{} [:a 1 "hello"])

;; containment

(contains? #{:a :b :c} :c)

(#{:a :b :c} :b)

(get #{:a :n :l} :a)

(first #{:a :b :d})

