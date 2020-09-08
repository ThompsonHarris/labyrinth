(ns labyrinth.components.lablist
  (:require [labyrinth.state :as state]))

(defn lablist
  []
  [:div {:class "text-black text-base"}

   [:div (for [{:keys [id firstname lastname actorname talent]} (vals @state/addams)]
           [:div {:key id :class "mt-3 mb-6"}
            [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "first name: "] [:div {:class "text-base text-gray-700"} firstname]]
            [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "last name: "] [:div {:class "text-base text-gray-700 "} lastname]]
            [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "actors name: "] [:div {:class "text-base text-gray-700 "} actorname]]
            [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "talent: "] [:div {:class "text-base text-gray-700 "} talent]]
            [:div {:class "w-auto self-center shadow bg-gray-400 hover:bg-teal-400 focus:shadow-outline focus:outline-none text-white font-bold py-2 px-2 rounded" :on-click (fn [] (swap! state/cast update id inc))} "+"]])]

   ;;[:div (map (fn [ele]
     ;;           [:div {:key (get ele :id) :class "mt-3 mb-6"}
       ;;          [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "first name: "] [:div {:class "text-base text-gray-700"} (get ele :firstname)]]
         ;;        [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "last name: "] [:div {:class "text-base text-gray-700 "} (get ele :lastname)]]
           ;;      [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "actors name: "] [:div {:class "text-base text-gray-700 "} (get ele :actorname)]]
             ;;    [:div.flex.flex-row.justify-start [:div {:class "text-xs text-gray-500 w-1/4 text-left"} "talent: "] [:div {:class "text-base text-gray-700 "} (get ele :talent)]]]) (vals @state/addams))]
   ])
