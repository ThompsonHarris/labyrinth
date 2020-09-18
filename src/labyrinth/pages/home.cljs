(ns labyrinth.pages.home
  (:require [labyrinth.components.lablist :refer [lablist]]
            [labyrinth.components.cast :refer [cast]]
            [labyrinth.components.header :refer [header]]))

(defn home
  []
  [:div {:class "flex flex-col self-center h-auto items-center justify-center sm:w-full w-5/6"}
   [header]
   [:div {:class "text-teal-400 text-3xl text-center uppercase bg-blue-100 font-bold rounded-lg border shadow-lg sm:p-10 p-0 w-full h-auto"} "Labyrinth"
    [lablist]]
   [:div {:class "text-teal-400 text-3xl text-center uppercase bg-blue-100 font-bold rounded-lg border shadow-lg sm:p-10 p-0 w-full h-auto"} "cast"
    [cast]]])