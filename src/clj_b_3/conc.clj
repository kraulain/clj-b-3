(ns clj-b-3.conc)

(def board (promise))

(doto (Thread. (fn []
                 (Thread/sleep 5000)
                 (deliver board 400))))


(println @board)

