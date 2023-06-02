(ns clj-b-3.usage-patterns.atoms)

(def q (atom clojure.lang.PersistentQueue/EMPTY))

(defn enqueue!
  "adds item to queue"
  [item]
  (swap! q conj item))

(defn dequeue!
  "remove item forom queu and return the iteme"
  []
  (let [val (peek @q)]
    (swap! q pop)
    val))

(comment
  (enqueue! :e)
  (seq @q)
  (dequeue!)
  )
