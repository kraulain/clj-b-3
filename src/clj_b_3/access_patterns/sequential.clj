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
