(ns clj-b-3.destructuring)

(defn foo
  "try destructuring with a function"
  [b {val :a}]
  val)

(foo 5 {:a 2})
