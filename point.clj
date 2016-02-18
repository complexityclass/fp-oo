
(def make
  (fn [class & args]
    (let [allocated {}
          seeded (assoc allocated
                   :__class_symbol__ (:__own_symbol__ class))
          constructor (:add-instance-values
                        (:__instance_methods__ class))]
      (apply constructor seeded args))))


(def Point
{
    :__own_symbol__ 'Point
    :__instance_methods__
    {
      :add-instance-values
      (fn [this x y]
        (assoc this :x x :y y))

      :shift
      (fn [this xinc yinc]
        (make Point (+ (:x this) xinc)
                    (+ (:y this) yinc)))

      }
})
