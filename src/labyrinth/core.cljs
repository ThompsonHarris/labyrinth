(ns labyrinth.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [labyrinth.pages.home :refer [home]]))

;;connecting to a running repl server in the project
;; - Type: control + option + c twice to connect
;; - select shadow-cljas as the project type
;;  - add port to nRPEL, will be autofilled with one in the
;;  config file press enter
;;  - specify which build to connect to: choose :app build

;;Dom node
;; Hiccup Basscis
;; 1. Keyword/symbol
;; 1.1 keyword -> html tag
;; 1.2 symbol - component
;; 2 optional map of attributes
;; 3 string literals or child

(defn app
  []
  [:div.flex.justify-center.h-screen
   [:div.container.mx-auto.flex.flex-col.justify-center
    [home]]])

(def dom-node (js/document.getElementById "app"))

(defn ^:dev/after-load start []
  (rdom/render [app] dom-node))

(defn ^:export init []
  (start))

;; to execute type: control + option(alt) + c then space
;; (js/alert "connected to repl")
