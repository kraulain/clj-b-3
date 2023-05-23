(ns clj-b-3.queue)


;;Creating a queue

(def queue (atom clojure.lang.PersistentQueue/EMPTY))

;; adding values

(swap! queue conj :a)
(swap! queue conj :b)
(swap! queue conj :c)
(swap! queue conj :d)

(seq @queue)

;; removing values

(swap! queue pop)

(seq @queue)
