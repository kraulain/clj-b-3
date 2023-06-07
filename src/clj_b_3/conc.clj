(ns clj-b-3.conc)

(def book-count (future (do
                          (Thread/sleep 5000)
                          42)))

(println "doing something")

(println "done")

(println "there are" @book-count "≈‚books")


(def sum (ref 0))

(def items (ref 0))

(defn add-to-average [num]
  (dosync
   (alter sum + num)
   (alter items + 1))
  :done)

