(ns labyrinth.components.cast
  (:require [labyrinth.state :as state]))

(defn cast
  []
  [:div
   (for [[id quant] @state/cast]
     [:div {:key id}
      [:div.flex.flex-row.justify-center
       [:div {:class "text-xs text-gray-500 w-1/4 text-left text-center"} (get-in @state/addams [id :firstname])]
       [:div {:class "text-base text-gray-700 w-1/4 text-center"} quant]
       [:div {:class "w-auto self-center shadow bg-red-200 hover:bg-teal-400 focus:shadow-outline focus:outline-none text-white text-xs rounded w-1/4 text-center cursor-pointer" :on-click (fn [] (swap! state/cast dissoc id))} "remove"]]])])