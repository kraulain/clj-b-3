(ns clj-b-3.usage-patterns.entity)

(def user
  {:name "John Doe"
   :address "Tamtamm weekend"
   :height 1.6
   :date-of-birth #inst "1999-07-18"})


(:name user)

(get user :height)

(assoc user :name "Jane Doe")


user
