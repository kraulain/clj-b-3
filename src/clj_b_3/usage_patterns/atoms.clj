(ns clj-b-3.usage-patterns.atoms)

(def q (atom clojure.lang.PersistentQueue/EMPTY))

(defn enqueue!
  "adds item to queue"
  [item]
  (swap! q conj item))

(comment
  (enqueue! :a)
  (seq @q)
  )
