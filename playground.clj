(def Point
  (fn [x y]
    {:x x
     :y y
     :__class_symbol__ 'Point}))

(def x :x)
(def y :y)

(def class-of :__class_symbol__)

(def shift
  (fn [this xinc yinc]
    (Point (+ (x this) xinc)
           (+ (y this) yinc))))

(shift (Point 2 4) 4 5)
