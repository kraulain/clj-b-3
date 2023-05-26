(ns clj-b-3.access-patterns.sequential)

;; Arbitrary stable patterns (order is maintained)

;;; List

(def utensils (list :knife :spoon :fork))

(seq utensils) ;; order is maintained

(conj utensils :spatula) ;; new items gets added to front

(into utensils [:plate :glass :cup]) ;; seemingly in reverse because each gets added to front


;;; Vectors 

(def toys [:car :chair :truck])

(seq toys) ;; order is maintained

(conj toys :stuffy) ;; new item gets added at back

(into toys [:monkey :cookware :bike])


;;; Queue

(def q clojure.lang.PersistentQueue/EMPTY)

(seq (conj q :1 :2 :3))

;;; sorted maps

;;; sorted sets


;;; Simple todo example

;; (def todos (atom []))
;; (def todos (atom ()))
(def todos (atom clojure.lang.PersistentQueue/EMPTY))

(defn add-todo!
  "Adds a todo to the collection of todos"
  [todo]
  (swap! todos conj todo))

(do
  (add-todo! "buy eggs")
  (add-todo! "fry eggs")
  (add-todo! "eat eggs"))

(seq @todos)

(conj nil :a)

(assoc nil :a \a)
